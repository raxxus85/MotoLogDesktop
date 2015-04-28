/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parse;

import engine.MotoGarageNotebookEngine;
import informationwindows.DialogType;
import java.util.List;
import org.json.JSONObject;
import org.parse4j.Parse;
import org.parse4j.ParseException;
import org.parse4j.ParseObject;
import org.parse4j.ParseQuery;
import org.parse4j.ParseUser;
import org.parse4j.callback.FindCallback;

/**
 *
 * @author Mark
 */
public class ParseEngine {
    private MotoGarageNotebookEngine motoGarageNotebookEngine;
    private String appId = "ijXu9OWAFfekiM8hFlLjrHa7A2BK3kWir8X1v5nM";
    private String restApiAppId ="sB8eqMDf5M8gyEzgkwJ8EzQRhYGaTeAbTPhfhTNE";
    
    public ParseEngine(MotoGarageNotebookEngine incomingMotoGarageNotebookEngine){
        this.motoGarageNotebookEngine = incomingMotoGarageNotebookEngine;
        Parse.initialize(appId, restApiAppId);
    }
    
    public ParseEngine(){
        Parse.initialize(appId, restApiAppId);
    }
    
    /**
     * Method to sing up a Parse.com user
     * @param userName, username which should be EMAIL 
     * @param password
     * @return ParseUser
     */
    public ParseUser signUpUser(String userName, String password){
        ParseUser user = new ParseUser();
        user.setUsername(userName);
        user.setEmail(userName);
        user.setPassword(password);       

        try {
            user.signUp();
            //user.save();
            //this.createGarage(user);
            //user = user.login(userName,password);
            //user.signUp()
            //user.save();
            //user.logout();                       
        } catch (ParseException ex) {
            //Logger.getLogger(TestClass.class.getName()).log(Level.SEVERE, null, ex);
            ex.printStackTrace();
            //this.motoGarageNotebookEngine.getDialogFactory().createDialogMessage(DialogType.WARNING_MESSAGE, ex.toString());
            if(ex.getCode() == 202){
                this.motoGarageNotebookEngine.getDialogFactory().createDialogMessage(DialogType.WARNING_MESSAGE, "Username " + userName + " is already taken! Please try another.");
            }
        }        
        return user;
    }
    
        /**
     * Method to sign in a Parse.com user
     * @param userName
     * @param password
     * @return ParseUser
     */
    public ParseUser signInUser(String userName,String password){
        ParseUser user = new ParseUser();
        user.setUsername(userName);
        //user.setEmail(email);
        user.setPassword(password);    
        try {
            //user.signUp();
            user = user.login(userName,password);
            System.out.println(user.getSessionToken().toString());
            //user.signUp()
            user.save();
            //this.createGarage(user);
            this.ensureUserHasGarage(user);
            //user.logout();      
            
        } catch (ParseException ex) {
            //Logger.getLogger(TestClass.class.getName()).log(Level.SEVERE, null, ex);
            ex.printStackTrace();
            //this.motoGarageNotebookEngine.getDialogFactory().createDialogMessage(DialogType.WARNING_MESSAGE, ex.toString());
            if(ex.getCode()==101){
                this.motoGarageNotebookEngine.getDialogFactory().createDialogMessage(DialogType.WARNING_MESSAGE, "Invalid login parameters. Either your username or password is incorrect");
            }

        }    
        return user;
    }
    
    
    public void ensureUserHasGarage(ParseUser user) throws ParseException{       
        ParseQuery<ParseObject> basicQuery = ParseQuery.getQuery("Garage");
        basicQuery.whereEqualTo("User", user);
        basicQuery.findInBackground(new FindCallback<ParseObject>() {
            public void done(List<ParseObject> garageList, ParseException e) {
                if (e == null) {
                    if(garageList == null || garageList.isEmpty()){
                        //return true;
                        System.out.println("0 garages found");
                        
                                // build out garage
                        //ParseObject garage = new ParseObject("Garage");
                        //garage.put("User", user);
                        //garage.save();
                        
                        return; // exit, as it's either null or 0, and it'll break...
                    }
                    System.out.println("Retrieved " + garageList.size() + " garages");
                    for (ParseObject garage : garageList) {
			System.out.println(garage.getObjectId());
                        //System.out.println(garage.getRelation("QicblXGx6a"));
                        JSONObject test = garage.getParseData();
                        System.out.println(test.toString());
                        //List testList = garage.getList("QicblXGx6a");
                        
                    }
                } else {
                    System.out.println("Error: " + e.getMessage());
                }
            }
        });
        System.out.println("WHOA WE HAVE : " + basicQuery.toString());
        //basicQuery.
        
    }
    
    public boolean createGarage(ParseUser incomingUser){
        // build out garage
        ParseObject garage = new ParseObject("Garage");
        garage.put("User", incomingUser);
        try{
            garage.save();
            return true;
        }catch (ParseException ex) {
            //Logger.getLogger(TestClass.class.getName()).log(Level.SEVERE, null, ex);
            ex.printStackTrace();
            return false;
        }
        
    }
    

}
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package objectmodels;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author Mark
 */
public class Customer implements Serializable{
    private String firstName;
    private String middleInitial;
    private String lastName;
    private String description;
    // attached info
    private ArrayList<Vehicle> vehicles = new ArrayList<Vehicle>();
    
    // CONSTRUCTORS
    
    public Customer(String incomingFirstName, String incomingMiddleInitial, String incomingLastName){
        this.firstName = incomingFirstName;
        this.middleInitial = incomingMiddleInitial;
        this.lastName = incomingLastName;
    }    
    
    public Customer(String incomingFirstName, String incomingMiddleInitial, String incomingLastName, String incomingDescription){
        this.description = incomingDescription;
        this.firstName = incomingFirstName;
        this.middleInitial = incomingMiddleInitial;
        this.lastName= incomingLastName;
    }
    
    // END CONSTRUCTORS
    public String getFirstName(){
        return this.firstName;
    }
    
    public void setFirstName(String incomingFirstName){
        this.firstName = incomingFirstName;
    }
    
    public String getMiddleInitial(){
        return this.middleInitial;
    }
    
    public void setMiddleInitial(String incomingMiddleInitial){
        this.middleInitial = incomingMiddleInitial;
    }
    
    public String getLastName(){
        return this.lastName;
    }
    
    public void setLastName(String incomingLastName){
        this.lastName = incomingLastName;
    }
    
    public String getDescription(){
        return this.description;
    }
    
    public void setDescription(String incomingDescription){
        this.description = incomingDescription;
    }
    
    public ArrayList<Vehicle> getVehicles(){
        return this.vehicles;
    }
    
    public void addVehicle(Vehicle incomingVehicle){
        this.vehicles.add(incomingVehicle);
    }
    
    public void removeVehicle(Vehicle incomingVehicle){
        this.vehicles.remove(incomingVehicle);
    }
    
    @Override
    public String toString() {
        return this.getFirstName() + " " + this.getMiddleInitial() + " " + this.getLastName();
  }
}
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myproject.manage;

/**
 *
 * @author filip
 */
public class Client {
    
    public int nif;
    public String name;
    public String address;
    public int phoneNumber;
    public String email;
    
    public Client(int nif, String name, String address, int phoneNumber, String email){
        this.nif = nif;
        this.name = name;
        this.address=address;
        this.phoneNumber=phoneNumber;
        this.email=email;
    }
    
    //Setters
    public void setNif (int nif){
        this.nif = nif;
    }
    
    public void setName (String name){
        this.name = name;
    }
    
    public void setAdress (String address){
        this.address=address;
    }
    
    public void setPhoneNumber (int phoneNumber){
        this.phoneNumber=phoneNumber;
    }
    
    public void setEmail (String email){
        this.email=email;
    }
    
    //Getters
    public int getNif (){
        return nif;
    }
    
    public String getName (){
        return name;
    }
    
    public String getAddress (){
        return address;
    }
    
    public int getPhoneNumber (){
        return phoneNumber;
    }
    
    public String getEmail (){
        return email;
    }
    
    
}
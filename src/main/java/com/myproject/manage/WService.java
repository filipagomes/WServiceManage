package com.myproject.manage;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.HashSet;
import java.util.Iterator;
import javax.jws.*;
import javax.jws.soap.*;
import javax.jws.soap.SOAPBinding.Style;

/**
 *
 * @author filip
 */
@WebService(serviceName = "WService", targetNamespace ="WService")
@SOAPBinding(style=Style.DOCUMENT)	
public class WService {
    
    Service service = new ServiceImp();

    /**
     * This is a sample web service operation
     */
    //public void WService (){}
    
    @WebMethod(operationName = "insertClient")
    public boolean insertClient(@WebParam(name = "nif") int nif, @WebParam(name = "name") String name, @WebParam(name = "address") String address, @WebParam(name = "phoneNumber") int phoneNumber, @WebParam(name = "email") String email) {
        boolean aux = service.insertClient(nif,name,address,phoneNumber,email);
        return aux;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "deleteClient")
    public boolean deleteClientNif(@WebParam(name = "nif") int nif) {
        boolean aux = service.deleteClientNif(nif);
        //TODO write your implementation code here:
        return aux;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "listClientsName")
    public String listClientsName(@WebParam(name = "name") String name) {
        HashSet<Client> auxiliar;
        String aux="";
        //auxiliar = queries.listClients();
        auxiliar = service.listClientsName(name);
        Iterator<Client> it = auxiliar.iterator();
        while(it.hasNext()){
            Client c = it.next();
            String nameaux = c.getName();
            String address = c.getAddress();
            int phoneNumber = c.getPhoneNumber();
            String email = c.getEmail();
            aux += "Name: "+nameaux+" ; address: "+address+" ; phone number: "+phoneNumber+" ; email: "+email+"\n";
     }
        //auxiliar = queries.listClients();
        
        return aux;

    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "listClientNif")
    public String listClientNif(@WebParam(name = "nif") int nif) {
        HashSet<Client> auxiliar;
        
        auxiliar=service.listClientNif(nif);
        String aux="";
        Iterator<Client> it = auxiliar.iterator();
        while(it.hasNext()){
            Client c = it.next();
            String name = c.getName();
            String address = c.getAddress();
            int phoneNumber = c.getPhoneNumber();
            String email = c.getEmail();
            aux = "Name: "+name+" ; address: "+address+" ; phone number: "+phoneNumber+" ; email: "+email;
     }
        //select * from clientinfo where nif = '1';
        return aux;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "listClients")
    public String listClients() {
        HashSet<Client> auxiliar;
        String aux="";
        //auxiliar = queries.listClients();
        auxiliar = service.listClients();
        Iterator<Client> it = auxiliar.iterator();
        while(it.hasNext()){
            Client c = it.next();
            int nif = c.getNif();
            String name = c.getName();
            String address = c.getAddress();
            int phoneNumber = c.getPhoneNumber();
            String email = c.getEmail();
            aux += "Nif: "+nif+" ; Name: "+name+" ; address: "+address+" ; phone number: "+phoneNumber+" ; email: "+email+"\n";
     }
        return aux;

    }
    
    
    
    
}

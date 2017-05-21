/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myproject.manage;

import java.util.HashSet;

/**
 *
 * @author filip
 */ 

public interface Service {
   boolean insertClient(int nif, String name, String address, int phoneNumber, String email);
   HashSet<Client> listClientNif(int nif);   
   boolean deleteClientNif(int nif);
   HashSet<Client> listClients();
   HashSet<Client> listClientsName(String nameAux);
}

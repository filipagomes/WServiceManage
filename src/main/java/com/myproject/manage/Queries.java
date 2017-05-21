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
public interface Queries {
    public boolean insertClient(int nif, String name, String address, int phoneNumber, String email);
    public HashSet<Client> listClientNif(int nif);   
    public boolean deleteClientNif(int nif);
    public HashSet<Client> listClients();
    public HashSet<Client> listClientsName(String nameAux);
}

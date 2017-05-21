/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myproject.manage;

import java.sql.*;
import java.util.HashSet;

/**
 *
 * @author filip
 */
public class ServiceImp implements Service {

    Queries queries = new QueriesImp();


    public boolean insertClient(int nif, String name, String address, int phoneNumber, String email) {
        boolean result = queries.insertClient(nif, name, address, phoneNumber, email);
        return result;
    }

    public boolean deleteClientNif(int nif) {
        //delete from clientinfo where nif=3;
        boolean result = false;
        result = queries.deleteClientNif(nif);
        return result;
    }

    public HashSet<Client> listClients() {
        HashSet<Client> auxiliar = new HashSet<Client>();
        ResultSet rs = null;
        //auxiliar = queries.listClients();
        auxiliar = queries.listClients();
        System.out.println(auxiliar.size());
        return auxiliar;

    }

    public HashSet<Client> listClientsName(String nameAux) {
        HashSet<Client> auxiliar = new HashSet<Client>();
        ResultSet rs = null;
        auxiliar = queries.listClientsName(nameAux);
        return auxiliar;

        //devolve ResultSet
    }

    public HashSet<Client> listClientNif(int nif) {
        HashSet<Client> auxiliar = new HashSet<Client>();
        boolean rs = false;
        String name = null;
        ResultSet data = null;

        auxiliar = queries.listClientNif(nif);
        System.out.println(data);
        //select * from clientinfo where nif = '1';
        return auxiliar;

        //devolve RS
    }
}

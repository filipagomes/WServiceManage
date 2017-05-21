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
public class QueriesImp implements Queries {

    static Connection connection = null;

    
    public void connect(){
    
     try {
            Class.forName("org.postgresql.Driver");
        } catch (ClassNotFoundException e) {
            return;
        }
        try {
            connection = DriverManager.getConnection(
                    "jdbc:postgresql://127.0.0.1:5432/clients", "postgres", "postgres");
        } catch (SQLException e) {
        }
        

    }
    @Override
    public boolean insertClient(int nif, String name, String address, int phoneNumber, String email) {
        
        connect();
        

        try {
            Statement sq_stmt = connection.createStatement();
            String sql_str = "insert into clientinfo values (" + nif + ",'" + name + "','" + address + "'," + phoneNumber + ",'" + email + "');";
            sq_stmt.execute(sql_str);
        } catch (SQLException e) {
        }
        boolean result = true;
        return result;
    }

    @Override
    public boolean deleteClientNif(int nif) {
        connect();
        boolean result = false;

        try {
            Statement sq_stmt = connection.createStatement();
            String sql_str = "delete from clientinfo where nif=" + nif + ";";
            sq_stmt.executeQuery(sql_str);
        } catch (SQLException e) {
            return result;
        }
        result = true;
        return result;
    }

    @Override
    public HashSet<Client> listClients() {
        connect();
        HashSet<Client> auxiliar = new HashSet<Client>();
        ResultSet rs = null;
        try {
            Statement sq_stmt = connection.createStatement();
            String sql_str = "Select * from clientinfo";

            rs = sq_stmt.executeQuery(sql_str);

            while (rs.next()) {
                auxiliar.add(new Client(rs.getInt("nif"), rs.getString("name"), rs.getString("address"), rs.getInt("phonenumber"), rs.getString("email")));
            }
        } catch (SQLException e) {
            return auxiliar;
        }
        System.out.println(auxiliar.size());
        return auxiliar;

    }

    public HashSet<Client> listClientsName(String nameAux) {
        connect();
        HashSet<Client> auxiliar = new HashSet<Client>();
        ResultSet rs = null;
        try {
            Statement sq_stmt = connection.createStatement();
            String sql_str = "Select * from clientinfo where name='" + nameAux + "';";

            rs = sq_stmt.executeQuery(sql_str);

            while (rs.next()) {
                auxiliar.add(new Client(rs.getInt("nif"), rs.getString("name"), rs.getString("address"), rs.getInt("phonenumber"), rs.getString("email")));
            }
        } catch (SQLException e) {
            return auxiliar;
        }
        return auxiliar;
    }

    @Override
    public HashSet listClientNif(int nif) {
        connect();
        HashSet<Client> auxiliar = new HashSet<Client>();
        ResultSet data;
        try {
            Statement sq_stmt = connection.createStatement();
            String sql_str = "select * from clientinfo where nif=" + nif + ";";
            data = sq_stmt.executeQuery(sql_str);
            if (!data.isBeforeFirst()) {
                System.out.println("not found");
            } else {
                while (data.next()) {
                    auxiliar.add(new Client(data.getInt("nif"), data.getString("name"), data.getString("address"), data.getInt("phonenumber"), data.getString("email")));
}
            }
        } catch (SQLException e) {
            return auxiliar;
        }

        return auxiliar;

    }
}

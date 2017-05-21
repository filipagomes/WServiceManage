/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myproject.manage;

import org.junit.*;
import static org.junit.Assert.*;

/**
 *
 * @author filip
 */
public class WServiceTest {
    
    public WServiceTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of insertClient method, of class WService.
     */
    @Test
    public void testInsertClient() {
        System.out.println("insertClient");
        int nif = 2;
        String name = "Filipa";
        String address = "Rua Lino";
        int phoneNumber = 1234;
        String email = "teste@teste";
        WService instance = new WService();
        boolean expResult = true;
        boolean result = instance.insertClient(nif, name, address, phoneNumber, email);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deleteClientNif method, of class WService.
     */
    @Test
    public void testDeleteClientNif() {
        System.out.println("deleteClientNif");
        int nif = 2;
        WService instance = new WService();
        boolean expResult = true;
        boolean result = instance.deleteClientNif(nif);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of listClientsName method, of class WService.
     */
    @Test
    public void testListClientsName() {
        System.out.println("listClientsName");
        String name = "Filipa Gomes";
        WService instance = new WService();
        String expResult = "Name: Filipa Gomes ; address: VNF ; phone number: 911 ; email: hello@hello ";
        String result = instance.listClientsName(name);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of listClientNif method, of class WService.
     */
    @Test
    public void testListClientNif() {
        System.out.println("listClientNif");
        int nif = 1;
        WService instance = new WService();
        String expResult = "Name: Filipa Gomes ; address: VNF ; phone number: 911 ; email: hello@hello";
        String result = instance.listClientNif(nif);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of listClients method, of class WService.
     */
    @Test
    public void testListClients() {
        System.out.println("listClients");
        WService instance = new WService();
        String expResult = "Nif: 1 ; Name: Filipa Gomes ; address: VNF ; phone number: 911 ; email: hello@hello ";
        String result = instance.listClients();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}

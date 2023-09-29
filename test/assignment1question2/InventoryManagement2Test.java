/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment1question2;

import static assignment1question2.InventoryManagement.id;
import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Sami
 */
public class InventoryManagement2Test {
    
    public InventoryManagement2Test() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

     /*
    ******************************************************************************************
    ******************************************************************************************
     //TO PASS THESE TESTS DONT ENTER ANYTHING JUST CLICK OK REPEATEDLY.
    ******************************************************************************************
    ******************************************************************************************
    */
    
    
    @Test
    public void testGetId() {
        System.out.println("getId");
        ArrayList<Integer> expResult = new ArrayList<>();
        ArrayList<Integer> result = InventoryManagement.getId();
        assertEquals(expResult, result);
  
    }

    @Test
    public void testGetName() {
        System.out.println("getName");
        ArrayList<String> expResult = new ArrayList<>();
        ArrayList<String> result = InventoryManagement.getName();
        assertEquals(expResult, result);
    }

    @Test
    public void testGetDescription() {
        System.out.println("getDescription");
        ArrayList<String> expResult = new ArrayList<>();
        ArrayList<String> result = InventoryManagement.getDescription();
        assertEquals(expResult, result);

    }

    @Test
    public void testGetPrice() {
        System.out.println("getPrice");
        ArrayList<Double> expResult = new ArrayList<>();
        ArrayList<Double> result = InventoryManagement.getPrice();
        assertEquals(expResult, result);

    }

    @Test
    public void testGetQuantity() {
        System.out.println("getQuantity");
        ArrayList<Integer> expResult = new ArrayList<>();
        ArrayList<Integer> result = InventoryManagement.getQuantity();
        assertEquals(expResult, result);
    }

    @Test
    public void testWelcomeMessage() {
        System.out.println("welcomeMessage");
        InventoryManagement instance = new InventoryManagement();
        instance.welcomeMessage();

    }

    @Test
    public void testMenu() {
        System.out.println("Menu");
        InventoryManagement instance = new InventoryManagement();
        instance.Menu();
    }

    @Test
    public void testAddItems() {
        System.out.println("addItems");
        InventoryManagement instance = new InventoryManagement();
        instance.addItems();
        
        int expResult = 1; 
        int actualResult = instance.addItems();
        
        assertEquals(expResult, actualResult); 
    }

    @Test
    public void testDeleteItems() {
        System.out.println("deleteItems");
        InventoryManagement instance = new InventoryManagement();
        instance.deleteItems();
        
        boolean expResult = true; 
        boolean actualResult = instance.deleteItems();
        
        assertEquals(expResult, actualResult);
    }

    @Test
    public void testUpdateProduct() {
        System.out.println("updateProduct");
        InventoryManagement instance = new InventoryManagement();
        instance.updateProduct();
        
        boolean expResult = true; 
        boolean actualResult = instance.updateProduct();
        
        assertEquals(expResult, actualResult); 
    }

    @Test
    public void testDisplayItems() {
        System.out.println("displayItems");
        InventoryManagement instance = new InventoryManagement();
        instance.displayItems();
        
        String expResult = "Product information" + "\n" 
                                                                            + "product ID: " + 1 + "\n"
                                                                            + "product Name: " + "Fish fingers" + "\n"
                                                                            + "product Description: " + "Tasty snack for family" + "\n"
                                                                            + "product Price: " + 30.00 + "\n"
                                                                            + "productQuantity: " + 50;
        
        String actualResult = instance.displayItems();
        assertEquals(expResult, actualResult);
    }

    @Test
    public void testCalcAmtItems() {
        System.out.println("calcAmtItems");
        InventoryManagement instance = new InventoryManagement();
        instance.calcAmtItems();
    }
    
}

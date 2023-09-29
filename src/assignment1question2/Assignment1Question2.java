/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment1question2;

/**
 *
 * @author Sami
 */
public class Assignment1Question2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        InventoryItem iv = new InventoryItem(); 
        InventoryManagement im = new InventoryManagement(); //instantiating objects
           
        im.welcomeMessage(); //calling welcome message
        im.Menu();  //calling menu 
    }
    
}

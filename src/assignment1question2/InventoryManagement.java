/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment1question2;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Sami
 */
//child class
public class InventoryManagement extends InventoryItem {
   
    //declaring arrayLists
    final static ArrayList <Integer> id = new ArrayList<>();  
    final static ArrayList <String> name = new ArrayList<>(); 
    final static ArrayList <String> description = new ArrayList<>(); 
    final static ArrayList <Double> price = new ArrayList<>(); 
    final static ArrayList <Integer> quantity = new ArrayList<>(); 

    //getters for testing purposes
    public static ArrayList<Integer> getId() {
        return id;
    }

    public static ArrayList<String> getName() {
        return name;
    }

    public static ArrayList<String> getDescription() {
        return description;
    }

    public static ArrayList<Double> getPrice() {
        return price;
    }

    public static ArrayList<Integer> getQuantity() {
        return quantity;
    }
    
    
    public InventoryManagement(int productID, String productName, String productDescription, double productPrice,  int productQuantity) {
        super(productID, productName, productDescription, productPrice, productQuantity);
    }
    
    //setting items to default values so it can be called in Main without the need for parameters
    public InventoryManagement() {
    super(0, "", "", 0.0, 0);
}
    
    public void welcomeMessage() {
                JOptionPane.showMessageDialog(null, "Welcome to Coolworths Inventory System!" + "\n"
                                                                         +    "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                                                                         
                JOptionPane.showMessageDialog(null, "Our inventory management system provides Coolworths with better stock " + "\n"  
                                                                                 + "visibilty to improve profitability"); 
                                    
    }
    
    //Menu method
    public void Menu() {
        
        //getting user input
       int userChoice = Integer.parseInt(JOptionPane.showInputDialog(null, "What would you like to do today?" + "\n" 
                                                                    + "(1) Add a product" + "\n"
                                                                    + "(2) Delete a product" + "\n"
                                                                    + "(3) Update product information" + "\n"
                                                                    + "(4) View product report" + "\n"
                                                                    + "(5) Calculate total amount of products" + "\n"
                                                                    + "(6) Exit")); 
       //switch
       switch(userChoice) {
           case 1: addItems();// break; 
           case 2: deleteItems();// break; 
           case 3: updateProduct();// break; 
           case 4: displayItems();//break
           case 5: calcAmtItems();// break; 
           case 6: System.exit(0); 
           default: System.exit(0); 
       }   
    }
   
    public int addItems () {
   
           //getting user input on items
            int prodID = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter product ID"));
            String prodName = JOptionPane.showInputDialog(null, "Enter product name");
            String prodDesc = JOptionPane.showInputDialog(null, "Enter product description");
            double prodPrice = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter product price"));
            int prodQuantity = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter product quantity"));
            
            //assigning items from parent class to user input
            this.productID = prodID;
            this.productName = prodName;
            this.productDescription = prodDesc;
            this.productPrice = prodPrice;
            this.productQuantity = prodQuantity;
                      
            //adding user input to ArrayLists
            id.add(prodID);
            name.add(prodName); 
            description.add(prodDesc);
            price.add(prodPrice);
            quantity.add(prodQuantity);
            
            //confirmation message
            JOptionPane.showMessageDialog(null, "Items have been added successfully!");
            Menu();
   return prodID; 
    }
    
    public boolean deleteItems() {
        //getting user input
        int inputID = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter ID of product you wish to delete")); 
        
        boolean flag = false; 
        
        //for loop
        for (int i = 0; i < id.size(); i++) {
            //if input matches ID in arrayList then
            if (inputID == id.get(i)) {
                 int confirm = JOptionPane.showConfirmDialog(null, "Are you sure you want to delete this product?"); //confirmation message
                 if (confirm == JOptionPane.YES_OPTION) {  //if they click yes 
                    id.remove(i);  //remove all the details
                    name.remove(i);
                    description.remove(i);
                    price.remove(i);
                    quantity.remove(i);
                    JOptionPane.showMessageDialog(null, "Product has been deleted successfully"); //confirmation message
                    flag = true; 
                    Menu(); //go back to menu
                } else {
                     if (confirm == JOptionPane.NO_OPTION) { //if they click no
                         flag = false; 
                         Menu(); //go back to menu
                     } else {
                         if (confirm == JOptionPane.CANCEL_OPTION) { //if they click cancel
                             flag = false; 
                             Menu(); //go back to menu
                         } else {
                             flag = false;
                             Menu(); //if they click anything else, go to menu
                         }
                     }
                 }
            }
        }
        return flag;
    }
    
    public boolean updateProduct() {
        
        //declaring variables
        String newName, newDesc;
        double newPrice; 
        int newQuantity;
     
         // getting user input
         int inputID = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter ID of product you want to update"));

         // flag to check if the product with the given ID was found
         boolean productFound = false;

         // for loop to find the product with the matching ID
        for (int i = 0; i < id.size(); i++) {
             if (inputID == id.get(i)) {
            // allowing user to enter new values
             newName = JOptionPane.showInputDialog(null, "Enter new name of product");
             newDesc = JOptionPane.showInputDialog(null, "Enter new description of product");
             newPrice = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter new price of product"));
             newQuantity = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter new quantity of product"));

            // updating the values in the ArrayLists
            name.set(i, newName);
            description.set(i, newDesc);
            price.set(i, newPrice);
            quantity.set(i, newQuantity);

            // confirmation message
            JOptionPane.showMessageDialog(null, "Product details have been updated successfully!");

            // setting flag to true to indicate that the product was found and updated
            productFound = true;

            // breaking out of the loop since ID found and updated the product
            break;
        }
    }

    // if the product not found error message is displayed
    if (!productFound) {
        JOptionPane.showMessageDialog(null, "Product with ID " + inputID + " does not exist!");
        productFound = false;
    }

    // back to the menu
    Menu();
 
    return productFound;
    }
    
    public String displayItems() {
        String info = null; 
        for (int i = 0; i < id.size(); i++) {
         info =  "Product information" + "\n" 
                                                                            + "product ID: " + id.get(i)+ "\n"
                                                                            + "product Name: " + name.get(i)+ "\n"
                                                                            + "product Description: " + description.get(i)+ "\n"
                                                                            + "product Price: " + price.get(i)+ "\n"
                                                                            + "product Quantity: " + quantity.get(i);
    }
        Menu();
        return info;
    }
    
    //overriding method from parent class
    @Override
    public void calcAmtItems() {
        
        int totalItems = 0;
        for (Integer id1 : id) {
            totalItems++; 
        }
        JOptionPane.showMessageDialog(null, "Total amount of products: " + totalItems);
        Menu(); 
    }
    
}

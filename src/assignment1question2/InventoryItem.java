/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment1question2;

//parent class
public class InventoryItem {
    protected int productID;    //information hiding, declaring variables
    protected String productName; 
    protected String productDescription;
    protected double productPrice; 
    protected int productQuantity; 

    //creating constructor
    public InventoryItem(int productID, String productName, String productDescription, double productPrice,  int productQuantity) {
        this.productID = productID;
        this.productName = productName;
        this.productDescription = productDescription;
        this.productPrice = productPrice;
        this.productQuantity = productQuantity;
    }
    
    //setting default values to items so it can be called in Main without the need for parameters
    public InventoryItem() {
    this.productID = 0;
    this.productName = "";
    this.productDescription = "";
    this.productPrice = 0.0;
    this.productQuantity = 0;
}
    
   public void calcAmtItems() {
       int totalItems = 0;
       totalItems++; 
   } 
}

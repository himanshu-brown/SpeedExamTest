import java.util.*;
import java.io.*;

class Employee{
    private String name;
    private int age;
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setAge(String age){
        this.age = age;
    }
    public int getAge(){
        return age;
    }
}

class VegetableBill{
    
    VegetableBill(Employee clerk){
        
    }
    
    public void add(Item i){
        
    }
    
    public double getTotal(){
        
    }
    
    public void printReceipt(){
        
    }
    
}

class DiscountBill extends VegetableBill{
    private int discountItem;
    private double discount;
    private boolean preferred;
    
    public DiscountBill(Employee clerk, boolean preferred){
        super(clerk);
        this.preferred = preferred;
        discount = 0.0;
        discountItem = 0;
    }
    
    public void add(Item i){
        super.add(i);
        if(i.getDiscount>0 && preferred){
            discountItem++;
            discount += i.getDiscount();
        }
    }
    
    public int getDiscountCount(){
        return discountItem;
    }
    
    public double getTotal(){
        return super.getTotal() - discount;
    }
    
    public double getDiscountPercent(){
        return discount*100/super.getTotal();
    }
    
}

class Item{
    private String name;
    private double price,discount;
    public void setPrice(double price){
        this.price = price;
    }
    public double getPrice(){
        return price;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    
    public double getDiscount(){
        return discount;
    }
    public void setDiscount(double discount){
        this.discount=discount;
    }
    
}

public class VegetableBill
{
	public static void main(String[] args) {
		System.out.println("Hello World");
	}
}

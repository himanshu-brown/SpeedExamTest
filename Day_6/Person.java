import java.util.*;
import java.io.*;
import java.lang.*;

class Vechicle{
    String colour;
    String model;
    Vechicle(String colour, String model){
        this.colour = colour;
        this.model = model;
    }
   public Vechicle(){

    }
}

class Bike extends Vechicle{
    Bike(String colour, String model){
        this.colour=colour;
        this.model=model;
    }
    void getter(){
        System.out.print(this.colour+" "+this.model);
    }
}

class BMW extends Vechicle{
    BMW(String colour, String model){
        this.colour = colour;
        this.model = model;
    }
}

public class Person {
    Vechicle vechicle;
    public String name;
    public static void main(String[] args){
        Person p=new Person();
        p.name="Himanshu";
        System.out.println(p.name);
        Bike bike = new Bike("Red","15");
        bike.getter();
    }
}

package Checkpoint2;

import java.util.Date;
import java.util.ArrayList;

public class Arraylist {
    public static void main(String[] args) {
        ArrayList<Object> List = new ArrayList<Object>();

         List.add(new loan(500));
         List.add(new Date());
         List.add("ABC");
         List.add(new Circle(15));

            for(Object list : List){
                System.out.println(list);
        }
    }   
}
class loan {
    private double loan;

    public loan(){
    }
    public loan(double amount){
        loan = amount;
    }
    public String toString(){
        return ("Loan Amount : " + loan);
    }
}

class Circle{
    private double radius;

    public Circle(){

    }
    public Circle(double radius){
        this.radius = radius;
    }
    public double GetArea(){
        return Math.PI * Math.pow(radius,2);
    }
    public String toString(){
        return ("Area is : " + GetArea());
    }
    
}

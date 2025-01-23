package Checkpoint1;

import java.lang.reflect.Array;

public class Publication {

        private String Publisher;
        private int Pages ;
        private Double Price;
        private String Title;

    public Publication(){

    }
    public Publication(String Publisher ,int Pages ,Double Price ,String Title){

        this.Publisher  = Publisher ;
        this.Pages      = Pages     ;
        this.Price      = Price     ;
        this.Title      = Title     ;

    }

    public String GetPublisher(){
        return Publisher;
    }
    public void SetPublisher(String Publisher){
        this.Publisher = Publisher;
    }

    public int GetPages(){
        return Pages;
    }
    public void SetPages(int Pages){
        this.Pages = Pages;
    }

    public Double GetPrice(){
        return Price;
    }
    public void SetPrice(Double Price){
        this.Price = Price;
    }

    public String GetTitle(){
        return Title;
    }
    public void SetTitle(String Title){
        this.Title = Title;
    }
    public void print(){
            System.out.println("The " + GetPublisher() + " Pulishs " + GetTitle() + ", " + GetPages() + " Pages" 
            + ", " + GetPrice() + " Baths.");
        
    }
}

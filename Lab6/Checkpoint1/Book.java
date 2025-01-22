package Checkpoint1;

public class Book extends Publication {

    private String Author;

    public Book(){

    }
    public Book(String Publisher, int Pages, Double Price, String Title ,String Author){
        super(Publisher, Pages, Price, Title);
        this.Author = Author;
    }
    public String GetAuthor(){
        return Author;
    }
    public void SetAuthor(String Author){
        this.Author = Author;
    }
    @Override
    public String toString(){
        return super.toString() + "The " + GetPublisher() + " Pulishs " + GetTitle() + ", " + GetPages() + " Pages" 
        + ", " + GetPrice() + " Baths." + "\nThis Book has written by " + GetAuthor() ;
    }
    @Override
    public void print() {
        System.out.println(toString());
    }

}

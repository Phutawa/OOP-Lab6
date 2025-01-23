package Checkpoint1;

public class Book extends Publication {

    private String Author;

    public Book(){
        super();
        Author = "null";
    }

    public Book(String Author){
        super();
        this.Author = Author;

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
    public void print() {
        super.print();
        System.out.println("This Book has written by " + GetAuthor());
    }

}

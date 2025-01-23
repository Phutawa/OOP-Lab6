package Checkpoint1;

public class TestPublication {
    public static void main(String[] args) {
        Publication[] Publication = new Publication[10];

        Publication[0] = new Magazine("Mavel Comic",30,3.3 ,"Spiderman" ,"Monthly" );
        Publication[1] = new Magazine();
        Publication[2] = new Magazine("DC",30,3.0 ,"Aquaman" ,"weekly" );
        Publication[3] = new Book();
        Publication[4] = new Book("J.R.R Tolkein" );
        Publication[5] = new Book("Future of AI",200,40.4 ,"ROV" ,"Monthly" );
        Publication[6] = new Book("Future of AI",200,40.4 ,"Batman" ,"Monthly" );
        Publication[7] = new KidsMagazine();
        Publication[8] = new KidsMagazine("DC",30,3.0 ,"Antman" ,13 );
        Publication[9] = new KidsMagazine("Mavel Comic",20,9.4 ,"Iron man" ,18 );
        
            for(Publication pub : Publication){
                System.out.println();
                pub.print();
        }
    }
}

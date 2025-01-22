package Checkpoint1;

    public class Magazine extends Publication {
        
        private String Unit;

    public Magazine(){

    }
    public Magazine(String Publisher, int Pages, Double Price, String Title, String Unit) {
        super(Publisher, Pages, Price, Title); 
        this.Unit = Unit;
    }
    
    public String GetUnit(){
        return Unit;
    }
    public void SetUnit(String Unit){
        this.Unit = Unit;
    }
    @Override
    public String toString() {
        return super.toString() + "The " + GetPublisher() + " Pulishs " + GetTitle() + ", " + GetPages() + " Pages" 
        + ", " + GetPrice() + " Baths." + "\nThis Magazine is " + GetUnit() + " Print" ;
    }
    @Override
    public void print() {
        System.out.println(toString());
    }
}

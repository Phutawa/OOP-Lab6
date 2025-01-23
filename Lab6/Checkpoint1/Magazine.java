package Checkpoint1;

    public class Magazine extends Publication {
        
        private String Unit;

    public Magazine(){
        super();
        Unit = "null"; 
    }
    public Magazine(String Unit){
        super();
        this.Unit = Unit;
        
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
    public void print() {
        super.print();
        System.out.println("This Magazine is " + GetUnit() + " Print");
    }
}

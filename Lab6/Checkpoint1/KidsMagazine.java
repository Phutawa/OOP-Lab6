package Checkpoint1;

public class KidsMagazine extends Publication {
    
    private int AgeReccom;

    public KidsMagazine(){

    }
    public KidsMagazine(String Publisher, int Pages, Double Price, String Title ,int AgeReccom){
        super(Publisher, Pages, Price, Title);
        this.AgeReccom = AgeReccom;
    }
    public int GetAgeReccom(){
        return AgeReccom;
    }
    public void SetAgeReccom(int AgeReccom){
        this.AgeReccom = AgeReccom;
    }
    
    @Override
    public void print() {
        super.print();
        System.out.println("The rate ages to read This KidsMagazine is " + GetAgeReccom() + " Years");
    }
}

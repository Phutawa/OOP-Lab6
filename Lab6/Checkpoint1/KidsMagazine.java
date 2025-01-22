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
    public String toString(){
        return super.toString() + "The " + GetPublisher() + " Pulishs " + GetTitle() + ", " + GetPages() + " Pages" 
        + ", " + GetPrice() + " Baths." + "\nThe rate ages to read This KidsMagazine is " + GetAgeReccom() + " Years";
    }
    @Override
    public void print() {
        System.out.println(toString());
    }
}

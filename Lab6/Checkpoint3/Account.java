package Checkpoint3;
import java.util.Date;


public class Account {
    private int Id = 0 ;
    private double Balance = 0 ;
    private double annuallInterestRate = 0;
    private Date dateCreated;

    public Account(){

    }
    public Account(int Id ,double Balance ,double annuallInterestRate){
        this.Id = Id;
        this.Balance = Balance;
        this.annuallInterestRate = annuallInterestRate/100;
    }
    public Date GetDatecreate(){
        dateCreated = new Date();
        return dateCreated;
    }
    public double GetMonthlyInterRate(){
        return annuallInterestRate/12;
    }
    public void SetMonthlyInterRate(double Balance){
        this.Balance = Balance;
    }
    public double GetMonthlyInterest(){
        return Balance*GetMonthlyInterRate() ;
    }
    public void withdraw(double amount){
        Balance = Balance - amount;
    }
    public void deposit(double amount){
        Balance = Balance + amount;
    }
    public double TotalBalance(){
        return Balance + GetMonthlyInterest();
    }
    public double Balance(){
        return Balance;
    }
    public static void main(String[] args) {
        Account Customer1 = new Account(1122,20000,4.5);
        Customer1.withdraw(2500);
        Customer1.deposit(3000);
        System.out.println("Total Balance : " + Customer1.TotalBalance());
        System.out.println("The Balance : " + Customer1.Balance);
        System.out.println("The MonthlyInterest : " + Customer1.GetMonthlyInterest());
        System.out.println("The Datecreate : " + Customer1.GetDatecreate());
    }
}

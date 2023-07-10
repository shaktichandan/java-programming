import java.util.Scanner;
import java.util.jar.Attributes.Name;

class account{
    private int bal;
    public account(int bal)
    {
      this.bal=bal;   
    }
    public boolean suffb(int w){
       if(bal>w) 
       return(true);
       else
       return(false);
    }
    public void withdraw(int amt){
        bal=bal-amt;
        System.out.println("Withdrawl money is "+amt);
        System.out.println("Your current balance is "+bal);
    }
}
class Customer implements Runnable{
    private account acc;
    public Customer(account acc,String n){
        this.acc=acc;
       nam=n;
    }
    public void run(){
        Scanner kb=new Scanner(System.in);
        System.out.println("Enter amount to withdraw ");
        int amt=kb.nextInt(); 
        if(acc.suffb(amt)){
            acc.withdraw(amt);
        }
        else
        System.out.println("Insufficent balanace");
    }
}
public class Threadsyncronise {
    public static void main(String[] args) {
       account obj=new account(1000);
       Customer obj2=new Customer(obj,"Raj"),obj3=new Customer(obj,"simran");
       Thread t1=new Thread(obj2);
       Thread t2=new Thread(obj3); 
       t1.start();
       t2.start();
    }
}

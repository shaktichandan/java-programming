class test implements Runnable{
public void run(){
    System.out.println("singh is king ");
}}
class test2 implements Runnable{
    public void run(){
        int i=1;
        while(i<10){
            System.out.println("Looking forward");
            i++;
        }
        
    }
}

public class Threadrunnable2 {
    public static void main(String[] args) {
        test obj=new test();
        Thread a=new Thread(obj);
        a.start();
        test2 obj2=new test2();
        Thread b=new Thread(obj2);
        b.start();
    }
}

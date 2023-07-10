 class Test implements Runnable{
    public void run(){
        System.out.println("Thread is running ");
        System.out.println("Thread is running2 ");
    }

 }
 class Test2 implements Runnable{
    public void run(){int i=1;
        while(i<10){
            System.out.println("Omm SAiram");
            i++;
        }
    }
 }
public class Threadmethod {
    public static void main(String[] args) {
        Test obj=new Test();
        Thread t1=new Thread(obj);
        t1.start();
        try {
            t1.join();
        } catch (InterruptedException e) {
            System.out.println(e);
           
        }
        Test2 obj2=new Test2();
        Thread t2=new Thread(obj2);
        t2.start();
    }
}

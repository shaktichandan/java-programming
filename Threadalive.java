class Test implements Runnable{
    public void run(){
       
        try{int a=10,b=6,c,d;
            c=a+b;
            System.out.println("Sum is "+c);
            d=a-b;
            System.out.println("Difference is "+d);
            Thread.sleep(10);
        }
        catch(InterruptedException e){
            System.out.println(e);
        }
    }
}
public class Threadalive {
    public static void main(String[] args) {
        Test obj=new Test();
        Thread t=new Thread(obj);
      t.isAlive();
        System.out.println(t.isAlive());
        t.start();
    }
}

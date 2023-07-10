class test implements Runnable{
    Thread t;
    String tnm ,msg;
   // object r;
   // test obj;
    test (String nm,String m){
        tnm=nm;msg=m;
        
        t= new Thread(this,tnm);
        t.start();
    }
      public synchronized void run(){
        System.out.println("[");
        try{
            System.out.println(msg);
            Thread.sleep(500);
        }
        catch(InterruptedException e){
            System.out.println(e);
        }
        System.out.println("]");
    }
}
public class Threadsyncroclass {
    public static void main(String[] args) {
       // test obj=new test();
        test obj1=new test("one", "Hello");
        test obj2=new test("two", "world");
        test obj3=new test("three", "syncronise");
        try{
            Thread.sleep(10000);
            obj1.t.join();
            obj2.t.join();
            obj3.t.join();
        }catch(InterruptedException e){
            System.out.println(e);
        }
        System.out.println("main tread terminated ");

    }
}

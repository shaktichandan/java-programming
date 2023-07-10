class test implements Runnable{
    Thread t; String tnm;
    Object r1,r2;

test(String nm,Object p,Object q){
    tnm=nm;
    r1=p;
    r2=q;
    t=new Thread(this,tnm);
    t.start();
    
}
public void run(){
    synchronized(r1){
        try{
            System.out.println(tnm+"Thread has r1 ");
            Thread.sleep(500);
        }catch(InterruptedException e){
            System.out.println(tnm+e);
        }
    }System.out.println(tnm+" Thread waiting for r2");

synchronized(r2){
    try{
        System.out.println(tnm+"Thread has r1 and r2");
        Thread.sleep(500);
    }catch(InterruptedException e){
        System.out.println(tnm+"Interrupted");
    }System.out.println(tnm+"Thread terminated");
}}

}
public class Deadlock {
    public static void main(String[] args) {
        Object p1=new Object();
        Object p2=new Object();
        test t1=new test("t1", p1, p2);
        try{
            Thread.sleep(10000);
            t1.t.join();
        }
        catch(InterruptedException e){
            System.out.println("innterupted");
        }System.out.println("main terminated");
    }
}

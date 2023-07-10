
class Test implements Runnable{
    Thread t;
    String nm;
    public Test(String tnm){
        nm=tnm;
        t= new Thread(this,tnm);
        t.start();
    }
    public void run(){
        String ab=(String)Thread.currentThread().getName();
        try{
            for(int i=0;i<10;i++){
                if(i%2==0){
                    System.out.println("even Number "+i);
                }Thread.sleep(500);
            }
        }catch(InterruptedException e){
            System.out.println(e+"interrupted "+ab);

        }System.out.println("Terminated "+ab);
    }
}
class test2 implements Runnable{
    Thread t1;
    String nm;
    public test2(String tnm){
        nm=tnm;
        t1=new Thread(this,tnm);
        t1.start();
    }
    public void run(){
        String ab=(String)Thread.currentThread().getName();
        try{
            for(int i=0;i<10;i++){
                if(i%2!=0){
                    System.out.println("odd number is"+i);
                }Thread.sleep(100);
            }
        }catch(InterruptedException e){
            System.out.println("Interrupted"+ab);
        }System.out.println("Terminated"+ab);
    }
}
public class threadevenodd {
    public static void main(String[] args) {
        
    
    Test obj=new Test("one");
    test2 obj1=new test2("two");
}}

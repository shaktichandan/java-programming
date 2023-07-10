class thread1 implements Runnable{
    Thread t;
    String tnm;
    thread1(String nm){
       tnm=nm;
       t= new Thread(this,tnm);
       t.start(); 
    }
    public void run(){
        String ab=(String)Thread.currentThread().getName();
        try {
            for(int i=0;i<10;i++){
                if(i%2==0)
                {
                    System.out.println(ab+" Even value is "+i);
                }
                Thread.sleep(500);
            }
        }
         catch(InterruptedException ie){
            System.out.println(ab+"interrupted ");
        }
        System.out.println(ab+" terminated");
    }
}
class thread2 implements Runnable{
    Thread t1;
    String tnm;
    thread2(String nm){
        tnm=nm;
       t1= new Thread(this,tnm);
       t1.start(); 
    }
    public void run(){
        String ab=(String)Thread.currentThread().getName();
        try {
            for(int i=0;i<10;i++){
                if(i%2!=0)
                {
                    System.out.println(ab+" odd value is "+i);
                }
                    Thread.sleep(500);
                
            }
        } 
        catch(InterruptedException ie){
            System.out.println(ab+"interrupted ");
        }
        System.out.println(ab+" terminated");
    }
}
public class threadclassproblem {
    public static void main(String[] args) {
        thread1 obj=new thread1("one");
        thread2 obj2=new thread2("Two");
       /*try{
            for(int j=0;j<10;j++){
                System.out.println("Main execution value is "+j);
                Thread.sleep(100);
            }
        }
        catch(InterruptedException e){
            System.out.println("main interrupted");
        }System.out.println("main terminated");*/
    } 
}

class threadD implements Runnable{
    Thread t;
    String tnm;
    threadD(String nm){
        tnm=nm;
        t=new Thread(this,tnm);
        t.start();
    }
    public void run(){
        String tp=(String)Thread.currentThread().getName();
        try{
            if (tp.equals("one"))
            {
            for(int i=0;i<10;i++){
                 if(i%2==0)
                 {
                    System.out.println(tp+"excuting value is"+i);
                    Thread.sleep(500);
                 }
            }
        }
            if (tp.equals("two")){
            for(int i=0;i<10;i++){
                 if(i%2!=0)
                 {
                    System.out.println(tp+"excuting value is"+i);
                    Thread.sleep(500);
                 }
        }
    }
}
        catch(InterruptedException ie){
           System.out.println(tp+"interrupted");
        }
        System.out.println(tp+"terminated");
    }
}
public class test1{
    public static void main(String args[]){
        threadD t1=new threadD("one");
        threadD t2=new threadD("two");
        try{
            for(int i=0;i<10;i++){
                System.out.println("main executing value is"+i);
                Thread.sleep(1000);
            }
        }
            catch(InterruptedException ie){
                System.out.println("main interrupted");
            }
            System.out.println("main terminated");
        
    }
}
    


    



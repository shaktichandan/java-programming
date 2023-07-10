class Table{  
    synchronized void printTable(int n){//synchronized method  
      for(int i=1;i<=5;i++){  
        System.out.println(n*i);  
        try{  
         Thread.sleep(400);  
        }catch(Exception e){System.out.println(e);}  
      }  
     
    }  
   }  
     
   class MyThread1 extends Thread{  
   Table t;  
   MyThread1(Table a){  
    t=a;  
}  
public void run(){  
t.printTable(5);  
}  
  
}  
class MyThread2 extends Thread{  
Table t;  
MyThread2(Table b){  
t=b;  
}  
public void run(){  
t.printTable(100);  
}  
} 
public class Threadsynmethodjavatpoint {
    public static void main(String args[]){  
        Table t = new Table();//only one object  
        MyThread1 t1=new MyThread1(t);  
        MyThread2 t2=new MyThread2(t);  
        t1.start();  
        t2.start();  
        } 
}

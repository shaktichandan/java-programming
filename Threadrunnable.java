class Test implements Runnable{
    public void run(){ int i=0;
        while( i<10){
        System.out.println("Thread is in runnable");
        i++;
    }
}
}
class Liza implements Runnable{
    public void run(){
        int i=0;
        while(i<5){
            System.out.println("Sushree");
            i++;
        }
    }
}
public class Threadrunnable {
    public static void main(String[] args) {
        Test obj=new Test();
        Thread a=new Thread(obj);
        a.start();
        Liza stu=new Liza();
        Thread b=new Thread(stu);
        b.start();
    }
}

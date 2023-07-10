class test extends Thread{
    public void run(){
        System.out.println("test is thread ");
    }
}
class test2 extends Thread{
    public void run(){
        System.out.println("overrided thread ");
    }
}
public class threadpriority {
    public static void main(String[] args) {
        test obj=new test();
        obj.start();
        test2 obj2=new test2();
        obj2.start();
    }
}

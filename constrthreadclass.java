class thread1 extends Thread{
    public thread1(String name){
        super(name);
        
    }


public void run(){
    //int i=4;
    System.out.println("Thankyou");
}
}
public class constrthreadclass {
    public static void main(String[] args) {
        thread1 obj=new thread1("shakti");
        thread1 obj2=new thread1("sushree");
       // test obj2=new test("sushree");
        obj.start();
        obj2.start();
        System.out.println("The id of thread is "+obj.getId());
        System.out.println("The id of thread is "+obj2.getId());
        System.out.println("The name of thread is "+obj2.getName());
        System.out.println("The name of thread is "+obj.getName());
    }
}


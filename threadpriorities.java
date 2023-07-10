class test extends Thread{
    public test(String name){
        super(name);
    }
    public void run(){
        int i=0;
        while(i<10){
        System.out.println("I am a thread "+getName());
        i++;
        }
    }
}
public class threadpriorities {
    public static void main(String[] args) {
        test obj= new test("shakti");
        test obj2= new test("shaktiw");
        test obj3= new test("shaktiw importnt");
       
        obj.setPriority(Thread.MIN_PRIORITY);
        obj2.setPriority(Thread.MAX_PRIORITY);
        obj3.setPriority(Thread.MAX_PRIORITY);
        obj.start();
        obj2.start();
        obj3.start();
    }
}

class test extends Thread{
    public void run(){
        int i=0;
        while(i<9){
            System.out.println("shakti");
            System.out.println("Chandra");
            i++;
        }
    }
}
    class test2 extends Thread{
        public void run(){
            int i=0;
            while(i<5){
                System.out.println("Chatting");
                System.out.println("Nice");
                i++;
            }
        }
    }

public class Thread2021 {
    public static void main(String[] args) {
        test obj=new test();
        test2 obj1=new test2();
        obj.start();
        obj1.start();

    }
}

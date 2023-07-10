class test extends Thread{
    public void run(){
        int n=1;
        if(n%2!=0){
            int i=2;
            for(int row=1;row<5;row++){
                for(int space=1;space<5-row;space++){
                System.out.print(" ");}
                for(int col=1;col<=row;col++){
                    System.out.print(n+((col*i)-2)+" ");
                }
                i=i+2;
                System.out.println();
            }
        }
    }
}
public class Ass4_7 {
    public static void main(String[] args) {
        test obj=new test();
        obj.start();
    }
}

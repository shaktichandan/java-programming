interface  parent2 {
   /*  public parent2(){
        System.out.println("welcome");
    }
    public void sayhello(){
        System.out.println("hello");
    }*/
     public void greet();
     public void greet1();
    
}
class child2 implements parent2{
    public void greet(){
        System.out.println("good morning");
    }
    public void greet1(){
        System.out.println("good afternoon");
    }
}
public class t1{
      public static void main(String[] args) {
        child2 c=new child2();
        c.greet();
        c.greet1();
       // c.sayhello();
      }
}

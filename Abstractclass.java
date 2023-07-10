//Area perimeter of a rectangle and square using abstract class
interface Test{
   // public void show(){
       // System.out.println("Apple");
    //}
     public void perimeter();
     public void  area();
   
}
class Test2 implements Test{
    int b=5,l=10,p,a;
    public void perimeter(){
        
        p=(b+l)*2;
        System.out.println("Perimeter is "+p);
    }
    public void area(){
        
        a=b*l;
        System.out.println("area is"+a);
    }
}
public class Abstractclass {
    public static void main(String[] args) {
        Test2 obj=new Test2();
        obj.area();
        obj.perimeter();
        //obj.show();
    }
}

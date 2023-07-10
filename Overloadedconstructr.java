public class Overloadedconstructr {
    int id;
    String name;
    int roll;
    Overloadedconstructr(int i,String n)
    {
        id=i;
        name=n;
    }
    Overloadedconstructr(int i,String n ,int r){
        id=i;
        name=n;
        roll=r;
    }
    void show(){
        System.out.println(id+" "+name+" "+roll);
    }
    public static void main(String[] args) {
        Overloadedconstructr obj1=new Overloadedconstructr(10," Shakti");
        Overloadedconstructr obj2=new Overloadedconstructr(123,"chandan" ,11 );
        obj1.show();
        obj2.show();
    }
}

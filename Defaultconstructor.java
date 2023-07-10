public class Defaultconstructor {
    int id,reg;String name;
    Defaultconstructor(int i,String n,int r){
         id=i;
         name=n;
         reg=r;
    }
    void show(){
        System.out.println("Id is "+id+""+name+" "+reg);
    }
    public static void main(String[] args) {
        Defaultconstructor obj1=new Defaultconstructor(12,"shakti",4);
        Defaultconstructor obj2=new Defaultconstructor(3,"chandan",8);
        obj1.show();
        obj2.show();
    }
}

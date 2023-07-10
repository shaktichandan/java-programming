class Dog{
    void name(){
        System.out.println("puppy is our dog");
    }
}
class yellow extends Dog{
    void color(){
        System.out.println(" colour is yellow ");
    }
}

public class Singleinheritance {
    public static void main(String[] args) {
        Dog obj=new Dog();
        yellow obj1=new yellow();
        obj.name();
        obj1.color();
    }
}

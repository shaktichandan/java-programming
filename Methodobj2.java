public class Methodobj2 {
    int sum(int a,int b,int c){
        return a+b+c;
    }
    public static void main(String[] args) {
        Methodobj2 obj=new Methodobj2();
        int c=obj.sum(2,9,4);
        System.out.println(" Sum is "+c);
    }
}

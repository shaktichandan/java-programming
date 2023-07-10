public class Methodobj {
    int sum(int a,int b){
        return a+b;
    }
    public static void main(String[] args) {
        Methodobj obj=new Methodobj();
        int c=obj.sum(3,4);
        System.out.println("sum is "+c);
    }
}

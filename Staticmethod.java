public class Staticmethod {
   static int sum(int a,int b){
    int c=a+b;
    return c;
   }
    public static void main(String[] args) {
        int x=4;int y=9;
        int z=sum(x,y);
        int s=sum(2,3);
        System.out.println("sum is "+z+" and "+s);
    }
}

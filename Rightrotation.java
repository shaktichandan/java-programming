import java.util.Scanner;

public class Rightrotation {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a[]=new int[5];
        System.out.println("Enter an array");
        for(int i=0;i<5;i++)
        {
            a[i]=sc.nextInt();
        }
        // int temp=a[4];
        // for( int i=4;i>0;i--)
        // {
        //     a[i]=a[i-1]; a[0]=temp;
        // }
        int na[]= new int[5];
        na[0] = a[4];
        for(int i=0,j=1;i<4;i++,j++)
        {
            na[j]=a[i];
        }
        System.out.println("After right rotation ");
        for(int i=0;i<5;i++){
            System.out.print(na[i]);
        }
        //System.out.println("After right rotation "+a[5]);
        sc.close();
    }
}

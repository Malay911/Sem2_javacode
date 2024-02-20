import java.util.Scanner;
public class cricket{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter size of array:");
        int n=s.nextInt();
        int a[] = new int[n];
        for(int i=0;i<a.length;i++){
            System.out.println("Enter the "+i+" th element");
            a[i]=s.nextInt();
        }
        for(int i = 0;i<a.length;i++){
            System.out.println("a["+i+"]="+a[i]);
        }
    }
}
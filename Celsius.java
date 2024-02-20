import java.util.Scanner;
public class Celsius{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter temp in Celsius:");
        int celsius=sc.nextInt();
        System.out.println(((9/5)*celsius)+32);
    }
}
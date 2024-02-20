import java.util.Scanner;
public class lab2{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your name:");
        String name=sc.nextLine();
        System.out.println("Enter age:");
        int age=sc.nextInt();
        System.out.println(name);
        System.out.println(age);
    }
}
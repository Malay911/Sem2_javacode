import java.util.Scanner;
public class Calc{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Operator:");
        char c=sc.nextLine().charAt(0);
        System.out.println("First number:");
        int number1=sc.nextInt();
        System.out.println("Second number:");
        int number2=sc.nextInt();
        if(c=='+'){
            System.out.println(number1+number2);
        }
        else if(c=='-'){
            System.out.println(number1-number2);
        }
        else if(c=='*'){
            System.out.println(number1*number2);
        }
        else if(c=='/'){
            System.out.println(number1/number2);
        }
    }
}
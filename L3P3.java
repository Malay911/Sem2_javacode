import java.util.Scanner;
public class L3P3{
public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a number:");
    int n=sc.nextInt();
    int a;
    int rev=0;
    int temp = n;
    while(n>0){
        a=n%10;
        rev=rev*10 + a ;
        n=n/10;
    }
    System.out.println(rev);
    if(rev==temp){
        System.out.println("Palindrome");
    }
    else{
        System.out.println("Not Palindrome");
    }
}
}
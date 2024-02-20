import java.util.Scanner; 
public class lab_43{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a[] = new int[4];
		int i = 0;
		int n = 4;
		int sum = 0;
		int Avg =0;
		for(i=0;i<n;i++){
			System.out.println("Enter an integer:");
			a[i]=sc.nextInt();
			sum=sum+a[i];
		}
		Avg=sum/4;
		System.out.println("Average="+Avg);
	}
}
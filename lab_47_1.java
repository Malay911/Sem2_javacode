import java.util.*;
public class lab_47_1{
	public static void main(String[] args)
	{
		int i,j;
		int num=1;
		for (i=1;i<=3;i++) {
			for (j=1;j<=i;j++) {
				System.out.print("* ");
			}
            System.out.println();
		}
		for (i=2;i>=1;i--) {
			for (j=1;j<=i;j++) {
				System.out.print("* ");
			}

			System.out.println();
		}
	}
}
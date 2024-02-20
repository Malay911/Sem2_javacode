import java.util.Scanner;
public class cricket1 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter  number of over:");
        int n=s.nextInt();
        int run[][]=new int[3][6];
        for(int i=0;i<3;i++){
          for(int j=0;j<6;j++){
            System.out.println("Enter runs taken" + "in over no" +(i+1)+"and ball no" + (j+1) + "=");
            run[i][j]=s.nextInt();
          }
        }
        int totalRun=0;
        for(int i=0;i<3;i++){
            for(int j=0;j<6;j++){
                totalRun+=run[i][j];
            }    
    }
    System.out.println("Total Run="+totalRun);
    }
}
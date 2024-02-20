import java.util.*;
public class lab5_1 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter radius:");
        int radius=sc.nextInt();
        Circle c=new Circle();
        c.radius=radius;
        double area=c.areaofcircle();
        System.out.println("Area:"+area);
    }
}

class Circle{
        int radius;
        public double areaofcircle(){
        return 3.14*radius*radius;
        }
}
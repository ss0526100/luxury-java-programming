import java.util.Scanner;
public class practice_02_10 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("input one circle center x y and diameter>>");
        double x1=sc.nextDouble();
        double y1=sc.nextDouble();
        double diameter1=sc.nextDouble();
        System.out.print("input another one circle center x y and diameter>>");
        double x2=sc.nextDouble();
        double y2=sc.nextDouble();
        double diameter2=sc.nextDouble();
        double distance=Math.sqrt((x1-x2)*(x1-x2)+(y1-y2)*(y1-y2));
        if(distance<diameter1+diameter2)System.out.println("two circles overlap ");
        else System.out.println("two circles don't overlap ");
    }
}

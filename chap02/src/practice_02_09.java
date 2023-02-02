import java.util.Scanner;
public class practice_02_09 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("input center diameter>>");
        double cx=sc.nextDouble();
        double cy=sc.nextDouble();
        double diameter=sc.nextDouble();
        System.out.print("input point x y>>");
        double x=sc.nextDouble();
        double y=sc.nextDouble();
        if((x-cx)*(x-cx)+(y-cy)*(y-cy)<=diameter*diameter)System.out.println("point ("+x+","+y+") is in the circle");
        else System.out.println("point ("+x+","+y+") isn't in the circle");
    }
}

import java.util.Scanner;
class Circle{
    private double x,y;
    private int radius;
    public Circle(double x, double y, int radius){
        this.x=x;
        this.y=y;
        this.radius=radius;
    }
    public void show(){
        System.out.println("("+x+","+y+")"+radius);
    }
    public int getRadius(){return this.radius;}
}
public class problem_04_06 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        Circle c []=new Circle[3];
        for(int i=0;i<c.length;i++){
            System.out.print("x, y, radius >>");
            double x=scanner.nextDouble();
            double y=scanner.nextDouble();
            int radius=scanner.nextInt();
            c[i]=new Circle(x, y, radius);
        }
        int maxRadius=c[0].getRadius();
        int maxCnt=0;
        for(int i=1;i<c.length;i++){
            if(maxRadius<c[i].getRadius()){
                maxRadius=c[0].getRadius();
                maxCnt=i;
            }
        }
        System.out.print("Biggest circie is ");
        c[maxCnt].show();
        scanner.close();
    }
}

import java.util.Scanner;
public class practice_02_07 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("input coordinate x,y>>");
        int x=sc.nextInt();
        int y=sc.nextInt();
        if(x>=100&&x<=200&&y>=100&&y<=200)System.out.println("("+x+","+y+") is in the square");
        else System.out.println("("+x+","+y+") isn't in the square");
    }
}

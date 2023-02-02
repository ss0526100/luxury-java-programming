import java.util.Scanner;
public class practice_02_08 {
    public static boolean inRect(int x, int y, int rectx1, int recty1, int rectx2, int recty2){
        if((x>=rectx1&&x<=rectx2)&&(y>=recty1&&y<=recty2))return true;
        else return false;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("input coordinate 2 x,y>>");
        int x1=sc.nextInt();
        int y1=sc.nextInt();
        int x2=sc.nextInt();
        int y2=sc.nextInt();
        if(inRect(100,100,x1,y1,x2,y2)||inRect(100,200,x1,y1,x2,y2)||inRect(200,100,x1,y1,x2,y2)||inRect(200,200,x1,y1,x2,y2))System.out.println("two squares collide");
        else System.out.println("two squares don't collide");
    }
}

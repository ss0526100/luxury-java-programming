import java.util.Scanner;
public class practice_02_11_01 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("input month(1~12)>>");
        int month=sc.nextInt();
        if(3<=month&&month<=5)System.out.println("spring");
        else if(6<=month&&month<=8)System.out.println("summer");
        else if(9<=month&&month<=11)System.out.println("autumn");
        else System.out.println("winter");
    }
}

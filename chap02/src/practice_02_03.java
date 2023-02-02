import java.util.Scanner;
public class practice_02_03 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("input amount>>");
        int a=sc.nextInt();
        System.out.println("50000 bill : "+a/50000);
        a%=50000;
        System.out.println("10000 bill : "+a/10000);
        a%=10000;
        System.out.println("1000 bill : "+a/1000);
        a%=1000;
        System.out.println("100 bill : "+a/100);
        a%=100;
        System.out.println("50 bill : "+a/50);
        a%=50;
        System.out.println("10 bill : "+a/10);
        a%=10;
        System.out.println("1 bill : "+a);

    }
}

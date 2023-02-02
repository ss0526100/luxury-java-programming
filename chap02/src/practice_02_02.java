import java.util.Scanner;
public class practice_02_02 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("double decimal(10~99)>>");
        int a=sc.nextInt();
        if(a/10==a%10)System.out.println("Yes! 10 digit and 1 digit are same");
        else System.out.println("No! 10 digit and 1 digit are different");
    }
}

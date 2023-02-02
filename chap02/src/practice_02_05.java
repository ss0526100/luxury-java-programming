import java.util.Scanner;
public class practice_02_05 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int sum=a+b+c;
        if(sum-a>a&&sum-b>b&&sum-c>c)System.out.println("you can make triangle");
        else System.out.println("you can't make triangle");
    }
}

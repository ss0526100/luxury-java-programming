import java.util.Scanner;
public class practice_02_06 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("input 1~99 decimal>>");
        int a=sc.nextInt();
        int cnt=0;
        if((a%10)%3==0)cnt++;
        if(a>10&&(a/10)%3==0)cnt++;
        if(cnt==0)System.out.println(a);
        else System.out.println("clap"+" chap".repeat(cnt));
    }
}

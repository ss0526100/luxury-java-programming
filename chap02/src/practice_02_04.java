import java.util.Scanner;
public class practice_02_04 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        if(a>b){
            if(b>c)System.out.println(b);
            else if(a>c)System.out.println(c);
            else System.out.println(a);
            
        }
        else{
            if(c>b)System.out.println(b);
            else if(c>a)System.out.println(c);
            else System.out.println(a);
        }
    }
}

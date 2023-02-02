import java.util.Scanner;
public class practice_02_12_02 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("calculate >> ");
        double a=sc.nextInt();
        String op=sc.next();
        double b=sc.nextInt();

        switch(op){
            case "+":
                System.out.println(a+b);
                break;
            case "-":
                System.out.println(a-b);
                break;
            case "*":
                System.out.println(a*b);
                break;
            case "/":
                if(b==0) System.out.println("can't devide by 0");
                else System.out.println(a/b);
                break;
        }
    }
}

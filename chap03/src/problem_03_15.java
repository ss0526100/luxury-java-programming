import java.util.InputMismatchException;
import java.util.Scanner;
public class problem_03_15 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String tmp="";
        int a,b;
        while(!tmp.equals("stop")){
            System.out.print("Enter two numbers you want to multiply>>");
            tmp=sc.nextLine();
            if(tmp.equals("stop"))break;
            try{
                a=Integer.parseInt(tmp.split(" ")[0]);
                b=Integer.parseInt(tmp.split(" ")[1]);
                System.out.println(a+"x"+b+"="+(a*b));
            }
            catch(NumberFormatException e){
                System.out.println("Do enter the only integer");
            }
        }

    }
}

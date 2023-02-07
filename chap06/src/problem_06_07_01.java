import java.util.Scanner;
import java.util.StringTokenizer;
public class problem_06_07_01 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String tmp;
        while(true){
            System.out.print(">>");
            tmp=sc.nextLine();
            if(tmp.equals("stop")){
                System.out.println("Exit..");
                break;
            }
            System.out.println("token count : "+new StringTokenizer(tmp).countTokens());
        }
    }
}

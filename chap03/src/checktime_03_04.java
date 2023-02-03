import java.util.Scanner;
import java.util.Random;
public class checktime_03_04 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        Random rand=new Random();
        int target,tmp,cnt;
        boolean doItAgain=false;
        do{
            cnt=1;
            target=rand.nextInt(99);
            System.out.println("Target Number has been determined. Guess it");
            System.out.println("0-99");
            do{
                System.out.print(cnt+">>");
                tmp=sc.nextInt();
                if(tmp<target)System.out.println("Smaller than target number");
                else if(tmp>target)System.out.println("Larger than target number");
                cnt++;
            }while(tmp!=target);
            System.out.println("Correct!");
            System.out.print("Replay?(y/n)>>");
            doItAgain=sc.next().equals("y")?true:false;
        }while(doItAgain);
    }
}

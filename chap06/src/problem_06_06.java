import java.util.Calendar;
import java.util.Scanner;


public class problem_06_06 {
    static double compareSecond(int startSec, int startMill, int endSec, int endMill){
        if(endSec<startSec)endSec+=60;
        double result=0;
        result+=endSec*1000+endMill;
        result-=(startSec*1000+startMill);
        return result/1000;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Calendar now;
        System.out.println("A game where the person closest to 10 seconds wins");

        System.out.print("Hwang start (press the <Enter>)");
        sc.nextLine();
        Calendar hawngTime=Calendar.getInstance();
        System.out.print("Press the enter when you think 10 seconds have passed)>>");
        sc.nextLine();
        now=Calendar.getInstance();
        double hwangResult=compareSecond(hawngTime.get(Calendar.SECOND), hawngTime.get(Calendar.MILLISECOND), now.get(Calendar.SECOND), now.get(Calendar.MILLISECOND));
        System.out.println("hwang's result : "+hwangResult);
        System.out.println();

        System.out.print("Lee start (press the <Enter>)");
        sc.nextLine();
        Calendar leeTime=Calendar.getInstance();
        System.out.print("Press the enter when you think 10 seconds have passed)>>");
        sc.nextLine();
        now=Calendar.getInstance();
        double leeResult=compareSecond(leeTime.get(Calendar.SECOND), leeTime.get(Calendar.MILLISECOND), now.get(Calendar.SECOND), now.get(Calendar.MILLISECOND));
        System.out.println("lee result : "+leeResult);
        System.out.println();
        
        System.out.println("hwang result : "+hwangResult+" lee result : "+leeResult);
        
        if(Math.abs(10-leeResult)<Math.abs(10-hwangResult))System.out.println("lee Wins!");
        else if(Math.abs(10-leeResult)>Math.abs(10-hwangResult))System.out.println("hwang Win!");
        else System.out.println("draw!");
    }
}

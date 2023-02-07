import java.util.Calendar;

import javax.sound.sampled.SourceDataLine;

import java.util.Calendar;
public class problem_06_05 {
    public static void main(String[] args) {
        Calendar now=Calendar.getInstance();
        System.out.println("now time is "+now.get(now.HOUR)+":"+(now.get(now.MINUTE)));
        if(now.get(now.AM_PM)==0&&now.get(now.HOUR)>=4)System.out.println("Good Morning");
        else if(now.get(now.AM_PM)==1&&now.get(now.HOUR)<=6)System.out.println("Good Afternoon");
        else if(now.get(now.AM_PM)==1&&now.get(now.HOUR)<10)System.out.println("Good Evening");
        else System.out.println("Good Night");
    }
}

import java.util.Scanner;
public class problem_03_16 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str[]={"rock","paper","sciccor"};
        String input="",comPick="";
        int userNum,comNum;
        while(!input.equals("stop")){
            userNum=-1;
            System.out.println("Play rock-paper-scissors with the computer");
            System.out.print("Rock-Paper-Sciccor!>>");
            input=sc.next();
            if(input.equals("stop")){System.out.println("Quit the game...");break;}
            for(int i=0;i<3;i++){
                if(str[i].equals(input))userNum=i;
            }
            comNum=(int)(Math.random()*3);
            if(userNum==-1)System.out.println("Invalid input");
            else{
                System.out.print("User : "+str[userNum]+", Computer : "+str[comNum]);
                if(userNum==comNum)System.out.println(", Draw.");
                else if((userNum==0&&comNum==1)||(userNum==1&&comNum==2)||(userNum==2&&comNum==0))System.out.println(", User Lose...");
                else System.out.println(", User Win!");
            }
        }
    }
}

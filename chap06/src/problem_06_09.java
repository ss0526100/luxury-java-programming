import java.util.Scanner;
public class problem_06_09 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int user,com;
        String[] way={"rock","paper","scissor"};
        while(true){
            System.out.print("chul-su[rock(1), paper(2), scissor(3), exit(4)]>>");
            user=sc.nextInt()-1;
            if(user>2||user<0)break;
            com=(int)(Math.random()*3);
            System.out.println("chul-su("+way[user]+") : computer("+way[com]+")");
            if((user==0&&com==1)||(user==1&&com==2)||(user==2&&com==0))System.out.println("computer wins");
            else if((user==1&&com==0)||(user==2&&com==1)||(user==0&&com==2))System.out.println("chul-su wins!");
            else System.out.println("draw!");
        }

    }
}

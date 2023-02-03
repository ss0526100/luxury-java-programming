import java.util.Scanner;
public class problem_03_06 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int unit[]={50000,10000,1000,500,100,50,10,1};
        System.out.print("input amount>>");
        int amount=sc.nextInt();
        for(int i=0;i<unit.length;i++){
            if(amount/unit[i]!=0){
            System.out.print(unit[i]+"won bill : ");
            System.out.println(amount/unit[i]);
            amount%=unit[i];
            }
            
        }
    }
}

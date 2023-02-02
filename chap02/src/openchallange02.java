import java.util.Scanner;
public class openchallange02 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int p1=-1,p2=-1;
        System.out.println("가위바위보 게임입니다. 가위, 바위, 보 중에서 입력하세요");
        System.out.print("철수 >> ");
        switch(sc.next()){
            case "가위":
                p1=0;
                break;
            case "바위":
                p1=1;
                break;
            case "보":
                p1=2;
                break;
        }
        System.out.print("영희 >> ");
        switch(sc.next()){
            case "가위":
                p2=0;
                break;
            case "바위":
                p2=1;
                break;
            case "보":
                p2=2;
                break;
        }
        if(p1==p2)System.out.println("비겼습니다");
        else if((p1==0&&p2==2)||(p1==1&&p2==0)||(p1==2&&p2==1))System.out.println("철수가 이겼습니다.");
        else System.out.println("영희가 이겼습니다.");
    }
}

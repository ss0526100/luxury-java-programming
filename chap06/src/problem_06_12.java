import java.util.Scanner;
class Person{
    protected String name;
    protected int gameNum;
    protected int maxNum;
    protected int[] gameResult;
    private boolean gameblingWin;
    public Person(String name, int gameNum, int maxNum){
        this.name=name;
        this.gameNum=gameNum;
        this.maxNum=maxNum;
        this.gameResult=new int[gameNum];
    }
    public String getName() {
        return name;
    }
    public void gamebling(){
        for(int i=0;i<gameNum;i++){
            gameResult[i]=(int)(1+Math.random()*maxNum);
        }
    }
    public boolean getGameblingWin(){
        return gameblingWin;
    }
    public void winCheck(){
        for(int i=0;i<gameNum-1;i++){
            if(gameResult[i]!=gameResult[i+1]){
                gameblingWin=false;
                return;
            }
        }
        gameblingWin=true;
    }
    public void printGameResult(){
        System.out.print("   ");
        for(int i=0;i<gameNum;i++){
            System.out.printf("%3d",gameResult[i]);
        }
        if(gameblingWin)System.out.println("   "+name+" wins!");
        else System.out.println("   That's a bummer..");
    }

}
public class problem_06_12 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Participating player number>>");
        int peopleNum=sc.nextInt();
        Person[] people=new Person[peopleNum];
        for(int i=0;i<peopleNum;i++){
            System.out.print("Player "+(i+1)+"'s name>>");
            people[i]=new Person(sc.next(), 3, 3);
        }
        sc.nextLine();
        int cnt=0;
        while(true){
            System.out.print("["+people[cnt%peopleNum].getName()+"] play!(Press the Enter key)");
            sc.nextLine();
            people[cnt%peopleNum].gamebling();
            people[cnt%peopleNum].winCheck();
            people[cnt%peopleNum].printGameResult();
            if(people[cnt%peopleNum].getGameblingWin())break;
            cnt++;
        }
    }
}

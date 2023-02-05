import java.util.Scanner;

class Day{
    private String work;
    public void set(String work){this.work=work;}
    public String get(){return work;}
    public void show(){
        if(work==null)System.out.println("It doesn't exist");
        else System.out.println("It is "+work);
    }
}
public class problem_04_07 {
    private Day days[];
    public problem_04_07(int dayAmount){
        days=new Day[dayAmount];
        for(int i=0;i<dayAmount;i++){
            days[i]=new Day();
        }
    }
    public void input(int day,String work){
        days[day-1].set(work);
    }
    public void view(int day){
        days[day-1].show();
    }
    public void finish(Scanner sc){
        System.out.println("Program exit");
        sc.close();
        System.exit(0);
    }
    public void run(Scanner sc){
        int menuChoose,day;
        String work;
        while(true){
            System.out.print("To do(input:1, view:2, exit:3) >>");
            menuChoose=sc.nextInt();
            switch(menuChoose){
                case 1:
                    System.out.print("date(1~"+days.length+")?>>");
                    day=sc.nextInt();
                    System.out.print("To Do(Enter with no space)?>>");
                    work=sc.next();
                    input(day,work);
                    break;
                case 2:
                    System.out.print("date(1~"+days.length+")?>>");
                    day=sc.nextInt();
                    view(day);
                    break;
                case 3:
                    finish(sc);
                    break;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        problem_04_07 april=new problem_04_07(30);
        System.out.println("This month scheduel management program.");
        april.run(sc);
    }
    
}

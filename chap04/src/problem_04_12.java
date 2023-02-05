import java.util.InputMismatchException;
import java.util.Scanner;
class Seat{
    private char seatVal;
    private String seatList[];
    public Seat(char seatVal,int n){
        this.seatVal=seatVal;
        seatList=new String[n];
        for(int i=0;i<seatList.length;i++){
            seatList[i]="---";
        }
    }
    public void print(){
        System.out.print(seatVal+">> ");
        for(int i=0;i<seatList.length;i++){
            System.out.print(seatList[i]+" ");
        }
        System.out.println();
    }
    public int findSeat(String name){
        for(int i=0;i<seatList.length;i++){
            if(seatList[i].equals(name))return i;
        }
        return -1;
    }
    public int getSeatNum(){return seatList.length;}
    public char getSeatVal(){return seatVal;};
    public String getSeat(int n){return seatList[n];}
    public void setSeat(String name,int n){seatList[n]=name;}
}
public class problem_04_12 {
    Seat seat[]={new Seat('S',10),new Seat('A',10),new Seat('B',10)};
    Scanner sc;
    public problem_04_12(Scanner sc){
        this.sc=sc;
    }
    public void reserve(int seatNum,String name, int seatChoose){
        seat[seatNum].setSeat(name, seatChoose);
    }
    public void check(){
        for(int i=0;i<seat.length;i++){
            seat[i].print();
        }
    }
    public void exit(Scanner sc){
        sc.close();
        System.exit(0);
    }
    public void run(){
        int menuChoose;
        int seatNum=-1;
        String name;
        System.out.println("Luxury Concert Hall Resevation System.");
        while(true){
            menuChoose=-1;
            while(1>menuChoose||menuChoose>4){
                try{
                System.out.print("reserve:1, check:2, cancel:3, exit:4>>");
                menuChoose=sc.nextInt();
                }
                catch(InputMismatchException e){
                    System.out.println("Enter number");
                    sc.nextLine();
                }
                if(1>menuChoose||menuChoose>4)System.out.println("Enter right number");
            }
            switch(menuChoose){
                case 1:
                    System.out.println("You choose reserve");
                    seatNum=-1;
                    while(1>seatNum||seatNum>seat.length){
                        try{
                            System.out.print("Choose seat ");
                            for(int i=0;i<seat.length;i++){
                                System.out.print(seat[i].getSeatVal()+"("+(i+1)+")");
                                if(i!=seat.length-1)System.out.print(", ");
                            }
                            System.out.print(">>");
                            seatNum=sc.nextInt();
                            if(1>seatNum||seatNum>seat.length)System.out.println("Enter right number");
                        }
                        catch(InputMismatchException e){
                            System.out.println("Enter number");
                            sc.nextLine();
                        }
                    }
                    seat[seatNum-1].print();
                    System.out.print("Name>>");
                    name=sc.next();
                    int seatChoose=-1;
                    while(1>seatChoose||seatChoose>seat[seatNum].getSeatNum()){
                        try{
                            System.out.print("Number>>");
                            seatChoose=sc.nextInt();
                        }
                        catch(InputMismatchException e){
                            System.out.println("Enter number");
                            sc.nextLine();
                        }
                        if(1>seatChoose||seatChoose>seat[seatNum-1].getSeatNum())System.out.println("Enter right number");
                        else if(!seat[seatNum-1].getSeat(seatChoose-1).equals("---")){
                            System.out.println("Already reserved seat");
                            seatChoose=-1;
                        }
                    }
                    reserve(seatNum-1,name,seatChoose-1);
                    break;
                case 2:
                    System.out.println("You choose check");
                    check();
                    break;
                case 3:
                    System.out.println("You choose cancel");
                    seatNum=0;
                    while(1>seatNum||seatNum>seat.length){
                        try{
                            System.out.print("Choose seat ");
                            for(int i=0;i<seat.length;i++){
                                System.out.print(seat[i].getSeatVal()+"("+(i+1)+")");
                                if(i!=seat.length-1)System.out.print(", ");
                            }
                            System.out.print(">>");
                            seatNum=sc.nextInt();
                            if(1>seatNum||seatNum>seat.length)System.out.println("Enter right number");
                        }
                        catch(InputMismatchException e){
                            System.out.println("Enter number");
                            sc.nextLine();
                        }
                    }
                    seatNum--;
                    while(true){
                        seat[seatNum].print();
                        System.out.print("Name>>");
                        name=sc.next();
                        if(seat[seatNum].findSeat(name)==-1){
                            System.out.println(name+" doesn't exist");
                        }
                        else{
                            seat[seatNum].setSeat("---",seat[seatNum].findSeat(name));
                            break;
                        }
                    }
                    break;
                case 4:
                    exit(sc);
                    break;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        problem_04_12 app=new problem_04_12(sc);
        app.run();

    }
}

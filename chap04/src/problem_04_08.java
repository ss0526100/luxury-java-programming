import java.util.Scanner;
class Phone{
    private String name;
    private String telNum;
    public Phone(String name, String telNum){
        this.name=name;
        this.telNum=telNum;
    }
    public String getName(){return this.name;}
    public String getTelNum(){return this.telNum;}
}
public class problem_04_08 {
    Phone list[];
    String name;
    String telNum;
    Scanner sc;
    public problem_04_08(Scanner sc){
        this.sc=sc;
        System.out.print("People Number>>");
        int n=sc.nextInt();
        list=new Phone[n];
        System.out.println(" (caution:Enter name and number with no space and you can't enter name \"stop\")>>");
        for(int i=0;i<n;i++){
            System.out.print("Name and Telephone Number(ex:cha 010-3303-3030)");
            name=sc.next();
            telNum=sc.next();
            list[i]=new Phone(name,telNum);
        }
    }
    public void exit(Scanner sc){
        sc.close();
        System.exit(0);
    }
    public void find(String name){
        for(int i=0;i<list.length;i++){
            if(list[i].getName().equals(name)){ System.out.println(list[i].getName()+"'s number is "+list[i].getTelNum()); return;}
        }
        System.out.println(name+" doesn't exist");
    }
    public void run(){
        while(!name.equals("stop")){
            System.out.print("search name>>");
            name=sc.next();
            if(name.equals("stop"))exit(sc);
            find(name);
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        problem_04_08 program=new problem_04_08(sc);
        program.run();
    }
}

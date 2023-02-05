import java.util.Scanner;

class Player{
    private String name;
    private String word;
    public Player(String name){
       this.name=name; 
    }
    public String getName(){
        return this.name;
    }
    public void getWordFromUser(String word){
        this.word=word;
    }
    public String getWord(){
        return this.word;
    }
    public boolean checkSucess(String prevWord){
        char prevLastChar=prevWord.charAt(prevWord.length()-1);
        char nowfirstChar=word.charAt(0);
        if(prevLastChar==nowfirstChar)return true;
        else return false;
    }
}

public class openchallenge_04_01 {
    public openchallenge_04_01(){};
    public void run(Scanner sc){
        int num=0;
        int nowCnt=0;
        String prevWord="father";
        System.out.println("Start follow up game...");
        do{
            System.out.print("How many people are in the game>>");
            num=sc.nextInt();
            if(num<=0){
                System.out.println("Participating people number is bigger than 0");
            }

        }while(num<=0);
        Player people[]=new Player[num];
        for(int i=0;i<num;i++){
            System.out.print("Enter the player's name>>");
            people[i]=new Player(sc.next());
        }
        System.out.println("String word is "+prevWord);
        while(true){
            System.out.print(people[nowCnt%num].getName()+">>");
            people[nowCnt%num].getWordFromUser(sc.next());
            if(!people[nowCnt%num].checkSucess(prevWord)){
                System.out.println(people[nowCnt%num].getName()+" is lose.");
                break;
            }
            prevWord=people[nowCnt%num].getWord();
            nowCnt++;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        openchallenge_04_01 app=new openchallenge_04_01();
        app.run(sc);
    }
}

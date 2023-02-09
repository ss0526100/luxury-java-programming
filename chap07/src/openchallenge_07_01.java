import java.util.Vector;

import javax.print.CancelablePrintJob;

import java.text.ChoiceFormat;
import java.util.Scanner;

class Word{
    protected String english;
    protected int number;
    public Word(String english, int number){
        this.english=english;
        this.number=number;
    }
    public String getEnglish() {
        return english;
    }
    public int getNumber() {
        return number;
    }
}
public class openchallenge_07_01 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        final int CHOICENUM=4;
        int input;
        int answerIdx;
        int answerChoiceNum;
        int tmpChoiceIdx;
        int[] choiceList=new int[CHOICENUM];
        boolean[] canChoice;
        Vector<Word> v=new Vector<Word>();
        v.add(new Word("zero", 0));
        v.add(new Word("one", 1));
        v.add(new Word("two", 2));
        v.add(new Word("three", 3));
        v.add(new Word("four", 4));
        v.add(new Word("five", 5));
        v.add(new Word("six",6));
        v.add(new Word("seven", 7));
        v.add(new Word("eight", 8));
        v.add(new Word("nine", 9));
        v.add(new Word("ten", 10));
        v.add(new Word("eleven", 11));
        v.add(new Word("twelve", 12));
        v.add(new Word("thirteen", 13));
        v.add(new Word("fourteen", 14));
        v.add(new Word("fifteen", 15));
        v.add(new Word("sixteen", 16));
        canChoice=new boolean[v.size()];
        System.out.println("Start English to Number Text");
        System.out.println("If you want to exit, enter -1");
        System.out.println("This program has "+v.size()+" numbers");
        while(true){
            answerIdx=(int)(Math.random()*v.size());
            answerChoiceNum=(int)(Math.random()*CHOICENUM);
            tmpChoiceIdx=answerIdx;
            input=0;
            for(int i=0;i<canChoice.length;i++){
                if(i==answerIdx)canChoice[i]=false;
                else canChoice[i]=true;
            }
            for(int i=0;i<CHOICENUM;i++){
                if(i==answerChoiceNum){choiceList[i]=answerIdx;continue;}
                while(!canChoice[tmpChoiceIdx]){
                    tmpChoiceIdx=(int)(Math.random()*v.size());
                }
                canChoice[tmpChoiceIdx]=false;
                choiceList[i]=tmpChoiceIdx;
            }
            while(input==0){
                System.out.println(v.get(answerIdx).getNumber()+"?");
                for(int i=0;i<choiceList.length;i++){
                    System.out.print("("+(i+1)+")"+v.get(choiceList[i]).getEnglish()+" ");
                }
                System.out.print(" :>");
                try{input=Integer.parseInt(sc.nextLine());}
                catch(NumberFormatException e){
                    System.out.println("Please enter the Number");
                }
                if(input<-1||input>CHOICENUM||input==0){
                    System.out.println("Please Enter the Number between 1 to "+CHOICENUM);
                    input=0;
                }
            }
            if(input==-1){
                System.out.println("Exit...");
                System.exit(0);
            }
            else input--;
            if(input==answerChoiceNum)System.out.println("Excellent !!");
            else System.out.println("NO. !!");   
        }
    }
}

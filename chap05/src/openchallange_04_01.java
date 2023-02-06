import java.util.Scanner;
abstract class GameObject{
    protected int distance;
    protected int x,y;
    public GameObject(int startX, int startY, int distance){
        this.x=startX;
        this.y=startY;
        this.distance=distance;
    }
    public int getX(){return x;}
    public int getY(){return y;}
    public boolean collide(GameObject p){
        if(this.x==p.getX()&&this.y==p.getY())return true;
        else return false;
    }
    public abstract void move();
    public abstract char getShape();
}
class Bear extends GameObject{
    private char icon;
    protected int direction=-1;
    public Bear(int x, int y, int distance ,char icon){
        super(x, y, distance);
        this.icon=icon;
    }
    public void setDirection(int direction){
        this.direction=direction;
    }
    public void move(){//diriection->0:up 1: right 2:down 3:left
        switch(direction){
            case 0:
                if(y-distance<0)break;
                y-=distance;
                break;
            case 1:
                if(x+distance>19)break;
                x+=distance;
                break;
            case 2:
                if(y+distance>9)break;
                y+=distance;
                break;
            case 3:
                if(x-distance<0)break;
                x-=distance;
                break;
        }
    }
    public char getShape(){
        return icon;
    };
    public void getXYDirection(){
        System.out.println("x : "+x+" y : "+y+" direction : "+direction);
    }
}
class Fish extends GameObject{
    private char icon;
    protected int direction=-1;
    public Fish(int x, int y, int distance ,char icon){
        super(x, y, distance);
        this.icon=icon;
    }
    public void setDirection(){
        direction=(int)(Math.random()*4);
    }
    public void move(){//diriection->0:up 1: right 2:down 3:left
        switch(direction){
            case 0:
                if(y-distance<0)break;
                y-=distance;
                break;
            case 1:
                if(x+distance>19)break;
                x+=distance;
                break;
            case 2:
                if(y+distance>9)break;
                y+=distance;
                break;
            case 3:
                if(x-distance<0)break;
                x-=distance;
                break;
        }
    }
    public char getShape(){
        return icon;
    };
    public void getXYDirection(){
        System.out.println("x : "+x+" y : "+y+" direction : "+direction);
    }
}
public class openchallange_04_01 {
    int mapX=20;
    int mapY=10;
    Scanner sc;
    public openchallange_04_01(Scanner sc){
        this.sc=sc;
    }
    public void printMap(Bear b, Fish f){
        for(int i=0;i<mapY;i++){
            for(int j=0;j<mapX;j++){
                if(b.y==i&&b.x==j)System.out.print(b.getShape());
                else if(f.y==i&&f.x==j)System.out.print(f.getShape());
                else System.out.print("-");
            }
            System.out.println();
        }
    }
    public void run(){
        String tmp;
        int cnt=0;
        char input='0';
        Bear b=new Bear((int)(Math.random()*mapX),(int)(Math.random()*mapY),1,'B');
        Fish f;
        do{
            f=new Fish((int)(Math.random()*mapX),(int)(Math.random()*mapY),1,'@');
        }while(b.x==f.x&&b.y==f.y);
        System.out.println("**Bear eating Fish game start!**");
        while(true){
            input='0';
            printMap(b,f);
            if(b.collide(f)){
                System.out.println("Bear Wins!!");
                break;
            }
            while(input!='a'&&input!='s'&&input!='d'&&input!='w'&&input!='A'&&input!='S'&&input!='D'&&input!='W'){
                System.out.print("left(a), down(s), right(d), up(w) >> ");
                tmp=sc.nextLine();
                if(tmp.length()!=1)System.out.println("Enter the right direction");
                else{
                    switch(tmp.charAt(0)){
                        case 'a': case 's': case 'd': case 'w': case'A': case 'S': case 'D': case 'W':
                            input=tmp.charAt(0);
                            break;
                    }
                }
                switch(input){
                    case 'w': case 'W':
                        b.setDirection(0);
                        break;
                    case 'd': case 'D':
                        b.setDirection(1);
                        break;
                    case 's': case 'S':
                        b.setDirection(2);
                        break;
                    case 'a': case 'A':
                        b.setDirection(3);
                        break;
                    default:
                        System.out.println("Enter the right direction");
                        break;
                }
                }
                b.move();
                if(cnt%5>=3){f.setDirection();
                f.move();}
                System.out.println();
                cnt++;
            }
            
        }
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        openchallange_04_01 app=new openchallange_04_01(sc);
        app.run();

    }
}

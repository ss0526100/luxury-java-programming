class TV{
    private String manufacture;
    private int year;
    private int inch;
    public TV(String manufacture,int year,int inch){
        this.manufacture=manufacture;
        this.year=year;
        this.inch=inch;
    }

    public void show(){
        System.out.println(year+" "+inch+"-inch TV "+"made by "+manufacture);
    }    
}
public class problem_04_01 {
    public static void main(String[] args) {
        TV myTV=new TV("LG",2017,32);
        myTV.show();
    }
}

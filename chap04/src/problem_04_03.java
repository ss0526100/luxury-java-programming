class Song{
    String title;
    String artist;
    int year;
    String country;
    public Song(){
        this.title="my love by my side";
        this.artist="Hyun Sik Kim";
        this.year=1991;
        this.country="South Korea";
    }
    public Song(String title, String artist, int year, String country){
        this.title=title;
        this.artist=artist;
        this.year=year;
        this.country=country;
    }
    public void show(){
        System.out.println(year+" year "+title+" song by "+artist+" from "+country);
    }
}
public class problem_04_03 {
    public static void main(String[] args) {
        Song dq=new Song("Dancing Queen","ABBA",1978,"Sweden");
        dq.show();
    }
    
}

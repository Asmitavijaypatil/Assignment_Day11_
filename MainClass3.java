import java.util.Scanner;
class Song {
    private String title;
    private String artist;
    private double duration;

    public Song(String title, String artist, double duration) {
        this.title = title;
        this.artist = artist;
        this. duration = duration;
    }
    public String toString() {
        return "title of the song is"+" "+ title + " & " + artist +" " + "is a artist & timing of the song " + duration  + "Minutes"; 
    }
}
public class MainClass3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Song Title: ");
        String title = sc.nextLine();

        System.out.print("Enter Artist: ");
        String artist = sc.nextLine();

        System.out.print("Enter Duration of song: ");
        double duration = sc.nextDouble();

        Song s = new Song (title, artist, duration);
        System.out.println(s);
    }
}
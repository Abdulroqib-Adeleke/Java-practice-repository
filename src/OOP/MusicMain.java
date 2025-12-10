package OOP;

import java.util.ArrayList;

public class MusicMain {

    public static void main(String[] args) {
        Music music = new Music();
        music.addSong("Drake God's plan");
        music.addSong("Dj khaleed I'm the one");
        music.addSong("Rihana Work");
        music.printAllSongs();
        music.playAll();
        music.removeSong("Rihana Work");
        music.printAllSongs();
        music.playAll();

    }
}
class Music{
    private final ArrayList<String> song;

    public Music(){
        song = new ArrayList<>();
    }

    public void addSong(String song){
        this.song.add(song);
    }

    public void removeSong(String song){
        this.song.remove(song);
    }

    public void playAll(){
        System.out.println("All songs are playing serially.");
    }
    public void printAllSongs(){
        for(int i = 0; i< song.size(); i++){
            System.out.println(i +1 + "- " + song.get(i));
        }
    }
}

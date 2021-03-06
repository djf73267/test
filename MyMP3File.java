
import java.util.*;

public class MyMP3File extends SimpleArrayList implements Playable, Comparator<Playable> {

    private String name; // contains the name of the playlist
    private ArrayList<Playable> playableList; // ArrayList of Playable elements that make up the play list

    // constructor
    public MyMP3File() { // empty play list named "Untitled"
        this.name = "Untitled";
        playableList = new ArrayList<Playable>();
    }

    public MyMP3File(String newName) { // empty play list
        this.name = newName;
        playableList = new ArrayList<Playable>();
    }

    public boolean loadSongs(String fileName) {
        return true;
    }

    @Override
    public void play() {
        System.out.println("Now playing: " + name);
    }

    @Override
    public String getName() {
        return name;
    }

    public int compareTo(Playable s) {
        if (name.equals(s.getName())) {
            return 0;
        } else if (name.compareTo(s.getName()) == 1) {
            return 1;
        }
         return -1;
    }

    //clear method
    public boolean clear() {
        this.name = "";
        playableList.removeAll(playableList);
        return true;
    }
  
    //adding song
    public boolean addSong(MP3File s){
        playableList.add(s);
        return true;
    }
  
    public Playable removePlayable(int index){ // removes Playable element at index from the list and returns it
        Playable obj = playableList.get(index);
        playableList.remove(index);
        return obj;
    }
  
    public Playable removePlayable(Playable p){
        playableList.remove(p);
        return null;
    }
  
    public Playable getPlayable(int index) {
        return playableList.get(index);
    }
  
    public boolean addPlayList(MyMP3File pl) {
        if(playableList.contains(pl)){
            return false;
        }
        this.name = pl.name;
        this.playableList = pl.playableList;
        return true;
    }
  


    public int compare(Playable o1, Playable o2) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public static void main (String[] args) {
        for (String s: args) {
            System.out.println(s);
        }
    }
}
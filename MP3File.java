

public class MP3File implements Comparable<MP3File>, Playable{

    private String artist; // the artist performing the song
    private String title; // the title of the song
    private String pathname;
    private String album;
    private String date;
    public MP3File(String artist, String title, String album, String date, String pathname) {
        this.artist= artist;
        this.title = title;
	this.album = album;
	this.date = date;
	this.pathname = pathname;
    }

    

    public MP3File(MP3File s) {
        this.artist= s.artist;
        this.title = s.title;
	this.album = album;
	this.date = date;
	this.pathname = pathname;


        return;
    }
    public int compareTo(MP3File s){
       if((artist.equals(s.artist)) && title.equals(s.title)){
           return 0;
       }
       return 1;
    }
    public boolean equals(MP3File o) { // a song is equal if all four fields are equal
        if(compareTo(o) == 0){
            return true;
        }
        return false;
    }
  
    //getter setter methods
    public String getArtist() {      
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAlbum(String album){
	this.album = album;


    }
    public String getAlbum(){
	return album;


    }
    public String getDate(){
	return date;

    

    }
    public void setDate(String date){
	this.date = date;




    }
    public void setPath(String pathname){
	this.pathname = pathname;



    }
    public String getPath(){

	return pathname;




    }
    public String toString() {
        // Use this code for toString EXACTLY
        return "{Song: title = " + title + " artist = " + artist + "}";
    }

    public void play() { // Use this code for play EXACTLY
        System.out.printf("Playing Song: artist = %-20s title = %s\n", artist, title);
    }

    public String getName() {
    	
        return artist;
    }




}
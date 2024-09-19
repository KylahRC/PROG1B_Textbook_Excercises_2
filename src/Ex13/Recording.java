package Ex13;

public class Recording {
    private String title;
    private String artist;
    private int playingTime; // in seconds

    // Constructor
    public Recording(String title, String artist, int playingTime) {
        this.title = title;
        this.artist = artist;
        this.playingTime = playingTime;
    }

    // Getter and Setter for title
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    // Getter and Setter for artist
    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    // Getter and Setter for playing time
    public int getPlayingTime() {
        return playingTime;
    }

    public void setPlayingTime(int playingTime) {
        this.playingTime = playingTime;
    }

    @Override
    public String toString() {
        return "Recording [Title=" + title + ", Artist=" + artist + ", Playing Time=" + playingTime + " seconds]";
    }
}


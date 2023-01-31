package music;

import java.io.InputStream;

public class Song {
    private String nameSong;
    private String author;
    private InputStream Lyrics;

    public Song() {

    }

    public Song(String nameSong, String author, InputStream lyrics) {
        this.nameSong = nameSong;
        this.author = author;
        Lyrics = lyrics;
    }

    public String getNameSong() {
        return nameSong;
    }

    public void setNameSong(String nameSong) {
        this.nameSong = nameSong;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public InputStream getLyrics() {
        return Lyrics;
    }
    public void setLyrics(InputStream lyrics) {
        Lyrics = lyrics;
    }

    @Override
    public String toString() {
        return "Song{" +
                "nameSong='" + nameSong + '\'' +
                ", author='" + author + '\'' +
                ", Lyrics=" + Lyrics +
                '}';
    }
}

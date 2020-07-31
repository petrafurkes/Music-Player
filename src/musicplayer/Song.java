/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package musicplayer;

/**
 *
 * @author Petra Furkes
 * 05.07.2020.
 */
public class Song {
    private String songName;
    private int relasedYear;
    private String song;
    

    //constructor 
    public Song(String song) {
        this.song = song;
    }
    
    public Song() {
    }
    
    //getter
    public String getSong() {
        return song;
    }
    
    //setter
    public void setSong(String song) {
        this.song = song;
    }
    
    //getter
    public String getSongName() {
        return songName;
    }

    //setter
    public void setSongName(String songName) {
        this.songName = songName;
    }

    //getter
    public int getRelasedYear() {
        return relasedYear;
    }

    //setter
    public void setRelasedYear(int relasedYear) {
        this.relasedYear = relasedYear;
    }
    
}
    
    
    
    
    


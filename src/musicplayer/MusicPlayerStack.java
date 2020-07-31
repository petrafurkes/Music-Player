/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package musicplayer;

import java.util.ArrayList;


/**
 *
 * @author Petra Furkes
 * 05.07.2020.
 */
public class MusicPlayerStack implements MusicInterface{
    private ArrayList<Song> theMusicStack;
    
    
    public MusicPlayerStack(){
        theMusicStack = new ArrayList<Song>();
    }

    //method for checking if the list is empty
    public boolean isEmpty() {
        return theMusicStack.isEmpty();
    }

    //method for checking if the list is full
    public boolean isFull() {
        return false;
    }

    //method for adding new song, 
    //every new song will be added on the position 0
    public void push(Object song) {
        theMusicStack.add(0,(Song)song);
    }

    //method for removing top song, top song is last added on the play list
    public Song pop() {
         if(!theMusicStack.isEmpty())
            return theMusicStack.remove(0);
        else
            return null;
    }

    //method for displaying play list, in descending order - last added is first when displaying list
    public String displayStack() {
        StringBuilder builder = new StringBuilder();
         for (int i = 0; i<theMusicStack.size();i++){
             Song s = theMusicStack.get(i);
             builder.append("The song " + s.getSong());
             builder.append("\n");
         }
            
        return builder.toString();
    }

    //method for returning the size of the playlist
    public int size() {
        return theMusicStack.size();
    }
    
    public String searchSong(String searchedSong){
       
       for(int i = 0; i < theMusicStack.size(); i++){
            if(searchedSong.equals(theMusicStack.get(i).getSong())){
                Song s = theMusicStack.get(i);
                return theMusicStack.get(i).getSong();
        } 
       
    }
      return null;
    }
}

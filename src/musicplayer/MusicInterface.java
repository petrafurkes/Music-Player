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
public interface MusicInterface {
    public boolean isEmpty();
    public boolean isFull();
    public void push(Object song);
    public Object pop();
    public String displayStack();
    public int size();
}

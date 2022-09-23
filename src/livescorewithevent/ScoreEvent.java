/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package livescorewithevent;
import java.util.EventObject;

/**
 *
 * @author ASUS
 */
public class ScoreEvent extends EventObject{
    private int getScore;
    public ScoreEvent(Object o, int score) {
        super(o);
    }

    public int setScoreLine(){
       
        return getScore;
    }
}

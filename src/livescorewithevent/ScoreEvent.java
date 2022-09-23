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
    private String getScore;
    public ScoreEvent(Object o,String score) {
        super(o);
        getScore = score;
    }

    public String setScoreLine(){
       
        return getScore;
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package livescorewithevent;

/**
 *
 * @author ASUS
 */
public class Subscriber2 implements ScoreListener {
    @Override
    public void scoreChange(ScoreEvent e) {
        System.out.println(e.setScoreLine()+" UAE");
    }
    
}

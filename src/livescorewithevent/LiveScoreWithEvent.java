/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package livescorewithevent;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class LiveScoreWithEvent {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ScoreSource source = new ScoreSource();
        Subscriber1 sub1 = new Subscriber1();
        Subscriber2 sub2 = new Subscriber2();
      
        source.addScoreListener(sub1);
        source.addScoreListener(sub2);
        //source.setScore("Thai 1-0 UAE");
        //source.setScore("Thai 4-0 UAE");
        
        Scanner sc = new Scanner(System.in);
        String score;
        boolean x = true;
        while(true){
            System.out.println("Enter Score: ");
            score = sc.nextLine();
            source.setScore(score);
            source.setScore(score);
            
            if(score==null){
                break;
            }
             
        }
        
    }
}
    


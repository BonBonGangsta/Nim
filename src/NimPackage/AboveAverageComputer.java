/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package NimPackage;
import java.util.Random;

/**
 *  The AboveAverageComputer will remove a random number between half 
 * @author byrondepaz
 */
public class AboveAverageComputer implements Player {
    private String name ;
    private int marblesTaken ;
    
    public AboveAverageComputer()
    {
        name = "Hal 9000" ;
    }
    
    public AboveAverageComputer(String name)
    {
        this.name = name ;
    }
    
    public int move(int pile)
    {
        int marbles ;
        if (pile != 2)
        {
        Random answer = new Random();
        int maxRemoval = (int) pile / 2 ;
        marbles = answer.nextInt(maxRemoval - 1) + 1 ;
        marblesTaken += marbles ;
        return marbles; 
        }
        return 1;     
    }
    
    public String playerName()
    {
        return name;
    }
    
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package NimPackage;
import java.util.Random;

/**
 * The AboveAverageComputer will remove a random number between 1 and half 
 * of the number left in the pile.
 */
public class AboveAverageComputer implements Player {
    private String name ; // name of the AboveAverageComputer player.
    private int marblesTaken ; // total number of marbles taken.
    
    /**
     * creates an AboveAverageComputer player with a default name of 
     * "Hal 9000".
     */
    public AboveAverageComputer()
    {
        name = "Hal 9000" ; // I'm sorry Greg, but I can't let you do that.
    }
    
    /**
     * Creates an AboveAverageComputer with a given name.
     * @param name name to be given to the computer player.
     */
    public AboveAverageComputer(String name)
    {
        this.name = name ;
    }
    
    /**
     * The AboveAverageComputer will randomly remove a number of objects
     * from the pile between 1 and half of the objects in the pile.
     * @param pile number of objects in the pile.
     * @return a random number between 1 and pile/2.
     */
    public int move(int pile)
    {
        int marbles = 1; // mimnum number of objects that can be removed.
        // if the pile is 2 just return 1 and win the game.
        if (pile != 2)
        {
            // create a random number generator called answer.
            Random answer = new Random();
            // generate the upper bound of for the random # number which is
            // half of the number in the pile.
            int maxRemoval = (int) pile / 2 ;
            // the minimum is 1 and half the pile.
            marbles = answer.nextInt(maxRemoval - 1) + 1 ;
            // add the number generated to the number to the number
            // to the total taken.
            marblesTaken += marbles ;
            // return it.
            return marbles; 
        }
        // returns 1 since that is the mininum that can be taken.
        return marbles;     
    }
    
    /**
     * returns the computer's name.
     * @return String of the name.
     */
    public String playerName()
    {
        return name;
    }
    
}

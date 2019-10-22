/*
 */
package NimPackage;
import java.util.ArrayList;
/**
 * creates a supercomputer to play a game.
 * @author bydepa
 */
public class SuperComputerPlayer implements Player {
    private String name ; // string of name.
    private int marblesTaken ; // total number of objects taken from the pile.
    private ArrayList<Integer> key; // Array list of key answers.
    
    /**
     * Creates a supercomputer player with the best default name, then 
     * generates the array for the key values.
     * @param upperLimit initial number of object in the pile.
     */
    public SuperComputerPlayer( int upperLimit)
    {
        // set the best name ever.
        this.name = "N00BSLAY3R";
        // initialize the array with the key values needed.
        key = new ArrayList<Integer>() ;
        // fill in the values.
        generateKey(upperLimit);
    }
    
    /**
     * create a supercomputer player with a name and generate the array for
     * the array for the key values.
     * @param name string of the name.
     * @param upperLimit initial number of object in the pile.
     */
    public SuperComputerPlayer(String name, int upperLimit)
    {
        // set the name.
        this.name = name ;
        // initialize the arraylist.
        key = new ArrayList<Integer>() ;
        // fill in the values.
        generateKey(upperLimit);
        
    }
    
    /**
     * remove the right amount of marbles so that the remaining pile is a 
     * value of 2 to the nth power - 1.
     * @param pile number objects in the pile currently
     * @return the number of marbles to remove in order to make the remaining
     * pile 2^n - 1.
     */
    public int move(int pile)
    {
        int marbles = 1; // marbles that will be taken at the end.
        boolean matchFound = false; // switch to leave loop
        int lastKey = 1 ; // last key will be set to 1 for when the pile is 2.
        if (pile != 2)
        {
            // if the pile is not 2 and the match is false
            while(!matchFound)
            {
                // start at the first index
                int i = 0;
                // set the keyValue to the int in the index.
                int keyValue = this.key.get(i);
                // test to see if the keyValue is greater than the #
                // of objects in the pile
                if (keyValue >= pile)
                {
                    // if true, then assign the value in the previous index
                    matchFound = true;
                    lastKey = key.get(i-1);
                }
                i++; // increment the index to test again.
            }
            // The number of marbles to take is the difference between
            // the # in the pile and the key value.
            // Note: the goal is to have the remaining pile be a value
            // that is 2 to the nth power minus 1.
                marbles = pile - lastKey ;
                // add to the total number of piles.
                marblesTaken += marbles ;
                return marbles;
        }
        // if the pile is 2, remove one marble and return the move as a 1.
        marblesTaken += marbles;
        return marbles;
    }
    
    /**
     * return the string with the number.
     * @return  name of the player.
     */
    public String playerName()
    {
      return name;  
    }
    
    /**
     * Fill the array with values of 2 to the nth power minus 1.
     * @param upperLimit 
     */
    private void generateKey(int upperLimit)
    {
        // switch to escape the for loop
        boolean meetKey = false;
        
        for(int i=0; !meetKey; i++)
        {
            int keyValue = (int)(Math.pow(2,i)) - 1 ;
            key.add(keyValue);
            if(keyValue >= upperLimit)
            {
                meetKey = true ;
            }
        }
    }
}

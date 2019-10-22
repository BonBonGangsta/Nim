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
        int marbles;
        boolean matchFound = false;
        int lastKey = 1 ;
        if (pile != 2)
        {
            while(!matchFound)
            {
                int i = 0;
                int keyValue = this.key.get(i);
                if (keyValue >= pile)
                {
                    matchFound = true;
                    lastKey = key.get(i-1);
                }
                i++;
            }
                marbles = pile - lastKey ;
                marblesTaken += marbles ;
                return marbles;
        }
        marblesTaken += lastKey;
        return 1;
    }
    
    public String playerName()
    {
      return name;  
    }
    
    private void generateKey(int upperLimit)
    {
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

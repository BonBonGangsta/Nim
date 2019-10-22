/*
 * 
 */
package NimPackage;

/**
 * creates a human player to play a game of Nim.
 * @author byrondepaz
 */
public class Human implements Player {
    private String name; // name of player
    private int marblesTaken; // total number of marbles taken in a game
    
    /**
     * creates a human player with a default name of John Doe.
     */
    public Human()
    {
        // if no name wants to be given, we have a back up
        this.name = "John Doe" ;
    }
    
    /**
     * Creates a human player with a given name.
     * @param name name of the player.
     */
    public Human(String name)
    {
        this.name = name;
    }

    /**
     * return the player name.
     * @return String with the human player's name
     */
    public String playerName() 
    {
        return name;
    }
    
    /**
     * calculates the maximum number that can be removed from the pile.
     * @param pile number of objects left in the pile.
     * @return maximum number that can be removed which is #left / 2.
     */
    public int move(int pile)
    {
        int maxRemoval = 1; // creates an int for the max # but with the min.
        // if the pile is 2, you can only remove 1 from the pile and win.
        if (pile != 2)
        {
            // if not 2, then the max removal can only be half of the pile.
            maxRemoval = (int) pile / 2 ;
            return maxRemoval ; // return the maximum
        }
        return maxRemoval; // the maximum removal of a pile of 2 is 1.
    }
    
    /**
     * Add the number objects passed , to the counter.
     * @param marbles number of objects in the pile chosen to remove.
     */
    public void addToMarbles(int marbles)
    {
        marblesTaken += marbles ;
    }
}

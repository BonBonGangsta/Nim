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
    private final String race = "HUM"; // the best race, the human race
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
    public int move(int move)
    {
        addToMarbles(move);
        return move;
    }
    
    public String getRace()
    {
        return race;
    }
    
    /**
     * Add the number objects passed , to the counter.
     * @param marbles number of objects in the pile chosen to remove.
     */
    private void addToMarbles(int marbles)
    {
        marblesTaken += marbles ;
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NimPackage;

/**
 *
 * @author byrondepaz
 */
public class Human implements Player {
    private String name;
    private int marblesTaken;
    
    public Human(){
        this.name = "John Doe" ;
    }
    
    public Human(String name)
    {
        this.name = name;
    }

    public String playerName() 
    {
        return name;
    }
    
    public int move(int pile)
    {
        int maxRemoval;
        if (pile != 2)
        {
            maxRemoval = (int) pile / 2 ;
            return maxRemoval ;
        }
        return 1;
    }
    
    public void addToMarbles(int marbles)
    {
        marblesTaken += marbles ;
    }
}

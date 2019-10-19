/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NimPackage;

/**
 *
 * @author bydepa
 */
public class SuperComputerPlayer implements Player {
    private String name ;
    private int marblesTaken ;
    
    public SuperComputerPlayer()
    {
        this.name = "N00BSLAYER";
    }
    
    public SuperComputerPlayer(String name)
    {
        this.name = name ;
    }
    public int move(int pile)
    {
        int marbles ;
        if (pile != 2)
        {
            marbles = (int) Math.round(Math.log(pile + 1) / Math.log(2));
            marblesTaken += marbles;
            return marbles;
        }
        else 
        {
            marblesTaken ++;
            return 1;
        }
    }
    
    public String playerName()
    {
      return name;  
    }
}

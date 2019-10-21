/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NimPackage;
import java.util.ArrayList;
/**
 *
 * @author bydepa
 */
public class SuperComputerPlayer implements Player {
    private String name ;
    private int marblesTaken ;
    private ArrayList<Integer> key;
    
    public SuperComputerPlayer( int upperLimit)
    {
        this.name = "N00BSLAY3R";
        key = new ArrayList<Integer>() ;
        generateKey(upperLimit);
    }
    
    public SuperComputerPlayer(String name, int upperLimit)
    {
        this.name = name ;
        key = new ArrayList<Integer>() ;
        generateKey(upperLimit);
        
    }
    public int move(int pile)
    {
        int marbles;
        boolean matchFound = false;
        if (pile != 2)
        {
            while(!matchFound)
            {
                int i = 0;
                int keyValue = this.key.get(i);
                if (keyValue >= pile)
                {
                    matchFound = true;
                }
                int lastKey = keyValue;
                marbles = pile - lastKey ;
                marblesTaken += marbles ;
                return marbles;
            }
        }
        marblesTaken += 1;
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

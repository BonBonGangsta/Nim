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
    
    public Human(String name)
    {
        this.name = name;
    }
    

    @Override
    public int move(Pile pile) {
        
        return 0;
    }

    @Override
    public String playerName(String name) {
        return this.name;
    }
}

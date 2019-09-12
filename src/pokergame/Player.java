/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pokergame;

/**
 *
 * @author oliverioro_cis21035
 */
public class Player {
    private String name;
    private int chips;
    private int bet;
    private Hand hand;
    private boolean isInPlay;
    
    public Player(String name,int chips){
        this.name=name;
        this.chips=chips;
        isInPlay=true;
    }
    public void bet(int bet){
        this.bet=bet;
    }
}

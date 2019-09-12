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
public class Card 
{
    private short rank, suit;
    private String[] suits={"hearts","spades","diamonds","clubs"};
    private String[] ranks = {"Ace","2", "3", "4", "5", "6", "7","8", "9", "10", "Jack", "Queen", "King"};

    Card(int a, int b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String rankAsString( int __rank )
    {
        return ranks[__rank];
    }

    public Card(short suit, short rank)
    {
        this.rank=rank;
        this.suit=suit;
    }

    public @Override String toString()
    {
        return ranks[rank] + "of " + suits[suit];
    }

    public short getRank() { //Assign rank.
        return rank;
    }

    public short getSuit() { //Assign suit.
        return suit;
    }
}
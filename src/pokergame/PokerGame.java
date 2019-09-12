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
public class PokerGame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Deck deck= new Deck(); 
        Hand hand= new Hand(deck);
        Hand hand2= new Hand(deck); 

        System.out.printf("%-16s\n","Top hand:");
        hand.displayAll();
        System.out.printf("%-16s\n","Bottom hand:");
        hand2.displayAll();
        System.out.printf("\n\n");

      
        if(hand.compareTo(hand2) == 1)
        System.out.println("Result: Top hand wins!");

        else if(hand.compareTo(hand2) == -1)
        System.out.println("Result: Bottom hand wins!");

        else
        System.out.println("Result: Draw!");
    }
}
    

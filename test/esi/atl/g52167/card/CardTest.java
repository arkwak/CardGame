/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esi.atl.g52167.card;

import org.junit.Test;
import static org.junit.Assert.*;
import esi.atl.g52167.card.Color;
import esi.atl.g52167.card.Value;

/**
 *
 * @author Laurent
 */
public class CardTest {
    
    public CardTest() {
    }

    /**
     * Test of Card Constructor, of class Card.
     */
    @Test(expected = NullPointerException.class)
    public void testCardWhenColorIsNull() {
        System.out.println("testCardWhenColorIsNull");
        Card card1 = new Card(null,Value.ACE);
        
    }
    
    /**
     * Test of Card Constructor, of class Card.
     */
    @Test(expected = NullPointerException.class)
    public void testCardWhenValueIsNull() {
        System.out.println("testCardWhenValueIsNull");
        Card card1 = new Card(Color.CLUB,null);
        
    }
}

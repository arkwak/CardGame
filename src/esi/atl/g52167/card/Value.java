/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esi.atl.g52167.card;

/**
 *
 * @author Laurent
 */
public enum Value {

    /**
     * the value "ace" for the card
     */
    ACE("as"),
    /**
     * the value "two" for the card
     */
    TWO("deux"),
    /**
     * the value "three" for the card
     */
    THREE("trois"),
    /**
     * the value "four" for the card
     */
    FOUR("quatre"),
    /**
     * the value "five" for the card
     */
    FIVE("cinq"),
    /**
     * the value "six" for the card
     */
    SIX("six"),
    /**
     * the value "seven" for the card
     */
    SEVEN("sept"),
    /**
     * the value "eight" for the card
     */
    EIGHT("huit"),
    /**
     * the value "nine" for the card
     */
    NINE("neuf"),
    /**
     * the value "ten" for the card
     */
    TEN("dix"),
    /**
     * the value "jack" for the card
     */
    JACK("valet"),
    /**
     * the value "queen" for the card
     */
    QUEEN("dame"),
    /**
     * the value "king" for the card
     */
    KING("roi");

    
private String fr;

    Value(String fr) {
        this.fr = fr;
    }

    /**
     *
     * @return
     */
    public String getString() {
        return fr;
    }

    @Override
    public String toString() {
        return fr;
    }
}
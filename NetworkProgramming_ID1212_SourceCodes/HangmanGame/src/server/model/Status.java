/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package server.model;

/**
 * @author koszio
 * @author aristotelis
 */
public class Status {

    private final int remainingMisses;
    private final String word;

    public Status(int remainingMisses, String word) {
        this.remainingMisses = remainingMisses;
        this.word = word;
    }
    
    public int getMisses() {
        return remainingMisses;
    }

    public String getWord() {
        return word;
    }
}

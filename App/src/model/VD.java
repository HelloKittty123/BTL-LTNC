/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Dell
 */
public class VD {
    int mavong, tenvong;

    public VD() {
    }

    public VD(int mavong, int tenvong) {
        this.mavong = mavong;
        this.tenvong = tenvong;
    }

    public VD(int tenvong) {
        this.tenvong = tenvong;
    }
    
    public int getMavong() {
        return mavong;
    }

    public void setMavong(int mavong) {
        this.mavong = mavong;
    }

    public int getTenvong() {
        return tenvong;
    }

    public void setTenvong(int tenvong) {
        this.tenvong = tenvong;
    }
    
    
}

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
public class TD {
    int matran, mavong, tentran;

    public TD() {
    }

    public TD(int matran, int mavong, int tentran) {
        this.matran = matran;
        this.mavong = mavong;
        this.tentran = tentran;
    }

    public TD(int matran, int tentran) {
        this.matran = matran;
        this.tentran = tentran;
    }

    public int getMatran() {
        return matran;
    }

    public void setMatran(int matran) {
        this.matran = matran;
    }

    public int getMavong() {
        return mavong;
    }

    public void setMavong(int mavong) {
        this.mavong = mavong;
    }

    public int getTentran() {
        return tentran;
    }

    public void setTentran(int tentran) {
        this.tentran = tentran;
    }
            
}

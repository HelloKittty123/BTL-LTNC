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
public class CLB {

    int madoi, socauthu;
    String tendoi, doitruong, HLV, linkImage;

    public CLB() {
    }

    public CLB(int madoi, int socauthu, String tendoi, String doitruong, String HLV, String linkImage) {
        this.madoi = madoi;
        this.socauthu = socauthu;
        this.tendoi = tendoi;
        this.doitruong = doitruong;
        this.HLV = HLV;
        this.linkImage = linkImage;
    }

    public CLB(int socauthu, String tendoi, String doitruong, String HLV, String linkImage) {
        this.socauthu = socauthu;
        this.tendoi = tendoi;
        this.doitruong = doitruong;
        this.HLV = HLV;
        this.linkImage = linkImage;
    }
        
    public int getMadoi() {
        return madoi;
    }

    public void setMadoi(int madoi) {
        this.madoi = madoi;
    }

    public int getSocauthu() {
        return socauthu;
    }

    public void setSocauthu(int socauthu) {
        this.socauthu = socauthu;
    }

    public String getTendoi() {
        return tendoi;
    }

    public void setTendoi(String tendoi) {
        this.tendoi = tendoi;
    }

    public String getDoitruong() {
        return doitruong;
    }

    public void setDoitruong(String doitruong) {
        this.doitruong = doitruong;
    }

    public String getHLV() {
        return HLV;
    }

    public void setHLV(String HLV) {
        this.HLV = HLV;
    }

    public String getLinkImage() {
        return linkImage;
    }

    public void setLinkImage(String linkImage) {
        this.linkImage = linkImage;
    }

    
}

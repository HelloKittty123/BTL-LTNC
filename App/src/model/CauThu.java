/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Date;

/**
 *
 * @author Dell
 */
public class CauThu {

    int madoi, macauthu, soao;
    Date ngaysinh;
    String tendoi, tencauthu, vitri, linkImage;

    public CauThu() {
    }

    public CauThu(int madoi, int macauthu, int soao, Date ngaysinh, String tendoi, String tencauthu, String vitri, String linkImage) {
        this.madoi = madoi;
        this.macauthu = macauthu;
        this.soao = soao;
        this.ngaysinh = ngaysinh;
        this.tendoi = tendoi;
        this.tencauthu = tencauthu;
        this.vitri = vitri;
        this.linkImage = linkImage;
    }

    public CauThu(int madoi, int soao, Date ngaysinh, String tencauthu, String vitri, String linkImage) {
        this.madoi = madoi;
        this.soao = soao;
        this.ngaysinh = ngaysinh;
        this.tencauthu = tencauthu;
        this.vitri = vitri;
        this.linkImage = linkImage;
    }

    public CauThu(int madoi, int macauthu, int soao, Date ngaysinh, String tencauthu, String vitri, String linkImage) {
        this.madoi = madoi;
        this.macauthu = macauthu;
        this.soao = soao;
        this.ngaysinh = ngaysinh;
        this.tencauthu = tencauthu;
        this.vitri = vitri;
        this.linkImage = linkImage;
    }
    
    public int getMadoi() {
        return madoi;
    }

    public void setMadoi(int madoi) {
        this.madoi = madoi;
    }

    public int getMacauthu() {
        return macauthu;
    }

    public void setMacauthu(int macauthu) {
        this.macauthu = macauthu;
    }

    public int getSoao() {
        return soao;
    }

    public void setSoao(int soao) {
        this.soao = soao;
    }

    public Date getNgaysinh() {
        return ngaysinh;
    }

    public void setNgaysinh(Date ngaysinh) {
        this.ngaysinh = ngaysinh;
    }

    public String getTendoi() {
        return tendoi;
    }

    public void setTendoi(String tendoi) {
        this.tendoi = tendoi;
    }

    public String getTencauthu() {
        return tencauthu;
    }

    public void setTencauthu(String tencauthu) {
        this.tencauthu = tencauthu;
    }

    public String getVitri() {
        return vitri;
    }

    public void setVitri(String vitri) {
        this.vitri = vitri;
    }

    public String getLinkImage() {
        return linkImage;
    }

    public void setLinkImage(String linkImage) {
        this.linkImage = linkImage;
    }

    
}

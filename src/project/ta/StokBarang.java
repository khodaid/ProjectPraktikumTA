/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project.ta;

/**
 *
 * @author khoirul-06990
 */
public class StokBarang {
    private String tempat, barang;
    private  int jumlah;

    public StokBarang() {
    }

    public StokBarang(String barang, int jumlah, String tempat) {
        this.tempat = tempat;
        this.barang = barang;
        this.jumlah = jumlah;
    }

    public String getTempat() {
        return tempat;
    }

    public void setTempat(String tempat) {
        this.tempat = tempat;
    }

    public String getBarang() {
        return barang;
    }

    public void setBarang(String barang) {
        this.barang = barang;
    }

    public int getJumlah() {
        return jumlah;
    }

    public void setJumlah(int jumlah) {
        this.jumlah = jumlah;
    }
    
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project.ta;
import java.util.*;
/**
 *
 * @author khoirul-06990
 */
public class Controller {
    
    static ArrayList<StokBarang> SB = new ArrayList<>();
    
    public static boolean trace(String barang)
    {
        boolean hasil = false;
        for (int i = 0; i<SB.size(); i++)
        {
            if(SB.get(i).getBarang().equals(barang))
            {
                hasil = true;
            }
        }return hasil;
    }
    
    public static void insert(String barang, int jumlah, String tempat)
    {
        SB.add(new StokBarang(barang, jumlah, tempat));
    }
    
    public static int out(int keluar, String barang)
    {
        int hasil = 0;
        for(int i = 0; i<SB.size(); i++)
        {
            if (SB.get(i).getBarang().equals(barang))
            {
                hasil = SB.get(i).getJumlah() - keluar;
                break;
            }
        }
        return hasil;
    }
    
    public static int in(int masuk, String barang)
    {
        int hasil = 0;
        for(int i = 0; i<SB.size(); i++)
        {
            if (SB.get(i).getBarang().equals(barang))
            {
                hasil = SB.get(i).getJumlah() + masuk;
                break;
            }
        }
        return hasil;
    }
    
    public static void update(int jumlah, String barang)
    {
        int cout = 0;
        while(!SB.get(cout).getBarang().equals(barang))
        {
            cout++;
        }
        
        if(SB.get(cout).getBarang().equals(barang))
        {
            SB.set(cout, new StokBarang(SB.get(cout).getBarang(), jumlah, SB.get(cout).getTempat()));
        }
    }
    
}

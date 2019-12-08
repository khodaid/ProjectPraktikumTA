/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project.ta;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.event.*;
import javax.swing.*;
import javax.swing.table.*;
/**
 *
 * @author khoirul-06990
 */
public class List extends KomponenList {
    static Object[] col = {"Nama","Jumlah","Tempat"} ;
    static Object[][] row = {};
    public void GuiList()
    {
        DefaultTableModel model = new DefaultTableModel(row, col);
        for(int i = 0; i<Controller.SB.size(); i++)
        {
            model.addRow(new Object[]{Controller.SB.get(i).getBarang(), Controller.SB.get(i).getJumlah(), Controller.SB.get(i).getTempat()});
        }
        list = new JTable(model);
        JTableHeader header = list.getTableHeader();
        header.setBackground(Color.LIGHT_GRAY);
        header.setBounds(20, 10, 500, 20);
        list.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        list.setCellEditor(null);
        list.setBounds(20, 30, 500, 200);
        masuk.setBounds(100, 300, 100, 30);
        masuk.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                Home k = new Home();
                k.GuiHome();
                setVisible(false);
            }
        });
        keluar.setBounds(340, 300, 100, 30);
        keluar.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                Keluar k = new Keluar();
                k.GuiKeluar();
                setVisible(false);
            }
        });
        add(header);
        add(list);
        add(masuk);
        add(keluar);
        setTitle("List Barang");
        setSize(540, 350);
        setLayout(null);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}

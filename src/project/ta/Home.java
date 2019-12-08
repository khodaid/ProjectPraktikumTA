/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project.ta;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author khoirul-06990
 */
public class Home extends KomponenHome{
    public void GuiHome()
    {
        labelBarang.setBounds(10, 30, 120, 20);
        labelBarang.setVisible(true);
        fieldBarang.setBounds(130, 30, 150, 20);
        fieldBarang.setVisible(true);
        labelJumlah.setBounds(10, 60, 120, 20);
        labelJumlah.setVisible(true);
        spinJumlah.setBounds(130, 60, 35, 20);
        spinJumlah.setVisible(true);
        labelTempat.setBounds(10, 90, 120, 20);
        labelTempat.setVisible(true);
        tempat.setBounds(130, 90, 150, 20);
        tempat.addItem("Dalam");
        tempat.addItem("Luar");
        tempat.setBackground(Color.white);
        submit.setBounds(75, 140, 100, 30);
        submit.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e)
                {
                    if(Controller.trace(fieldBarang.getText())==true)
                    {
                        Controller.update(Controller.in((Integer)spinJumlah.getValue(), fieldBarang.getText()), fieldBarang.getText());
                    }
                    else
                    {
                        Controller.insert(fieldBarang.getText(), (Integer)spinJumlah.getValue(), (String)tempat.getSelectedItem());
                    }
                    List l = new List();
                    l.GuiList();
                    setVisible(false);
                }
        });
        add(labelBarang);
        add(fieldBarang);
        add(labelJumlah);
        add(spinJumlah);
        add(labelTempat);
        add(tempat);
        add(submit);
        setTitle("Tambah");
        setSize(300, 300);
        setLayout(null);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}

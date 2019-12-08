/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project.ta;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
/**
 *
 * @author khoirul-06990
 */
public class Keluar extends KomponenKeluar{
    public void GuiKeluar()
    {
        labelBarang.setBounds(20, 30, 100, 20);
        labelBarang.setVisible(true);
        fieldBarang.setBounds(100, 30, 140, 20);
        fieldBarang.setVisible(true);
        labelJumlah.setBounds(20, 60, 100, 20);
        labelJumlah.setVisible(true);
        spinJumlah.setBounds(100, 60, 30, 20);
        spinJumlah.setVisible(true);
        submit.setBounds(100, 150, 100, 30);
        submit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Controller.update(Controller.out((Integer)spinJumlah.getValue(), fieldBarang.getText()), fieldBarang.getText());
//                fieldBarang.getText();
                List l = new List();
                l.GuiList();
                setVisible(false);
            }
        });
        add(labelBarang);
        add(fieldBarang);
        add(labelJumlah);
        add(spinJumlah);
        add(submit);
        setTitle("Keluar");
        setSize(300, 200);
        setLayout(null);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}

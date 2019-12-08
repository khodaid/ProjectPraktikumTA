/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project.ta;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
/**
 *
 * @author khoirul-06990
 */
public class Login extends KomponenLogin{
    public void Gui()
    {
        stok.setBounds(200, 20, 100, 50);
        user.setBounds(50, 100, 100, 50);
        username.setBounds(150, 110, 200, 30);
        pass.setBounds(50, 150, 100, 50);
        password.setBounds(150, 160, 200, 30);
        login.setBounds(200, 250, 100, 50);
        login.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(User.login(username.getText(),password.getText())==true)
                {
                    List l = new List();
                    l.GuiList();
                    JOptionPane.showMessageDialog((Component)e.getSource(),"Silahkan Berkerja","Success",JOptionPane.INFORMATION_MESSAGE);
                    setVisible(false);
                }
                else
                {
                    JOptionPane.showMessageDialog((Component)e.getSource(), "Username and Password not match","Warning", JOptionPane.WARNING_MESSAGE);
                }
            }
        });
        add(stok);
        add(user);
        add(username);
        add(pass);
        add(password);
        add(login);
        stok.setVisible(true);
        user.setVisible(true);
        username.setVisible(true);
        pass.setVisible(true);
        password.setVisible(true);
        login.setVisible(true);
        setTitle("login");
        setSize(500, 400);
        setLayout(null);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}

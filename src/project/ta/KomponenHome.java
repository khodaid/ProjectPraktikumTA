/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project.ta;
import javax.swing.*;
/**
 *
 * @author khoirul-06990
 */
public class KomponenHome extends JFrame{
    JLabel labelBarang = new JLabel("Nama Barang :");
    JTextField fieldBarang = new JTextField();
    JLabel labelJumlah = new JLabel("Jumlah :");
    JSpinner spinJumlah = new JSpinner();
    JLabel labelTempat = new JLabel("Tempat");
    JComboBox<Object> tempat = new JComboBox<>();
    JButton submit = new JButton("Submit");
    JLabel barangOut = new JLabel("Nama Barang");
    JTextField fieldBarangOut = new JTextField();
    JLabel jumlahOut = new JLabel("Jumlah");
    JSpinner spinJumlahOut = new JSpinner();
    JButton ambil = new JButton("Ambil");
    JTable tabel = new JTable();
}

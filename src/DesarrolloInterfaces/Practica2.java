package DesarrolloInterfaces;

import javax.swing.*;
import java.awt.*;

public class Practica2 {
    public static void main(String[] args) {
        JFrame f=new JFrame();
        f.setBounds(100,100,500,500);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel1=new JPanel();
        panel1.setBounds(0,0,500,500);
        panel1.setBackground(Color.pink);
        JComboBox desplegable=new JComboBox();
        JPanel panel2=new JPanel();
        panel2.setBounds(500,500,500,500);
        panel2.setBackground(Color.black);
        JButton boton1=new JButton("Boton 1");
        JButton boton2=new JButton("Boton 2");
        f.add(panel1);
        f.add(panel2);
        panel1.add(boton1);
        panel2.add(boton2);

    }
}

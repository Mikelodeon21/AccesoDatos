package DesarrolloInterfaces;

import javax.swing.*;
import java.awt.*;

public class Layouts {
    public static void main(String[] args) {
        JFrame ventana=new JFrame("ventana");
        ventana.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        ventana.setBounds(500,500,500,500);
        ventana.setVisible(true);
        JPanel panel=new JPanel();
        ventana.add(panel);
        panel.setLayout(new FlowLayout());
        JButton boton1=new JButton("Boton1");
        JButton boton2=new JButton("Boton2");
        JButton boton3=new JButton("Boton3");
        JButton boton4=new JButton("Long named Button 4");
        JButton boton5=new JButton("5");
        for (int i=1;i<100;i++){
            JButton miBoton=new JButton("boton" + i);
            ventana.add(miBoton);
        }
        JRadioButton piter=new JRadioButton("Left right");
        JRadioButton piterson=new JRadioButton("Right left");
        JButton applyorientation=new JButton("Apply orientation");
        panel.add(boton1);
        panel.add(boton2);
        panel.add(boton3);
        panel.add(boton4);
        panel.add(boton5);
        panel.add(piter);
        panel.add(piterson);
        panel.add(applyorientation);
    }
}

package DesarrolloInterfaces;

import javax.swing.*;
import java.awt.*;

public class Practicar1 {
    public static void main(String[] args) {
        JFrame f=new JFrame();
        f.getContentPane().setLayout(new FlowLayout());
        f.setBounds(10,10,300,200);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JLabel apellidos=new JLabel("Apellidos:");
        JTextField apellidosarea=new JTextField(20);
        JButton botonenviar=new JButton("Enviar");
        JLabel nombre=new JLabel("Nombre:");
        JTextField nombrearea=new JTextField(20);
        JLabel sexo=new JLabel("sexo:");
        JTextField sexoearea=new JTextField(20);
        JLabel nacionalidad=new JLabel("nacionalidad:");
        JTextField nacionalidadarea=new JTextField(20);
        JLabel fecha=new JLabel("Fecha de nacimiento:");
        JTextField fechaarea=new JTextField(20);
        botonenviar=new JButton("Enviar");

        JPanel panel1=new JPanel();
        panel1.setBounds(0,0,100,100);
        panel1.setBackground(Color.black);
        JPanel panel2=new JPanel();
        panel2.setBounds(0,300,100,100);
        panel2.setBackground(Color.blue);
        f.getContentPane().add(nombre);
        f.getContentPane().add(nombrearea);
        f.getContentPane().add(apellidos);
        f.getContentPane().add(apellidosarea);
        f.getContentPane().add(sexo);
        f.getContentPane().add(sexoearea);
        f.getContentPane().add(nacionalidad);
        f.getContentPane().add(nacionalidadarea);
        f.getContentPane().add(fecha);
        f.getContentPane().add(fechaarea);
        f.getContentPane().add(botonenviar);

    }
}

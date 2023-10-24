package DesarrolloInterfaces;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.*;

public class ProyectoCalculadora extends JFrame implements ActionListener {
        String tem="";
        String texto="";
        JMenuBar contenedor;
        JMenu ver,edicion,ayuda ;
        JMenuItem estandar,cientifica,programador,copiar,pegar,historial,ver_ayuda,acerca_calculadora;
        JButton jButton4=new JButton("sin");
        JButton jButton6=new JButton("log");
        JButton jButton7=new JButton("cos");
        JButton jButton10=new JButton("tan");
        JButton jButton13=new JButton("7");
        JButton jButton14=new JButton("8");
        JButton jButton15=new JButton("9");
        JButton jButton16=new JButton("/");
        JButton jButton17=new JButton("4");
        JButton jButton18=new JButton("5");
        JButton jButton19=new JButton("6");
        JButton jButton20=new JButton("*");
        JButton jButton21=new JButton("1");
        JButton jButton22=new JButton("2");
        JButton jButton23=new JButton("3");
        JButton jButton24=new JButton("-");
        JButton jButton25=new JButton("0");
        JButton jButton26=new JButton("+/-");
        JButton jButton27=new JButton(",");
        JButton jButton28=new JButton("+");
        JButton jButton29=new JButton("=");
        JButton jButton30=new JButton("Retroceso");
        JButton jButton31=new JButton("CE");
        JButton jButton34=new JButton("%");
        JButton jButton35=new JButton(".");

        JTextField jTextField1=new JTextField();
        public ProyectoCalculadora(String nombre)
        {
            super(nombre);
            iniciarControles();
        }
        public void  iniciarControles()
        {
            //menu ver
            contenedor=new JMenuBar();
            ver =new JMenu("Ver");
            edicion=new JMenu("Edicion");
            ayuda =new JMenu("Ayuda");
            //creando las item
            estandar =new JMenuItem("Estandar");
            cientifica =new JMenuItem("Cientifica");
            programador =new JMenuItem("Programador");
            copiar =new JMenuItem("Copiar Ctr+c");
            pegar =new JMenuItem("Pegar Ctr+v");
            historial =new JMenuItem("Historial");
            ver_ayuda =new JMenuItem("Ver Ayuda");
            acerca_calculadora =new JMenuItem("Acerca de Calculadora");
            //agregando
            this.setJMenuBar(contenedor);
            contenedor.add(ver);
            contenedor.add(edicion);
            contenedor.add(ayuda);
            ver.add(estandar);
            ver.add(cientifica);
            ver.add(programador);
            edicion.add(copiar);
            edicion.add(pegar);
            edicion.add(historial);
            ayuda.add(acerca_calculadora);
            ayuda.add(ver_ayuda);
            jTextField1.setBounds(50,50,405,35);
            jButton4.setBounds(50,180,60,25);
            jButton6.setBounds(180,180,60,25);
            jButton7.setBounds(50,210,60,25);
            jButton10.setBounds(50,240,60,25);
            //button retrocesos

            jButton30.setBounds(260,95,93,25);
            jButton31.setBounds(356,95,50,25);
            //button numericos
            jButton13.setBounds(260,125,45,25);
            jButton14.setBounds(310,125,45,25);
            jButton15.setBounds(360,125,45,25);
            jButton16.setBounds(410,125,45,25);
            jButton17.setBounds(260,155,45,25);
            jButton18.setBounds(310,155,45,25);
            jButton19.setBounds(360,155,45,25);
            jButton20.setBounds(410,155,45,25);
            jButton21.setBounds(260,185,45,25);
            jButton22.setBounds(310,185,45,25);
            jButton23.setBounds(360,185,45,25);
            jButton24.setBounds(410,185,45,25);
            jButton25.setBounds(260,215,45,25);
            jButton26.setBounds(308,215,50,25);
            jButton27.setBounds(360,215,45,25);
            jButton28.setBounds(410,215,45,25);
            jButton29.setBounds(410,245,42,25);
            this.getContentPane().add(jTextField1);
            this.getContentPane().add(jButton4);
            this.getContentPane().add(jButton6);
            this.getContentPane().add(jButton7);
            this.getContentPane().add(jButton10);
            this.getContentPane().add(jButton13);
            this.getContentPane().add(jButton14);
            this.getContentPane().add(jButton15);
            this.getContentPane().add(jButton16);
            this.getContentPane().add(jButton17);
            this.getContentPane().add(jButton18);
            this.getContentPane().add(jButton19);
            this.getContentPane().add(jButton20);
            this.getContentPane().add(jButton21);
            this.getContentPane().add(jButton22);
            this.getContentPane().add(jButton23);
            this.getContentPane().add(jButton24);
            this.getContentPane().add(jButton25);
            this.getContentPane().add(jButton26);
            this.getContentPane().add(jButton27);
            this.getContentPane().add(jButton28);
            this.getContentPane().add(jButton29);
            this.getContentPane().add(jButton30);
            this.getContentPane().add(jButton31);
            this.getContentPane().add(jButton34);
            this.getContentPane().add(jButton35);

            //poniendo al evento
            jButton4.addActionListener(this);
            jButton6.addActionListener(this);
            jButton7.addActionListener(this);
            jButton10.addActionListener(this);
            jButton13.addActionListener(this);
            jButton14.addActionListener(this);
            jButton15.addActionListener(this);
            jButton16.addActionListener(this);
            jButton17.addActionListener(this);
            jButton18.addActionListener(this);
            jButton19.addActionListener(this);
            jButton20.addActionListener(this);
            jButton21.addActionListener(this);
            jButton22.addActionListener(this);
            jButton23.addActionListener(this);
            jButton24.addActionListener(this);
            jButton25.addActionListener(this);
            jButton26.addActionListener(this);
            jButton27.addActionListener(this);
            jButton28.addActionListener(this);
            jButton29.addActionListener(this);
            jButton30.addActionListener(this);
            jButton31.addActionListener(this);
            jButton35.addActionListener(this);
            ver_ayuda.addActionListener(this);
            //para los menus
            cientifica.addActionListener(this);
            estandar.addActionListener(this);
            copiar.addActionListener((ActionListener) this);
            pegar.addActionListener(this);
            this.setBounds(500,100,475,335);
            this.setResizable(isMaximumSizeSet());//desactiva opcion maximizar
            this.getContentPane().setBackground(Color.LIGHT_GRAY);
            this.setLayout(null);
            this.setVisible(true);
            this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        }
        public static void main(String[] args)
        {
            new ProyectoCalculadora("Calculadora");
        }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}

package DesarrolloInterfaces;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculadora {
    public static void main(String[] args) {
        JFrame frame=new JFrame("Calculadora");
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setBounds(40,40,200,200);
        frame.setVisible(true);
        JPanel panel=new JPanel();
        panel.setLayout(new GridBagLayout());
        frame.add(panel);

        JTextField pantalla = new JTextField();

        panel.add(
        new JButton("Boton1"),
                new GridBagConstraints(0,
                        0,
                        1,
                        1,
                        1.0,
                        1.0,
                        GridBagConstraints.CENTER,GridBagConstraints.BOTH,
                        new Insets(0,0,0,0),
                        0,
                        0
                ));
        panel.add(
                new JButton("Boton2"),
                new GridBagConstraints(1,
                        0,
                        1,
                        1,
                        1.0,
                        1.0,
                        GridBagConstraints.CENTER,GridBagConstraints.BOTH,
                        new Insets(0,0,0,0),
                        0,
                        0
                ));
        panel.add(

                new JButton("Boton3"),
                new GridBagConstraints(2,
                        0,
                        1,
                        1,
                        1.0,
                        1.0,
                        GridBagConstraints.CENTER,GridBagConstraints.BOTH,
                        new Insets(0,0,0,0),
                        0,
                        0
                ));
        panel.add(
                pantalla,
                new GridBagConstraints(0,
                        1,
                        3,
                        1,
                        1.0,
                        1.0,
                        GridBagConstraints.CENTER,GridBagConstraints.BOTH,
                        new Insets(0,0,0,0),
                        0,
                        0
                ));

        panel.add(
                new JButton("Boton5"),
                new GridBagConstraints(1,
                        2,
                        2,
                        1,
                        1.0,
                        1.0,
                        GridBagConstraints.SOUTH,GridBagConstraints.HORIZONTAL,
                        new Insets(0,0,0,0),
                        0,
                        0
                ));
        }
        private static ActionListener accion(JTextField pantalla){

        ActionListener sc = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String entrada = e.getActionCommand();
                pantalla.setText(entrada);
            }
        };
        return sc;
        }
    }


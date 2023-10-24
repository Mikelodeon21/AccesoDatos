package DesarrolloInterfaces;

import javax.swing.*;
import java.awt.*;

public class Pagina17PW {
    public static void main(String[] args) {
        JFrame frame=new JFrame("GridLayout");
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setBounds(40,40,2000,2000);
        JPanel panel=new JPanel();
        panel.setBounds(40,40,500,500);
        panel.setLayout(new java.awt.GridBagLayout());
        frame.add(panel);
        panel.add(
                    new JLabel("JList"),
                new GridBagConstraints(
                        0,
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
                new JTextField(),
                new GridBagConstraints(1,
                        0,
                        3,
                        1,
                        1.0,
                        1.0,
                        GridBagConstraints.CENTER,GridBagConstraints.HORIZONTAL,
                        new Insets(0,0,0,10),
                        0,
                        0
                ));
        panel.add(
                new JButton("Agregar"),
                new GridBagConstraints(1,
                        0,
                        3,
                        1,
                        1.0,
                        1.0,
                        GridBagConstraints.CENTER,GridBagConstraints.HORIZONTAL,
                        new Insets(0,0,0,10),
                        0,
                        0
        ));
    }
}

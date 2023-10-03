package DesarrolloInterfaces;

import javax.swing.*;
import java.awt.*;

public class GridLayout {
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
                new JLabel("Full name"),
                new GridBagConstraints(
                        0,
                        0,
                        1,
                        1,
                        1.0,
                        1.0,
                        GridBagConstraints.CENTER,GridBagConstraints.VERTICAL,
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
                ));panel.add(
                new JLabel("Street"),
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
                ));panel.add(
                new JLabel("City"),
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
                ));panel.add(
                new JLabel("Zip Code"),
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
                new JLabel("Adress"),
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
                new JTextField(),
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
                ));panel.add(
                new JTextField(),
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
                ));panel.add(
                new JTextField(),
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
                new JLabel("Phone"),
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
                new JTextField(),
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
                new JLabel("Age"),
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
                new JTextField(),
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
                new JLabel("Description"),
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
                new JTextArea(),
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
        new JButton("Submit"),
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
    }
}

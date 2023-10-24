 /* package DesarrolloInterfaces;

import javax.swing.*;
import java.awt.event.*;

public class JList {
    public static void main(String[] args) {
        JFrame frame =new JFrame();
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setSize(200,200);
        frame.setBounds(20,20,200,200);
        JButton boton=new JButton("Boton");
        boton.addActionListener(e -> JOptionPane.showMessageDialog(frame,"Ha ocurrido un Accion Event en el boton"));
        JComboBox<String> combo=new JComboBox();
        return combo.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {


        public void itemStateChanged (ItemEvent e){
            JOptionPane.showMessageDialog(frame,"Se ha seleccionado  + " e.getItem);

        }
            }
        });
                JLabel label = new JLabel("Mi label");
                label.addMouseListener(new MouseListener() {
                    public void mouseClicked(MouseEvent e) {
                        JOptionPane.showMessageDialog(frame, "Click");
                    }

                    @Override
                    public void mousePressed(MouseEvent e) {
                        JOptionPane.showMessageDialog(frame, "pulsado");

                    }

                    @Override
                    public void mouseReleased(MouseEvent e) {
                        JOptionPane.showMessageDialog(frame, "Soltado");
                    }

                    @Override
                    public void mouseEntered(MouseEvent e) {
                        JOptionPane.showMessageDialog(frame, "Ha entrado");
                    }

                    @Override
                    public void mouseExited(MouseEvent e) {
                        JOptionPane.showMessageDialog(frame, "Ha salido");
                    }

                });

                JTextField textField = new JTextField(20);
                textField.addKeyListener(new KeyListener() {
                    @Override
                    public void keyTyped(KeyEvent e) {
                        JOptionPane.showMessageDialog(frame, "Se ha accionado la tecla" + e.getKeyChar());
                    }

                    @Override
                    public void keyPressed(KeyEvent e) {
                        JOptionPane.showMessageDialog(frame, "Se ha pulsado la tecla" + e.getKeyChar());

                    }

                    @Override
                    public void keyReleased(KeyEvent e) {
                        JOptionPane.showMessageDialog(frame, "Se ha despulsado la tecla" + e.getKeyChar());
                    }
                });


            }
        })
    }
}


*/
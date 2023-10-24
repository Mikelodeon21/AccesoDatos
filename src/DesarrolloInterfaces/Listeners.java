package DesarrolloInterfaces;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Listeners {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                createAndShowGUI();
            }
        });
    }

    private static void createAndShowGUI() {
        JFrame frame = new JFrame("Mi Lista Ventana");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);

        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());

        // Crear JList y agregar elementos
        String[] elementos = {"Elemento 1", "Elemento 2", "Elemento 3"};
        JList<String> jList = new JList<>(elementos);

        // Crear JLabel para mostrar el mensaje de selección
        JLabel seleccionLabel = new JLabel("Seleccionado: ");

        // cambiar el color del texto
        JLabel colorLabel = new JLabel("Texto a color");
        colorLabel.setForeground(Color.BLACK);

        // Agregar MouseAdapter para cambiar el color del texto cuando el ratón entra/sale
        jList.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                colorLabel.setForeground(Color.RED);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                colorLabel.setForeground(Color.BLACK);
            }
        });

        // Crear JTextField para ingresar texto
        JTextField textField = new JTextField();

        // Crear botón "Agregar"
        JButton agregarButton = new JButton("Agregar");
        agregarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String texto = textField.getText().trim();
                if (!texto.isEmpty()) {
                    DefaultListModel<String> model = (DefaultListModel<String>) jList.getModel();
                    model.addElement(texto);
                    textField.setText(""); // Limpiar el campo de texto
                }
            }
        });

        // Crear un DefaultListModel para el JList y establecerlo
        DefaultListModel<String> listModel = new DefaultListModel<>();
        jList.setModel(listModel);

        // Agregar componentes al panel
        panel.add(new JScrollPane(jList), BorderLayout.CENTER);
        panel.add(seleccionLabel, BorderLayout.SOUTH);
        panel.add(colorLabel, BorderLayout.NORTH);
        panel.add(textField, BorderLayout.WEST);
        panel.add(agregarButton, BorderLayout.EAST);

        frame.getContentPane().add(panel);
        frame.setVisible(true);
    }
}

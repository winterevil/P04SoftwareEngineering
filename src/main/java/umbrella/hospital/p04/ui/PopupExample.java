/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package umbrella.hospital.p04.ui;

/**
 *
 * @author Admin
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class PopupExample extends JPanel {

    public PopupExample() {
        setLayout(new BorderLayout());

        // Create the popup menu.
        final JPopupMenu popup = new JPopupMenu();
        popup.add(new JMenuItem(new AbstractAction("Doctor") {
            public void actionPerformed(ActionEvent e) {
                SignupInterfaceDoctor signupDoctor = new SignupInterfaceDoctor();
                signupDoctor.setVisible(true);
                SwingUtilities.getWindowAncestor(PopupExample.this).dispose();
            }
        }));
        popup.add(new JMenuItem(new AbstractAction("Patient") {
            public void actionPerformed(ActionEvent e) {
                SignupInterfacePatient signupPatient = new SignupInterfacePatient();
                signupPatient.setVisible(true);
                SwingUtilities.getWindowAncestor(PopupExample.this).dispose();
            }
        }));

        final JButton popupButton = new JButton("Sign up");
        popupButton.setForeground(new Color(18, 87, 208));
        popupButton.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) {
                popup.show(e.getComponent(), e.getX(), e.getY());
            }
        });
        add(popupButton, BorderLayout.NORTH);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Popup Example");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.add(new PopupExample());
            frame.pack();
            frame.setLocationRelativeTo(null);
            frame.setVisible(true);
        });
    }
}




package com.company.zadanie2;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class KalkulatorBMI extends JFrame implements ActionListener {
   private final JButton wylicz;
   private final JTextField waga;
   private final JTextField wzrost;
   private final JTextField wskaznik;

    public KalkulatorBMI() throws HeadlessException {
        super("Kalkulator BMI");

        wylicz = new JButton("Wylicz");
        wylicz.addActionListener(this);


        waga = new JTextField("");
        wzrost = new JTextField("");
        wskaznik = new JTextField("");


        JPanel p1 = new JPanel(new GridLayout(2,1));
        p1.add(new JLabel("Waga (kg)", SwingConstants.CENTER));
        p1.add(waga);

        JPanel p2 = new JPanel(new GridLayout(2,1));
        p2.add(new JLabel("Wzrost (m)", SwingConstants.CENTER));
        p2.add(wzrost);

        JPanel p31 = new JPanel(new FlowLayout());
        p31.add(wylicz);

        JPanel p3 = new JPanel(new BorderLayout());
        p31.setPreferredSize(new Dimension(50, 30));
        p3.add(p31, BorderLayout.NORTH);
        p3.add(new JLabel("BMI", SwingConstants.CENTER), BorderLayout.CENTER);
        p3.add(wskaznik, BorderLayout.SOUTH);

        JPanel p4 = new JPanel(new BorderLayout());
        p4.add(p1, BorderLayout.NORTH);
        p4.add(p2, BorderLayout.CENTER);
        p4.add(p3, BorderLayout.SOUTH);

        setResizable(false);
        setContentPane(p4);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(300, 200);
        setVisible(true);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            double tryWaga = Double.parseDouble(waga.getText());

            if (tryWaga == 0) {
                JOptionPane.showMessageDialog(this, "Podano zerową wartość wagi!", "Uwaga!", JOptionPane.WARNING_MESSAGE);
            }
        } catch (NumberFormatException NFException) {
            JOptionPane.showMessageDialog(this, "Wpisano nieprawidłowo liczbę w wadze!", "ERROR", JOptionPane.WARNING_MESSAGE);
        }

        try {
            double tryWzrost = Double.parseDouble(wzrost.getText());

            if (tryWzrost == 0) {
                JOptionPane.showMessageDialog(this, "Podano zerową wartość wzrostu!", "Uwaga!", JOptionPane.WARNING_MESSAGE);
            }
        } catch (NumberFormatException NFException) {
            JOptionPane.showMessageDialog(this, "Wpisano nieprawidłowo liczbę we wzroście!", "ERROR", JOptionPane.WARNING_MESSAGE);
        }

        if (e.getActionCommand().equals("Wylicz")) {
            double BMI = Double.parseDouble(waga.getText()) / Math.pow(Double.parseDouble(wzrost.getText()),2);
            wskaznik.setText(Double.toString(BMI));
        }
    }

    public static void main(String[] args) {
       try {
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
        } catch (Exception e) {
            e.printStackTrace();
        }
        SwingUtilities.invokeLater(KalkulatorBMI::new);
    }
}

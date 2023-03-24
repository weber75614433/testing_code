package com.weber.erp.ui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TestPage extends JFrame {
    private final JPasswordField passwordField;
    private final JLabel label;
    private final JButton btn;

    public TestPage(){
        super("test");
        super.setLayout(null);

        passwordField = new JPasswordField();
        passwordField.setBounds(50, 50, 150, 40);
        add(passwordField);

        label = new JLabel("123456789");
        label.setBounds(50, 90, 100, 30);
        label.setForeground(Color.RED);
        add(label);

        btn = new JButton("test");
        btn.setBounds(50, 150, 80, 40);
        add(btn);
    }

    public void setFrameVisible(){
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setSize(300, 300);
        setVisible(true);
    }

    private class test implements ActionListener{

        public void actionPerformed(ActionEvent e) {
            label.setForeground(Color.GREEN);
        }
    }

}

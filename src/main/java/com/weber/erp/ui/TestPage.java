package com.weber.erp.ui;

import javax.swing.*;

public class TestPage extends JFrame {
    private final JPasswordField passwordField;
    private final JTextPane textPane;
    private final JButton btn;

    public TestPage(){
        super("test");
        super.setLayout(null);

        passwordField = new JPasswordField();
        passwordField.setBounds(50, 50, 150, 40);
        add(passwordField);

        textPane = new JTextPane();
        textPane.setEditable(false);


        btn = new JButton("test");
        btn.setBounds(50, 80, 80, 40);
        add(btn);
    }

}

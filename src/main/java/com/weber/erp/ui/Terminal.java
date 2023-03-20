package com.weber.erp.ui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.concurrent.TimeUnit;

public class Terminal extends JFrame{
    private final JTextArea textArea;
    private final JTextField textField;

    public Terminal(){
        setTitle("Terminal");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        textArea = new JTextArea(20, 40);
        textArea.setEditable(false);

        textField = new JTextField();
        textField.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String command = textField.getText();
                try {
                    executeCommand(command);
                } catch (InterruptedException ex) {
                    throw new RuntimeException(ex);
                }
                textField.setText("");
            }
        });

        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());
        panel.add(new JScrollPane(textArea), BorderLayout.CENTER);
        panel.add(textField, BorderLayout.SOUTH);
        setContentPane(panel);

        pack();
        setSize(600, 600);
        setLocationRelativeTo(null);

    }

    public void setFrameVisible(){
        setVisible(true);
    }

    public void setFrameDispose(){
        dispose();
    }

    public void executeCommand(String command) throws InterruptedException {
        String output = "command : " + command;
        textArea.append(output + "\n");

        if(command.equalsIgnoreCase("exit")){
            textArea.append(output + "\n");
            textArea.append("exit in 3 sec");
            TimeUnit.SECONDS.sleep(3);
            dispose();
        }
    }




}

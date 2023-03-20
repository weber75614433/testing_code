package com.weber.erp.ui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainPage extends JFrame {
    private final JButton btnMaintenance;
    private final JButton btnManufacture;
    private final JButton btnMaterial;
    private final JButton btnProd;
    private final JButton btnLogout;
    private final JButton btnExit;
    private final JButton btnTerminal;
    private final JPanel btnPanel;

    public MainPage(){
        super("Main");
        super.setLayout(null);

        btnMaintenance = new JButton("Maintenance");
        //addActionListener -> new frame for maintenance

        btnManufacture = new JButton("Manufacture");
        //addActionListener -> new frame for manufacture

        btnMaterial = new JButton("Material");
        //addActionListener -> new frame for material

        btnProd = new JButton("Production");
        //addActionListener -> new frame for prod

        btnPanel = new JPanel();
        btnPanel.setBounds(100, 200, 200, 200);
        btnPanel.setLayout(new GridLayout(2, 2));
        btnPanel.add(btnProd);
        btnPanel.add(btnMaintenance);
        btnPanel.add(btnManufacture);
        btnPanel.add(btnMaterial);
        add(btnPanel);

        btnTerminal = new JButton("Terminal");
        btnTerminal.setBounds(100, 400, 50, 50);
        btnTerminal.addActionListener(new TerminalPage());
        add(btnTerminal);

        btnExit = new JButton("Exit");
        //addActionListener -> close all frame
        btnExit.setBounds(200, 400, 50 , 50);
        add(btnExit);


        btnLogout = new JButton("Logout");
        //addActionListener -> back to LoginFrame
        btnLogout.setBounds(300, 400, 50, 50);
        add(btnLogout);
    }

    private class TerminalPage implements ActionListener {
        public void actionPerformed(ActionEvent e) {

        }
    }

    public void setFrameVisible(){
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setSize(600, 600);
        setVisible(true);
    }

}

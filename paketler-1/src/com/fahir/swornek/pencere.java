package com.fahir.swornek;

import javax.swing.*;

public class pencere {

    private JFrame frame;

    public pencere() {
        frame = new JFrame();
        JButton button = new JButton("Tıkla");
        button.setBounds(130, 100, 100, 40);
        frame.add(button);
        frame.setSize(400, 500);
        frame.setLayout(null);
        frame.setVisible(true);
    }
}

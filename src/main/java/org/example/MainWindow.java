package org.example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainWindow extends JFrame {
    public MainWindow() {
        super("Крестики Нолики");
        setSize(new Dimension(800, 800));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panel = new JPanel();
        BoxLayout ere = new BoxLayout(panel, BoxLayout.Y_AXIS);
        panel.setLayout(new FlowLayout(FlowLayout.LEFT));
        JButton startButton = new JButton("Начать");
        add(panel);
        panel.add(startButton);
        JTextField gameSize = new JTextField(15);
        panel.add(gameSize);
        setVisible(true);
        startButton.addActionListener(ActionListener -> {GameWindow gameWindow = new GameWindow(Integer.parseInt(gameSize.getText()));
            gameWindow.setVisible(true);
            this.setVisible(false);



        });


    }
}

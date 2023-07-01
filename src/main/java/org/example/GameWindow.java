package org.example;

import javax.swing.*;
import java.awt.*;

public class GameWindow extends JFrame {
    public GameWindow(int size){
        super("Игра");
        setSize(new Dimension(800, 800));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel buttonsPanel = new JPanel();
        GridLayout buttonsLayout = new GridLayout(size, size);
        buttonsPanel.setLayout(buttonsLayout);
        this.add(buttonsPanel);
        for(int i = 0; i < size; i++){
            for(int j = 0; j < size; j++){
                JButton button = new JButton("X");
                buttonsPanel.add(button);
            }
        }

    }
}

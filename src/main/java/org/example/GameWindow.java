package org.example;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class GameWindow extends JFrame {

    private final static String STATE_X = "X";
    private final static String STATE_O = "O";
    private String lastPlayer = STATE_O;

    private List<JButton> gameButtons = new ArrayList<>();

    public GameWindow(int size) {
        super("Игра");
        setSize(new Dimension(800, 800));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel buttonsPanel = new JPanel();
        GridLayout buttonsLayout = new GridLayout(size, size);
        buttonsPanel.setLayout(buttonsLayout);
        this.add(buttonsPanel);
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                JButton button = new JButton();
                gameButtons.add(button);
                button.addActionListener(e -> {
                    onGameButtonPress(button);
                });
                buttonsPanel.add(button);
            }
        }
    }

    private void ShowDialog(String text) {
        var d = new JDialog(this, "Dialog Example", true);
        d.setLayout(new FlowLayout());
        JButton b = new JButton("OK");
        b.addActionListener(l -> {
            d.setVisible(false);
        });
        d.add(new JLabel(text));
        d.add(b);
        d.setSize(300, 300);
        d.setVisible(true);
    }

    private void onGameButtonPress(JButton button) {
        if (button.getText().equals("")) {
            lastPlayer = getCurrentPlayer();
            button.setText(lastPlayer);
        }
    }
    private String getCurrentPlayer() {
        return Objects.equals(lastPlayer, STATE_X) ? STATE_O : STATE_X;
    }

}


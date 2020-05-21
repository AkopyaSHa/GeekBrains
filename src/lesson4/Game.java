package lesson4;

import javax.swing.*;

/**
 * SAMPLE
 */
public class Game extends JPanel {
    public Game() {
        KeyBoard keyBoard = new KeyBoard();
        addKeyListener(keyBoard);
        setFocusable(true);

        JFrame jFrame = new JFrame();
        jFrame.add(this);
        jFrame.setSize(200, 200);
        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
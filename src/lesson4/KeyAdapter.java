package lesson4;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

/**
 * SAMPLE
 */
class KeyBoard extends KeyAdapter {
    @Override
    public void keyPressed(KeyEvent e) {
        switch (e.getKeyCode()) {
            case KeyEvent.VK_LEFT: {
                System.out.println("LEFT");
                break;
            }
            case KeyEvent.VK_UP: {
                System.out.println("UP");
                break;
            }
            case KeyEvent.VK_RIGHT: {
                System.out.println("RIGHT");
                break;
            }
            case KeyEvent.VK_DOWN: {
                System.out.println("DOWN");
                break;
            }
            case KeyEvent.VK_ENTER: {
                System.out.println("ENTER");
                break;
            }
            default: {
                System.out.println("INCORRECT BUTTON");
            }
        }
    }
}

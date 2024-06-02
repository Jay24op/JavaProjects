package games.Brickbreaker;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Gameplay extends JPanel implements KeyListener, ActionListener {
    //Variables
    private boolean play;
    private int score = 0;
    private int totalBricks = 21;
    private Timer timer;
    private int delay = 0;
    private int playerX = 310;
    private final int ballPositionX = 120;
    private final int ballPositionY = 350;
    private final int ballDirectionX = -1;
    private final int ballDirectionY = -2;

    //Constructor
    public Gameplay() {
        addKeyListener(this);
        setFocusable(true);
        setFocusTraversalKeysEnabled(false);
        this.timer = new Timer(this.delay, this);
        timer.start();
    }

    //Methods
    public void point(Graphics g) {
        //background
        g.setColor(Color.black);
        g.fillRect(1, 1, 700, 600);

        //borders
        g.setColor(Color.yellow);
        g.fillRect(0, 0, 3, 600);
        g.fillRect(0, 0, 700, 3);
        g.fillRect(700, 0, 3, 600);

        //paddle
        g.setColor(Color.green);
        g.fillRect(playerX, 550, 100, 8);

        //ball
        g.setColor(Color.blue);
        g.fillRect(ballPositionX, ballPositionY, 20, 20);
    }

    public void moveRight() {
        play = true;
        playerX += 20;
    }
    public void moveLeft() {
        play = true;
        playerX -= 20;
    }

    //Overriding Methods
    @Override
    public void actionPerformed(ActionEvent e) {}

    @Override
    public void keyTyped(KeyEvent e) {}


    @Override
    public void keyReleased(KeyEvent e) {
    }

    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
            if (playerX >= 600) {
                playerX = 600;
            } else {
                moveRight();
            }
        }if (e.getKeyCode() == KeyEvent.VK_LEFT) {
            if (playerX < 10) {
                playerX = 10;
            } else {
                moveLeft();
            }
        }

    }
}

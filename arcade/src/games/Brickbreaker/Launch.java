package games.Brickbreaker;

import javax.swing.*;
import java.awt.*;

public class Launch {
    public static void main(String[] args) {
        JFrame frame = new JFrame(); //creating a frame
        Gameplay gamePlay = new Gameplay(); //create gameplay
        frame.setSize(700,600); //sets x and y dimensions
        frame.setResizable(false);//sets if its resizeable
        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);//sets to exit application on closing of frame
        frame.setTitle("Brick Breaker: The Game"); //sets the title
        frame.setVisible(true); //sets if its visible
        frame.getContentPane().setBackground(Color.gray);//sets the color of the frame
        ImageIcon image = new ImageIcon("logo_Icon.png"); //create an ImageIcon
        frame.setIconImage(image.getImage()); //change frame Icon
        frame.add(gamePlay); //add gameplay to frame
        System.out.println("-----Welcome To Brick Breaker: The Game-----");
    }
}//https://www.youtube.com/watch?v=K9qMm3JbOH0&t=1208s time 26mins

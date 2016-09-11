/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg09_11_looking_for_name;

import java.awt.Canvas;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import javax.swing.JFrame;

/**
 *
 * @author qubcio
 */
public class Frame extends Canvas {
    Frame(Main main) {
        JFrame frame = new JFrame();
        GraphicsDevice gD;
        GraphicsEnvironment gE = GraphicsEnvironment.getLocalGraphicsEnvironment();
        gD = gE.getDefaultScreenDevice();
        frame.setResizable(false);
        gD.setFullScreenWindow(frame);
        Main.MY_WIDTH = frame.getWidth();
        Main.MY_HEIGHT = frame.getHeight();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(main);
        frame.setVisible(true);
    }
}

package SwingsExercise;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ClockApp {
    JFrame frame;
    JLabel messageLabel, imageLabel;

    ClockApp() {
        frame = new JFrame("Clock App with Images");
        frame.setSize(500, 400);
        frame.setLayout(new FlowLayout());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        messageLabel = new JLabel("Click a button");
        messageLabel.setFont(new Font("Arial", Font.BOLD, 18));

        imageLabel = new JLabel(); // for image

        JButton digitalBtn = new JButton("Digital Clock");
        JButton hourGlassBtn = new JButton("Hour Glass");

        // Action for Digital Clock
        digitalBtn.addActionListener(e -> {
            messageLabel.setText("You have pressed Digital Clock!");
            ImageIcon icon = new ImageIcon(getClass().getResource("clock.jpg"));
            imageLabel.setIcon(icon);
        });

        // Action for Hour Glass
        hourGlassBtn.addActionListener(e -> {
            messageLabel.setText("You have pressed Hour Glass!");
            ImageIcon icon = new ImageIcon(getClass().getResource("hourglass.jpg"));
            imageLabel.setIcon(icon);
        });

        frame.add(digitalBtn);
        frame.add(hourGlassBtn);
        frame.add(messageLabel);
        frame.add(imageLabel);

        frame.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new ClockApp());
    }
}
package SwingsExercise;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MouseDemo {
    JFrame frame;
    JLabel label;
    JButton button;

    MouseDemo() {
        frame = new JFrame("Mouse Operations Demo");
        frame.setSize(400, 300);
        frame.setLayout(new FlowLayout());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        label = new JLabel("Perform Mouse Action");
        label.setFont(new Font("Arial", Font.BOLD, 16));

        button = new JButton("Click Me!");

        // Mouse Listener
        button.addMouseListener(new MouseListener() {

            public void mouseClicked(MouseEvent e) {
                if (e.getClickCount() == 2)
                    label.setText("Double Click detected");
                else
                    label.setText("Single Click detected");
            }

            public void mousePressed(MouseEvent e) {
                label.setText("Mouse Pressed");
            }

            public void mouseReleased(MouseEvent e) {
                label.setText("Mouse Released");
            }

            public void mouseEntered(MouseEvent e) { }

            public void mouseExited(MouseEvent e) { }
        });

        frame.add(button);
        frame.add(label);

        frame.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new MouseDemo());
    }
}
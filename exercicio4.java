import java.awt.LayoutManager;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class exercicio4 {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Java GUI Application");
        final int[][] maps = {
                { 1, 1, 1, 1 },
                { 1, 1, 1, 1 },
                { 1, 2, 1, 1 },
                { 1, 1, 1, 1 }
        };
        frame.setLayout((LayoutManager) new GridLayout(4, 4));
        for (int i = 0; i < maps.length; i++) {
            for (int j = 0; j < maps[i].length; j++) {
                final JButton button = new JButton();
                button.setName(Integer.toString(maps[i][j]));
                frame.add(button);
                button.addActionListener((ActionListener) new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        if (button.getName().equals("1")) {
                            button.setText("*");
                        } else if (button.getName().equals("2")) {
                            button.setText("Dog");
                        }

                    }
                });
            }
        }
        frame.setSize(250, 250);
        frame.setVisible(true);
    }
}
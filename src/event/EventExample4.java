package event;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

public class EventExample4 extends JFrame {

    private JButton jButton = new JButton("버튼");

    public EventExample4() {
        setSize(500, 500);

        jButton.addActionListener(_ -> System.out.println("호출!"));
        add(jButton);

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new EventExample4();
    }
}

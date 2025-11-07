package event;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

public class EventExample2 extends JFrame {

    private JButton jButton = new JButton("버튼");

    public EventExample2() {
        setSize(500, 500);

        jButton.addActionListener(new ListenerClass());
        add(jButton);

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    class ListenerClass implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent event) {
            System.out.println("호출!");
        }
    }

    public static void main(String[] args) {
        new EventExample2();
    }
}

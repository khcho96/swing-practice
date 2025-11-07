import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.WindowConstants;

public class BorderLayoutExample extends JFrame {

    JButton[] buttons = new JButton[5];
    String[] borderLayoutConstants = new String[]{
            BorderLayout.WEST,
            BorderLayout.CENTER,
            BorderLayout.EAST,
            BorderLayout.NORTH,
            BorderLayout.SOUTH
    };

    public BorderLayoutExample() {
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        this.setSize(400, 400);

        this.setLayout(new BorderLayout());

        setComponents();
        this.setVisible(true);
    }

    private void setComponents() {
        for (int i = 0; i < buttons.length; i++) {
            buttons[i] = new JButton();
            buttons[i].setText("버튼" + (i+1));
            this.add(buttons[i], borderLayoutConstants[i]);
        }
    }

    public static void main(String[] args) {
        new BorderLayoutExample();
    }
}

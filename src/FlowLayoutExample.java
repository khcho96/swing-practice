import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

public class FlowLayoutExample extends JFrame {

    private final JButton[] buttons = new JButton[5];

    public FlowLayoutExample() {
        this.setDefaultCloseOperation(EXIT_ON_CLOSE); // x표 누르면 프로그램 종료

        this.setSize(400, 400);

        this.setLayout(new FlowLayout());

        setComponents();
        this.setVisible(true);
    }

    private void setComponents() {
        for (int i = 0; i < buttons.length; i++) {
            buttons[i] = new JButton();
            buttons[i].setText("버튼" + (i + 1));
            this.add(buttons[i]);
        }
    }

    public static void main(String[] args) {
        new FlowLayoutExample();
    }
}

import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.WindowConstants;

public class GridLayoutExample extends JFrame {

    JButton[] buttons = new JButton[5];

    public GridLayoutExample() {
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        this.setSize(400, 400);

        this.setLayout(new GridLayout(1, 5)); // 0으로 설정하면 가변적으로 변경됨

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
        new GridLayoutExample();
    }
}

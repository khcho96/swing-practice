import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.WindowConstants;

public class AbsoluteLayoutExample extends JFrame {

    JButton[] buttons = new JButton[5];
    Integer[] locationsX = new Integer[]{10, 30, 100, 210, 10};
    Integer[] locationsY = new Integer[]{10, 30, 100, 200, 210};

    public AbsoluteLayoutExample() {
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        this.setTitle("AbsoluteLayout Practice");
        this.setSize(400, 400);

        this.setLayout(null);

        setComponents();
        this.setVisible(true);
    }

    private void setComponents() {
        for (int i = 0; i < buttons.length; i++) {
            buttons[i] = new JButton();
            buttons[i].setText("버튼" + (i + 1));
            //buttons[i].setBounds(10, 10, 100, 50);
            buttons[i].setSize(100, 50);
            buttons[i].setLocation(locationsX[i], locationsY[i]);
            this.add(buttons[i]);
        }
    }

    public static void main(String[] args) {
        new AbsoluteLayoutExample();
    }
}

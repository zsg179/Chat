import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * @Auther :朱树广
 * @Date :2020/4/5
 * @Description :PACKAGE_NAME
 * @Version :1.0
 */
public class ChatClient extends Frame {
    TextField tfTxt = new TextField();
    TextArea taContent = new TextArea();
    public void launchFrame() {
        this.setLocation(400,300);
        this.setSize(300,300);
        add(tfTxt, BorderLayout.SOUTH);
        add(taContent, BorderLayout.NORTH);
        pack();
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        this.setVisible(true);
    }

    public static void main(String[] args) {
        new ChatClient().launchFrame();
    }
}


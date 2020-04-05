import java.awt.*;

/**
 * @Auther :朱树广
 * @Date :2020/4/5
 * @Description :PACKAGE_NAME
 * @Version :1.0
 */
public class ChatClient extends Frame {
    public void launchFrame() {
        this.setLocation(400,300);
        this.setSize(300,300);
        this.setVisible(true);
    }

    public static void main(String[] args) {
        new ChatClient().launchFrame();
    }
}


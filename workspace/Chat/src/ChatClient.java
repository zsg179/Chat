import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

/**
 * @Auther :朱树广
 * @Date :2020/4/5
 * @Description :PACKAGE_NAME
 * @Version :1.0
 */
public class ChatClient extends Frame {
    TextField tfTxt = new TextField();
    TextArea taContent = new TextArea();
    Socket s = null;

    public void launchFrame() {
        this.setLocation(400, 300);
        this.setSize(300, 300);
        add(tfTxt, BorderLayout.SOUTH);
        add(taContent, BorderLayout.NORTH);
        pack();
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        tfTxt.addActionListener(new TFListener());
        this.setVisible(true);
        connect();
    }

    public static void main(String[] args) {
        new ChatClient().launchFrame();
    }

    private class TFListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String str = tfTxt.getText().trim();
            taContent.setText(str);
            tfTxt.setText("");
            try {
                DataOutputStream dos = new DataOutputStream(s.getOutputStream());
                dos.writeUTF(str);
                dos.flush();
                dos.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }

    private void connect() {
        try {
             s = new Socket("127.0.0.1",8888);
            System.out.println("连上了服务端");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.awt.*;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.IOException;
import java.net.BindException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @Auther :朱树广
 * @Date :2020/4/5
 * @Description :PACKAGE_NAME
 * @Version :1.0
 */
public class ChatServer {
    boolean started = false;
    ServerSocket ss = null;

    public static void main(String[] args) {
        new ChatServer().start();
    }

    public void start() {
        try {
            ss = new ServerSocket(8888);
            started = true;
        } catch (BindException e) {
            System.out.println("端口使用中...");
            System.exit(0);
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            while (started) {
                Socket s = ss.accept();
                Client c = new Client(s);
                System.out.println("一个客户端连上了");
                new Thread(c).start();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                ss.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


    }

    class Client implements Runnable {
        private DataInputStream dis = null;
        private Socket s = null;
        private boolean bConnected = false;

        public Client(Socket s) {
            this.s = s;
            try {
                dis = new DataInputStream(s.getInputStream());
                bConnected = true;
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        @Override
        public void run() {
            try {
                while (bConnected) {
                    String str = dis.readUTF();
                    System.out.println(str);
                }
            } catch (EOFException e) {
                System.out.println("客户端关闭");
            } catch (IOException e) {
                e.printStackTrace();
            }finally {
                try {
                    if(dis != null) dis.close();
                    if(s != null) s.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

}

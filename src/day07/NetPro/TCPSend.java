package day07.NetPro;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

/**
 * 模拟TCP发送端
 * @author wangjj
 * @create 2019-12-10 17:13
 **/
@SuppressWarnings("all")
public class TCPSend {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("192.168.80.99",9999);

        OutputStream outputStream = socket.getOutputStream();
        outputStream.write(97);
        outputStream.close();
    }
}

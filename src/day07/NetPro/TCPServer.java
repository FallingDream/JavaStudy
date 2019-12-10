package day07.NetPro;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * 模拟TCP服务器端
 * @author wangjj
 * @create 2019-12-10 17:15
 **/
@SuppressWarnings("all")
public class TCPServer {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(9999);

        Socket socket = serverSocket.accept();

        InputStream inputStream = socket.getInputStream();
        int read = inputStream.read();
        System.out.println((char) read);
        socket.close();
        serverSocket.close();
    }
}

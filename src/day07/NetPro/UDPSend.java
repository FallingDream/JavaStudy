package day07.NetPro;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.util.Scanner;

/**
 * 模拟UDP发送端
 * @author wangjj
 * @create 2019-12-10 16:44
 **/
@SuppressWarnings("all")
public class UDPSend {
    public static void main(String[] args) {
        try {
            while (true){
                //1.创建ds
                DatagramSocket ds = new DatagramSocket();
                //建立内容
                Scanner scanner = new Scanner(System.in);
                System.out.println("请输入发送的内容");
                String s = scanner.nextLine();
                //打包数据
                byte[] bytes = s.getBytes();
                int length = bytes.length;
                InetAddress inetAddress = InetAddress.getByName("192.168.80.99");
                int port = 12345;
                DatagramPacket dp = new DatagramPacket(bytes, length,inetAddress,port);

                ds.send(dp);

                ds.close();
            }



        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

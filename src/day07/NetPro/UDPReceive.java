package day07.NetPro;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

/**
 * 模拟UDP接收端
 * @author wangjj
 * @create 2019-12-10 16:49
 **/
@SuppressWarnings("all")
public class UDPReceive {
    public static void main(String[] args) {
        try {
            DatagramSocket ds = new DatagramSocket(12345);
        while (true){
            byte[] bytes = new byte[1024];
            DatagramPacket dp = new DatagramPacket(bytes,bytes.length);

            //接收数据
            ds.receive(dp);
            InetAddress address = dp.getAddress();
            String ip = address.getHostAddress();
            byte[] data = dp.getData();
            String s = new String(data,0,data.length);
            int port = dp.getPort();
            System.out.println(ip+"---"+port+"---"+s);
        }


        } catch (SocketException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

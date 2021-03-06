package myNet.demo02;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

/**
 * @author 李明
 * @date 2021年09月21日 10:47
 */

/*
    UDP接收数据的步骤
        1:创建接收端的Socket对象(DatagramSocket)
        2:创建一个数据包，用于接收数据
        3:调用DatagramSocket对象的方法接收数据
        4:解析数据包，并把数据在控制台显示
        5:关闭接收端
 */
public class ReceiveDemo {
    //创建接收端的Socket对象(DatagramSocket)
    //DatagramSocket(int port) 构造数据报套接字并将其绑定到本地主机上的指定端口
    public static void main(String[] args) throws IOException {
        DatagramSocket ds = new DatagramSocket(10088);

        //创建一个数据包，用于接收数据
        //DatagramPacket(byte[] buf, int length) 构造一个 DatagramPacket用于接收长度为 length数据包
        byte[] bys = new byte[1024];
        DatagramPacket dp = new DatagramPacket(bys,bys.length);

        //调用DatagramSocket对象的方法接收数据
        ds.receive(dp);

        //解析数据包，并把数据在控制台显示
        //byte[] getData() 返回数据缓冲区
        byte[] datas = dp.getData();

        //int getLength() 返回要发送的数据的长度或接收到的数据的长度
        int len = dp.getLength();
        //String dataString = new String(datas);
        String dataString = new String(datas,0,len);
        //把一个字节数组的数据转换为一个字符串
        System.out.println("数据是" + dataString);

        //关闭接收端
        ds.close();
    }
}

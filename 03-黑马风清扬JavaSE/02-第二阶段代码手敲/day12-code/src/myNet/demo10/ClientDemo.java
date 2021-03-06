package myNet.demo10;

/**
 * @Author 李明
 * @Date 2022/2/3  11:31
 **/

import java.io.*;
import java.net.Socket;

/**
 *  客户端：数据来自键盘录入, 直到输入的数据是886，发送数据结束
 * */
public class ClientDemo {
    public static void main(String[] args) throws IOException {
        //创建客户端Socket对象
        Socket s = new Socket("192.168.1.6",1022);
        //封装文本文件的数据
        BufferedReader br = new BufferedReader(new FileReader("E:\\01-code\\28-LearnJavaSE★\\LearnJavaSE\\03-黑马风清扬JavaSE\\02-第二阶段代码手敲\\day12-code\\InetAddressDemo.java"));
        //封装输出流写数据
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
        String line;
        while((line = br.readLine()) != null){
            bw.write(line);
            bw.newLine();
            bw.flush();
        }
        System.out.println(2222);
        //自定义结束标记
//        bw.write("886");
//        bw.newLine();
//        bw.flush();
        s.shutdownOutput();
        //接收反馈
        BufferedReader brClient = new BufferedReader(new InputStreamReader(s.getInputStream()));
        String data = brClient.readLine();   //等待读取数据
        System.out.println("服务器的反馈：" + data);
        //释放资源
        br.close();
        s.close();
    }
}

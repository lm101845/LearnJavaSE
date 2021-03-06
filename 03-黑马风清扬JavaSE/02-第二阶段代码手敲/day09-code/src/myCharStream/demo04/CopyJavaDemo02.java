package myCharStream.demo04;

/**
 * @author 李明
 * @date 2021年07月05日 10:33
 */

import java.io.*;

/**
    需求：
        把模块目录下的ConversionStreamDemo.java 复制到模块目录下的 Copy.java

    思路：
        1:根据数据源创建字符缓冲输入流对象
        2:根据目的地创建字符缓冲输出流对象
        3:读写数据，复制文件
            使用字符缓冲流特有功能实现
        4:释放资源
 */
public class CopyJavaDemo02 {
    public static void main(String[] args) throws IOException {
        //根据数据源创建字符缓冲输入流对象
        BufferedReader br = new BufferedReader(new FileReader("D:\\02-looking for job\\00-Project\\43-LearnJavaSE\\LearnJavaSE\\03-黑马风清扬JavaSE\\02-第二阶段代码手敲\\day09-code\\content\\a.txt"));
        //根据目的地创建字符缓冲输出流对象
        BufferedWriter bw = new BufferedWriter(new FileWriter("D:\\02-looking for job\\00-Project\\43-LearnJavaSE\\LearnJavaSE\\03-黑马风清扬JavaSE\\02-第二阶段代码手敲\\day09-code\\content\\a.txt"));
        //读写数据，复制文件
        //使用字符缓冲流特有功能实现
        String line;
        while ((line = br.readLine()) != null){
            bw.write(line);
            bw.newLine();
            bw.flush();
        }
        //释放资源
        bw.close();
        br.close();
    }
}

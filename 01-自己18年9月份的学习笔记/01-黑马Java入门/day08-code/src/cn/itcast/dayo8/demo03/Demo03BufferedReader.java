package cn.itcast.dayo8.demo03;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * 作者：李明
 * 日期： 2018年12月1日 上午7:21:27
 * 看的遍数：1
 * 
 * BufferedReader和FileReader差不多，也是用来读取文件的这样的一种字符输入流
 * 区别在于BufferedReader肚子里也有一个8192长度的char[] 字符数组，当做缓冲区使用
 * 在读取数据的时候，一次性从硬盘当中读取最多8192个字符，放在数组缓冲区当中
 * 在调用read方法的时候，只是从缓冲区当中拿出来字符进行使用
 * 
 * 如果缓冲区当中的字符被“取空”，那么将会自动再次读取8192个再次放在缓冲区当中
 * 
 * 如何使用 BufferedReader?
 * 1.首先创建一个普通的FileReader
 * 2.将这个普通的FileReader包装成为缓冲的 BufferedReader，构造方法。
 * 3.使用起来和普通的FileReader基本没有区别
 * 
 * 构造方法：
 * public  BufferedReader(FileReader fr):参数就是一个普通的FileReader对象
 */
public class Demo03BufferedReader {
	
	public static void main(String[] args) throws IOException {
		
		//首先创建一个普通的FileReader
		FileReader fr = new FileReader("file10.txt");
		
		//将其包装成为缓冲的BufferedReader
		BufferedReader br = new BufferedReader(fr);
		
		//读取当个字符（其实就是从8192的缓冲区当中取出单个字符）
		/*int ch;
		while((ch = br.read()) != -1) {
			System.out.println((char)ch);
			
		}
		*/
		
		//读取字符数组（其实就是从8192的缓冲区当中一次性取出多个字符使用）
		char[] buff = new char[2];  //一次取2个
		int len;
		while((len = br.read(buff)) != -1) {
			String str = new String(buff,0,len);
			System.out.println(str);
		}
		br.close();    //关闭
	}
}

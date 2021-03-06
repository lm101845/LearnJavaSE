package cn.itcast.dayo8.demo01;

import java.io.FileWriter;
import java.io.IOException;
/**
 * 作者：李明
 * 日期： 2018年11月27日 下午7:01:01
 * 看的遍数：1
 * 
 * 在使用FileWriter的时候：
 *1.如果指定的文件不存在，那么会自动创建该文件
 *2.如果指定的文件已经存在，那么将会覆盖写入
 *3.如果不希望进行覆盖写入，而是希望进行追加，那么要用另外一种重载形式的构造方法：
 *public FileWriter(String filename, boolean append):第二个参数如果是true值，那么将会追加写入  
 */

public class Demo02FileWriter {
	
	public static void main(String[] args) throws IOException {
		
		FileWriter fw = new FileWriter("file02.txt",true);  //创
		
		fw.write("World");  //写
		
		fw.close();  //关
	}

}

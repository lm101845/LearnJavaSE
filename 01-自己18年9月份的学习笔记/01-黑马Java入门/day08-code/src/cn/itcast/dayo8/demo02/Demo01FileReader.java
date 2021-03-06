package cn.itcast.dayo8.demo02;

import java.io.FileReader;

import java.io.IOException;
/*
 * 注意事项：
 * 每次调用read方法，都会尝试读取下一个新字符
 * 
 * 扩展一个小技巧
 * 如果一个int 变量确实是一个文字对应的ASCII值，那么可以通过格式将其翻译成为文字
 * （char）变量名称
 */
public class Demo01FileReader {
	
	public static void main(String[] args) throws IOException {
		
		FileReader fr = new FileReader("file06.txt");   //创建
		
		//下面的写法错误，因为每次read方法执行，都会读取一个新字符，直到-1为止
/*		while(fr.read() != -1) {			//读取97，不等于-1
			System.out.println(fr.read());  //此时再读取98.
		}
	*/
		
		int ch;  //代表一个单个字符（对应的ASCII或者Unicode）
		while((ch = fr.read()) != -1) {
			System.out.println((char )ch);
			
			
		}
		//(x + y) > z
		
		
		fr.close();   //关闭
		
		
	}

}

/*
算术运算符当中的加号（+）对于字符串来说，并不是相加的意思，而是连接的意思
使用字符串类型的变量：
Srring str="Hello";

注意事项：
1.任何数据类型和字符串进行连接操作，结果都一定是字符串
2.字符串连接的时候，要注意连接顺序，优先级问题
*/
public class Demo05Operator{
	public static void main(String[] args){
		//创建了一个名叫str1的变量，是字符串类型的
		String str1="Hello";
		String str2=str1+"World";
		
		System.out.println(str2);	//HelloWorld	
		
		String str3="Hello"+30;
		System.out.println(str3);	//Hello30
		
		String str4="Hello"+10+20;
		System.out.println(str4);	//Hello1020
		
		String str5="Hello"+(10+20);
		System.out.println(str5);	//Hello30
		
		
	}
}
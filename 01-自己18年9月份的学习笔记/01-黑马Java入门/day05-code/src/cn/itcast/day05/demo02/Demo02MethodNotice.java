package cn.itcast.day05.demo02;
/**
 *@李明
 *@日期 2018年11月26日 
 *看的遍数：1+1
 *
 * 对于没有返回值的方法，要注意：
 * 
 * 1.返回值没有，并不代表就不能有参数（参数和返回值没有必然联系）
 * 2.这样的方法不能return一个具体的返回值
 * 3.如果最后一行是"return;"那么可以不写，写与不写完全等效
 * 4.【重要】没有返回值的方法，只能使用单独调用，不能使用打印调用或者赋值调用！！！！！！
 * 
 */

public class Demo02MethodNotice {
	
	public static void main(String[] args) {
		//单独调用
		printHelloWorld();
		
		//不能打印调用
		//System.out.println(printHelloWorld());
		//System.out.peintln(void);
		
		//错误写法！不能赋值调用！
		//int num1 = printHelloWorld();
		//int num2 = void
		//void num3 = void
	}
	
	public static void printHelloWorld() {		//这是void类型，不能有一个具体的返回值
		for (int i = 1;i <=10; i++) {
			System.out.println("Java");
			//return 100;  //错误写法！
			//return;	最后一行的return一般都不写，一般都是省略的
		}
	}

}

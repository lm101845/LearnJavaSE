package shuZu;

import quanXian.User1;

/**
 * 测试数组的三种初始化的方式
 * 
 * @姓名 李明
 * @日期 2018年10月29日下午7:43:12
 * 
 * 
 */
public class Test02 {

	public static void main(String[] args) {
		// 静态初始化
		int[] a = { 2, 4, 65 };

		User1[] b = { new User1(1001, "高淇"), new User1(1002, "张三"), new User1(1003, "李四") };

		// 默认初始化
		int[] c = new int[3]; // 默认给数组的元素进行赋值。赋值的规则和成员变量默认赋值规则一致。

		// 动态初始化
		int[] a1 = new int[2];// 动态初始化数组，先分配空间；
		a1[0] = 1;// 给数组元素赋值；
		a1[1] = 2;// 给数组元素赋值；

	}
}

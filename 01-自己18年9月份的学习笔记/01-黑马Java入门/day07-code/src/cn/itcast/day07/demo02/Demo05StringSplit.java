package cn.itcast.day07.demo02;
/**
 * 作者：李明
 * 日期： 2018年11月26日 
 * 看的遍数：1
 * 
 * 如果希望将字符串按照指定的标记切分成若干段儿，那么可以使用方法：
 * public String[] split(string regex):将regex作为标记进行切刀，返回切分之后的若干段儿字符串（字符串数组）
 * 
 * 注意事项：
 * 现阶段强烈建议不要使用英文句点作为分割的标记。
 * 因为英文句点在正则表达式当中有特殊含义
 * 而参数regex其实就是一个正则表达式（今后学习）
 * 
 * 如果一定要使用英文句点，那么切割的标记应该知道“\\.”(现阶段的固定写法）
 */
public class Demo05StringSplit {
	
	public static void main(String[] args) {
		
		String str1 = "AAA，BBB，CCC";
		String[] array1 = str1.split("，");
		System.out.println("数组的长度：" + array1.length);		//数组的长度：3
		
		for (int i =0; i < array1.length; i++) {
			System.out.println(array1[i]);
		}
		System.out.println("============================");
		
		String str2 = "aaa.bbb.ccc";
		String[] array2 = str2.split(".");
		System.out.println("数组的长度：" + array2.length);		//数组的长度：0
		
		for (int i =0; i < array2.length; i++) {
			System.out.println(array2[i]);
		}
		
	}

}

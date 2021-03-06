package cn.itcast.day06.demo03;
/**
 *@李明
 *@日期 2018年11月26日 
 *看的遍数：1+1
 *
 * 问题描述：定义person的时候，其中的age年龄不应该是负数，但是却无法控制它的取值范围，数据不安全
 * 
 * 解决方案：使用private关键字(保护）
 * 一旦使用了private关键字对成员进行了修饰，那么超出了本类范围之外，就不能直接访问了
 * 如果需要使用private修饰的成员变量，可以使用“间接访问”：为private成员变量编写一对儿Setter Getter方法
 */

public class person {
	
	//成员变量
	String name;	//姓名
	private int age;		//年龄      //此时age只能在这个类里面才能使用
	
	//成员方法：
	public void show() {
		System.out.println("我叫 "+ name + "今年" + age + "岁。");
	}
	
	//专门定义了一个成员方法用来设置()设置！！！！成员变量的数据，Setter方法                      set：设置
	public void setAge(int num) {				//void表明方法没有返回值
		
		//设置条件判断进行数据合理性检测，把关！
		if(num < 0 || num > 200) {
			System.out.println("数据错误！");
		}else {
			age = num;
		}
		
	}
	
	//专门定义了一个成员方法，用来反方向获取(获取！！！！！)成员变量的数据，Getter方法		get:获取
	public int getAge() {
		return age;
	}
		
}

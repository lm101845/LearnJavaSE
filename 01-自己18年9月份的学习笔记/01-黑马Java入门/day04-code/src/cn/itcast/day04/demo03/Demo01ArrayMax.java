package cn.itcast.day04.demo03;

/**
 * @李明
 * @日期 2018年11月26日 
 * 看的遍数：1+1
 * 
 * 求出数组当中的最大值
 */
public class Demo01ArrayMax {
	
	public static void main(String[] args) {
		
		//比武招亲的各位选手
		int[] array = {5 ,10, 15, 40, 30, 10000};
		
		//准备一个擂台,第0号元素战五渣首先上场
		int max = array[0];
		
		//后面需要对每一个元素逐一，挨个儿进行处理
		//重复的过程，应该使用循环。用什么循环？
		//次数确定，使用for循环
		for (int i=1;i< array.length; i++) {
			
			//让当前选手array[i]和台上的max进行比较
			if (array[i] > max) {
				max = array[i];		//换人
			}
		}
		System.out.println("最大值：" + max);
	}

}

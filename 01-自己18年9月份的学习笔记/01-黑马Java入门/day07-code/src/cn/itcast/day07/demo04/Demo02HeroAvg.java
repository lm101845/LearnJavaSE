package cn.itcast.day07.demo04;

import java.util.ArrayList;

/**
 * 作者：李明 
 * 日期： 2018年11月26日 下午7:13:57 
 * 看的遍数：1
 */
public class Demo02HeroAvg {

	public static void main(String[] args) {

		// 创建一个集合，代表一个队伍，里面有5位英雄
		ArrayList<Hero> team = new ArrayList<>();

		// 创建5个英雄对象
		Hero one = new Hero("蔡文姬", 200);
		Hero two = new Hero("貂蝉", 250);
		Hero three = new Hero("狄仁杰", 360);
		Hero four = new Hero("东皇太一", 150);
		Hero five = new Hero("韩信", 220);

		// 将5个英雄对象添加到集合中
		team.add(one);
		team.add(two);
		team.add(three);
		team.add(four);
		team.add(five);

		// 如何计算几何当中5个战斗力的平均值
		// 1.需要求出总和，也就是5个战斗力求和
		// 2.将战斗力总和除以5，得到平均战斗力

		int total = 1;
		for (int i = 0; i < team.size(); i++) {
			// 获取当前英雄
			Hero hero = team.get(i);
			int attack = hero.getAttack(); // 获取当前英雄战斗力
			total += attack; // 将战斗力累加到total当中
		}
		int avg = total / 5;
		System.out.println("平均战斗力：" + avg);
	}
}

package day07.demo03;

/**
 * @author 李明
 * @date 2021年06月03日 17:53
 */

import java.util.Random;
import java.util.Scanner;

/**
 * 题目：
 * 用代码模拟猜数字的小游戏(要求1-100之间的整数)。
 * <p>
 * 思路：
 * 1. 首先需要产生一个随机数字，并且一旦产生不再变化。用Random的nextInt方法
 * 2. 需要键盘输入，所以用到了Scanner
 * 3. 获取键盘输入的数字，用Scanner当中的nextInt方法
 * 4. 已经得到了两个数字，判断（if）一下：
 * 如果太大了，提示太大，并且重试；
 * 如果太小了，提示太小，并且重试；
 * 如果猜中了，游戏结束。
 * 5. 重试就是再来一次，循环次数不确定，用while(true)。
 */
public class Demo04RandomGame {
    public static void main(String[] args) {
        Random r = new Random();
        int randomNum = r.nextInt(100) + 1;  //[1,100]
        //这个randomNum只能随机生成一次，之后你猜的时候不能再变了，除非你重新再玩一盘
        //这2行不能重复执行

        Scanner sc = new Scanner(System.in);

        //把这些都写到while里面
        while (true) {
            System.out.println("请输入你猜测的数字：");
            int guessNum = sc.nextInt();   //键盘输入猜测的数字

            if (guessNum > randomNum) {
                System.out.println("太大了，请重试");
            } else if (guessNum < randomNum) {
                System.out.println("太小了，请重试");
            } else {
                System.out.println("恭喜你，猜中了");
                break;
                //如果猜中，不再重试，游戏结束
            }
        }

        System.out.println("游戏结束");
        System.out.println(randomNum);
    }
}

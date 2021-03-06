package day04.demo03;

/**
 * 题目要求：
 * 定义一个方法，用来判断两个数字是否相同
 */

public class Demo01MethodSame {
    public static void main(String[] args) {
        System.out.println(isSame(10,20));
        System.out.println(isSame(10,10));
    }

    /**
     * 三要素：
     * 返回值类型:boolean
     * 方法名称:isSame
     * 参数列表:int a,int b
     */
    public static boolean isSame(int a, int b) {
//        boolean same;
//        写法1：
//        if(a == b){
//            same = true;
//        }else{
//            same = false;
//        }

//        写法2：
//        same = a == b ? true : false;

//        写法3：
//        boolean same = a == b;
//        return same;

//        写法4：
        return a == b;
    }
}

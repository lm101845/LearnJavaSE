package demo05;

import java.util.function.Predicate;

/**
 * @Author liming
 * @Date 2022/3/26 16:18
 **/

/*
    Predicate<T>：
        default Predicate<T> and(Predicate other)：返回一个组合判断，对应短路与
        default Predicate<T> or(Predicate other)：返回一个组合判断，对应短路或
 */
public class PredicateDemo02 {
    public static void main(String[] args) {
        boolean b1 = checkString("hello",s->s.length() > 8);
        System.out.println(b1);
        boolean b2 = checkString("helloworld",s->s.length() > 8);
        System.out.println(b2);
        boolean b3 = checkString("hello",s -> s.length() > 8,s -> s.length() < 15);
        System.out.println(b3);
        boolean b4 = checkString("helloworld",s -> s.length() > 8,s -> s.length() < 15);
        System.out.println(b4);
    }

    //同一个字符串，给出2个不同的判断条件，最后把这2个判断的结果做逻辑与运算的结果作为最终的结果
    private static boolean checkString(String s,Predicate<String> pre1,Predicate<String> pre2){
//        boolean b1 = pre1.test(s);
//        boolean b2 = pre2.test(s);
//        boolean b = b1 && b2;
//        return b;

        //写法2：短路与
        //return pre1.and(pre2).test(s);

        //短路或
        return pre1.or(pre2).test(s);


    }
    //判断给定的字符串是否满足要求
    private static boolean checkString(String s, Predicate<String> pre){
        return pre.test(s);
    }
}

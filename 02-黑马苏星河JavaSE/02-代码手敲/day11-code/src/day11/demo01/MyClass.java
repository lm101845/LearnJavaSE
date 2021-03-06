package day11.demo01;

/**
 * @author 李明
 * @date 2021年06月13日 23:52
 */

/**
当final关键字用来修饰一个类的时候，格式：
public final class 类名称 {
    // ...
}

含义：当前这个类不能有任何的子类。（太监类）
注意：一个类如果是final的，那么其中所有的成员方法都无法进行覆盖重写（因为没儿子。）
 只有子类才能进行覆盖重写，你既然没有子类，所以自然也就无法进行覆盖重写了
 */
public final class MyClass /*extends Object*/{
    public void method(){
        System.out.println("方法执行");
    }
}

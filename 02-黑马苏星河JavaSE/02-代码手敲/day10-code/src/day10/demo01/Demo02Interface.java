package day10.demo01;

/**
 * @author 李明
 * @date 2021年06月11日 6:59
 */

/**
1. 接口的默认方法，可以通过接口实现类对象，直接调用。
2. 接口的默认方法，也可以被接口实现类进行覆盖重写。
 */
public class Demo02Interface {
    public static void main(String[] args) {
        MyInterfaceDefaultA a = new MyInterfaceDefaultA();

        //创建了实现类对象
        //调用抽象方法，实际运行的是右侧实现类
        a.methodAbs();   //实现了抽象方法，AAA

        //调用默认方法，如果实现类当中没有，会向上找接口
        a.methodDefault();   //这是新添加的默认方法

        System.out.println("=====================");

        MyInterfaceDefaultB b = new MyInterfaceDefaultB();
        b.methodAbs();
        b.methodDefault();  //实现类B覆盖重写了接口的默认方法
    }
}

package day09.demo04;

/**
 * @author 李明
 * @date 2021年06月09日 1:01
 */

/**
在父子类的继承关系当中，创建子类对象，访问成员方法的规则：
    创建的对象是谁，就优先用谁，如果没有则向上找。

注意事项：
无论是成员方法还是成员变量，如果没有都是向上找父类，绝对不会向下找子类的。

重写（Override）
概念：在继承关系(必须要是继承关系)当中，方法的名称一样，参数列表也一样。

重写（Override）：方法的名称一样，参数列表【也一样】。覆盖、覆写、覆盖重写。
重载（Overload）：方法的名称一样，参数列表【不一样】。

方法的【覆盖重写】特点：创建的是子类对象，则优先用子类方法。——new的是谁，用的就是谁
 */
public class Demo01ExtendsMethod {
    public static void main(String[] args) {
        Zi zi = new Zi();
        zi.methodFu();
        //父类方法执行了

        zi.methodZi();
        //子类方法执行了

        zi.method();
        //创建的是new了子类对象，所以优先使用子类方法
        //子类重名方法执行了
    }
}

package day06;

/*
 * @姓名 李明
 * @日期 2018年11月4日上午10:10:38
 * 
 * java语言有很多限定符，包括如下5项：
 * 1.限定符public,protected和private:用于控制对类，方法和变量的访问；
 * 2.限定符static:用于创建类方法和类变量；
 * 3.限定符final:用于固定（finalize)类、方法和变量的实现；
 * 4.限定符abstract:用于创建抽象的类和方法；
 * 5.限定符synchronized和volatile:用于线程；
 * 
 * 在一条语句中使用多个限定符时，它们的顺序无关紧要，只要位于要限定的元素之前即可。不要将方法的返回类型（如void)看做限定符。
 * 返回类型必须位于方法名之前，且在返回类型和方法名之间没有限定符。
 * 
 * 1.通过控制访问，可以控制其他类将如何使用您的类。类中的有些变量和方法只能在该类中使用，应对与该类进行交互的其他类隐藏它们。
 * 这被成为封装：对象控制外部世界对它的了解程度以及如何与它进行交互。
 * 封装防止类中的变量被其他类进行读取或修改。要使用这些变量，只能通过调用该类的方法。使用方法来访问实例变量是一种常用的面向对象
 * 编程技术。这提高了类的可重用性，因为它可以防止变量被不正确使用。
 * java提供了4种级别的访问控制：公有、私有、受保护和默认（不使用访问控制限定符）
 * 
 * 声明变量和方法时，如果没有使用任何访问限制符，则它们对同一个包中的其他任何类都是可用的。Java类库被组织成包
 * 
 * a.私有：要完全将方法和变量隐藏起来，不被其他任何类使用，可使用private限定符。这种变量仅在其所在的类中是可见的。
 * 私有实例变量可被其所属类中的方法使用，但不能被其他任何类的对象使用。私有方法也可被其所属类中的其他方法调用，但不能被其他任何
 * 方法调用。这种限制也会影响继承：任何私有变量和私有方法都不能被子类继承
 * 
 * 类变量通常被声明为公有的
 * 
 * b.保护：使方法和变量仅供以下类使用：
 * 子类；
 * 同一个包中的其他类；
 * 
 * final:
 * final类不能被继承；
 * final方法不能被子类覆盖；
 * final变量的值不能被修改
 * 将方法声明为final的最常见的原因是，提高类的运行效率。通常，当java虚拟机运行方法时，它将首先在当前类中查找该方法，接下来在
 * 超类中查找，并一直沿类层次结构向上查找，直到找到该方法为止。这提高了灵活性，简化了开发工作，但代价是速度更低。（以降低灵活性
 * 为代价，提高运行速度）
 * 如果方法是final的，java编译器便可将其可执行字节码直接放到调用它的程序中。毕竟，该方法不会被子类覆盖而发生变化。
 * 首先开发一个类时，没有理由使用final。然而，如果要提高类的执行速度，可以将一些方法改为final的。如果这样做，子类将无法覆盖它们，
 * 因此应三思而后行。
 * 私有方法是final的，而无需显式的声明，因为不可能在子类中覆盖它们。
 * 
 */
public class LimitSymbol {

}

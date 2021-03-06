package keyWord01;
//（1）需求：使用Java类描述一个动物；
//（2）实例：
class Animal{
	String name;	//成员变量
	String color;
	public Animal(String n,String c){
		name = n;
		color = c;
	}
	public void eat(){
		String name = "老鼠";	//局部变量
		System.out.println(name+"在吃……");
	}
}
 
class Demo1{
	public static void main(String[] args){
		Animal dog = new Animal("狗","白色");//此时在内存中存在两份name数据
		Animal cat = new Animal("猫","黑色");
		cat.eat();
	}
}
//（3）运行结果：老鼠在吃
/*（4）存在的问题：当我们new一个动物cat时，让cat去调用eat方法，结果显示的却是老鼠在吃；
 * 也就是说当存在同名的成员变量与局部变量时，在方法的内部访问的是局部变量，
 * 那是因为Java采取的是就近原则访问的，要解决这个问题就需要使用this关键字；
 */

/*
 * 2.存在同名成员变量与局部变量的内存分析
 * （1）栈内存也叫方法栈，把它称为方法栈的原因是因为：一个方法要运行的时候，JVM会在栈内存中开辟一片属于这个方法的空间，
 * 让这个方法在这片空间内执行；
（2）首先在这片代码中主方法会先执行，主方法一执行，JVM会在栈内存中开辟一片空间属于main方法，
在这片空间中先声明了一个变量a，接着new一个Animal，这时候在堆内存中就创建了一个Animal对象，
这个Animal有name和color两个属性，都分配了默认的初始值，name=“狗”，color=null；
这时候假设它的内存地址是0X98，此时a这个变量就指向了0X98，也就是a指向了这个对象；
（3）接着在main方法的这片空间执行a.eat();eat方法执行的时候，JVM在栈内存中为这个方法开辟了一片属于eat方法的空间，
在这个eat方法里首先声明了一个变量name=“老鼠”，紧接着输出语句，因为Java采取的是就近原则来访问的，
因为输出语句中的name变量在eat方法这片空间也存在，如果存在它就只会在eat方法这片空间去找，
如果这片空间没有它才会去到堆内存中去找

*/

/*
 * 3.定义：
（1）this关键字代表了所属函数的调用者对象，this代表了对象的内存地址（在构造函数中打印this会发现结果是一个内存地址），
也就是说哪个对象调用了this所在的函数，那么this就指代哪个对象；
（2）this是指向本类中某一个对象的一个变量，this相当于文章中第一人称的“我”，所有人描述自己的时候都会说“我”，
只要读“我”的这个人发生变化，这个“我”指向的人就变了；而this关键字与之类似，this是抽象的，
刚开始并不知道是指代谁，this是每一个对象携带的变量，这个变量所指向的都是自己，this只是起到了一个描述的作用：
只要有一个具体的对象来执行的时候，this就用这个对象的this，换一个对象，this就变成另一个对象的this，
所以只有在执行的时候才知道指向谁。就像文章中的“我”，只有确定了谁是读这篇文章的，才能确定这个“我”指代谁；
（3）this关键字代表的是对象的引用，也就是this在指向一个对象，所指向的对象就是调用该函数的对象引用；

* 
 */

/*
 *4.this关键字的作用：
（1）如果存在同名的成员变量与局部变量时，在方法内部默认是访问局部变量的数据，可以通过this关键字指定访问成员变量的数据；
（2）在一个构造函数中可以调用另外一个构造函数初始化对象；

5.this关键字要注意的事项：
（1）存在同名的成员变量与局部变量时，在方法的内部访问的是局部变量（Java采取的是“就近原则”的机制访问的）；
（2）如果在一个方法中访问了一个变量，该变量只存在成员变量的情况下，那么Java编译器会在该变量的前面添加this关键字；

6.this关键字调用其他的构造函数要注意的事项:
（1）this关键字调用其他的构造函数时，this关键字必须要位于构造函数中的第一个语句；
（2）this关键字在构造函数中不能出现相互调用的情况，因为是一个死循环；




 */

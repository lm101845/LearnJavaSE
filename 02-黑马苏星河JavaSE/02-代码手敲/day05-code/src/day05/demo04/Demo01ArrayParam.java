package day05.demo04;

/**
 * @author 李明
 * @date 2021年06月02日 4:23
 */

/**
数组可以作为方法的参数。
当调用方法的时候，向方法的小括号进行传参，传递进去的其实是数组的地址值。
 */
public class Demo01ArrayParam {
    public static void main(String[] args) {
        int[] array = {10,20,30,40,50};

        System.out.println(array);   //地址值
        printArray(array);      //传递进去的就是array当中保存的地址值
        System.out.println("===============aaa");

        printArray(array);
        System.out.println("===============bbb");

        printArray(array);
        System.out.println("===============ccc");
//        for(int i = 0; i < array.length;i++){
//            System.out.println(array[i]);
//        }
//        System.out.println("aaa");
//
//        for(int i = 0; i < array.length;i++){
//            System.out.println(array[i]);
//        }
//        System.out.println("bbb");
//
//        for(int i = 0; i < array.length;i++){
//            System.out.println(array[i]);
//        }
//        System.out.println("ccc");
    }

    /**
    三要素
    返回值类型：只是进行打印而已，不需要进行计算，也没有结果，用void
    方法名称：printArray
    参数列表：必须给我数组，我才能打印其中的元素。int[] array
     */
    public static void printArray(int[] array){
        //这里数组也能作为参数！！！！！
        //任何数组类型都能作为方法的参数！！！！！！
        System.out.println("printArray方法收到的参数是：" + array);
        //也是地址值
        for(int i = 0; i < array.length;i++){
            System.out.println(array[i]);
        }
    }
}

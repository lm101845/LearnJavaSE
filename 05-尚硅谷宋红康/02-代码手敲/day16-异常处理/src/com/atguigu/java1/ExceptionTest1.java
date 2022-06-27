package com.atguigu.java1;

/**
 * @Author liming
 * @Date 2022/6/27 9:06
 **/

import org.junit.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * 一、异常的处理：抓抛模型
 *
 * 过程一："抛"：程序在正常执行的过程中，一旦出现异常，就会在异常代码处生成一个对应异常类的对象。
 *           并将此对象抛出(抛给程序的调用者,谁调用这个可能出现的程序就抛给谁，最后抛的人是main方法)。
 *           一旦抛出对象以后，其后的代码就不再执行。
 *
 * 		关于异常对象的产生：① 系统自动生成的异常对象
 * 					 ② 手动的生成一个异常对象，并抛出（throw）
 *
 * 过程二："抓"：可以理解为异常的处理方式：① try-catch-finally(狼来了，小孩自己把它打死)  ② throws(狼来了，小孩搞不定，往外抛，喊大人来解决)
 *
 *
 * 二、try-catch-finally的使用
 *
 * try{
 * 		//可能出现异常的代码(不是一定会出现)
 * 如果你出现这个异常类型，我就用这个方式处理，你要出现另一个异常，我就用另一个方式来处理
 * }catch(异常类型1 变量名1){
 * 		//处理异常的方式1
 * }catch(异常类型2 变量名2){
 * 		//处理异常的方式2
 * }catch(异常类型3 变量名3){
 * 		//处理异常的方式3
 * }
 * ....
 * finally{
 * 		//一定会执行的代码
 * }
 *
 * 说明：
 * 1. finally是可选的。
 * 2. 使用try将可能出现异常代码包装起来，在执行过程中，一旦出现异常，就会自动生成一个对应异常类的对象，根据此对象
 *    的类型，去catch中进行匹配
 * 3. 一旦try中的异常对象匹配到某一个catch时，就进入catch中进行异常的处理。一旦处理完成，就跳出当前的
 *    try-catch结构（在没有写finally的情况）。继续执行其后的代码
 * 4. catch中的异常类型如果没有子父类关系，则谁声明在上，谁声明在下无所谓。
 *    catch中的异常类型如果满足子父类关系，则要求子类一定声明在父类的上面。否则，报错
 * 5. 常用的异常对象处理的方式： ① String  getMessage()    ② void printStackTrace()
 * 6. 在try结构中声明的变量，在出了try结构以后，就不能再被调用
 * 7. try-catch-finally结构可以嵌套
 *
 * 体会1：使用try-catch-finally处理编译时异常，使得程序在编译时就不再报错，但是运行时仍可能报错。
 *     相当于我们使用try-catch-finally将一个编译时可能出现的异常，【延迟】到运行时出现。
 *
 * 体会2：开发中，由于【运行时异常比较常见】，所以我们通常就不针对运行时异常编写try-catch-finally了。
 *      针对于编译时异常，我们说一定要考虑异常的处理。
 */
public class ExceptionTest1 {
    @Test
    public void test2(){
        try{
            File file = new File("hello.txt");
            FileInputStream fis = new FileInputStream(file);

            int data = fis.read();
            while(data != -1){
                System.out.print((char)data);
                data = fis.read();
            }

            fis.close();
        }catch(FileNotFoundException e){
            e.printStackTrace();
        }catch(IOException e){
            e.printStackTrace();
        }
    }

    @Test
    public void test1(){
        String str = "123";
        str = "abc";
        int num = 0;   //如果你外面想用这个num,可以这样做，声明在外面
        try{
            num = Integer.parseInt(str);
//            int num = Integer.parseInt(str);
            System.out.println("hello-----1");
        }
//        子类异常一定要在父类异常上面，否则报错！！！
//        catch(Exception e){
//            System.out.println("出现异常了，不要着急....");
//        }
        catch (NumberFormatException e){
            //这里面你处理异常的方式,根据异常类型的不同进行匹配，如果都匹配不正确，则相当于处理异常失败
            System.out.println("出现数值转换异常了，不要着急....");  //因为异常被这个捕获了，所以下面的异常捕获都不会被执行
            System.out.println(e.getMessage());
            e.printStackTrace();   //打印异常踪迹
        }catch (NullPointerException e){
            System.out.println("出现空指针异常了，不要着急....");
        }catch(Exception e){
            System.out.println("出现异常了，不要着急....");
        }

        System.out.println(num);
        //在try结构中声明的变量，在出了try结构以后，就不能再被调用
        //如果你在外面又想用这个异常，可以把它声明在外面,有异常了，还可以放在里面赋值

        //处理完异常以后,程序就可以正常往下走了
        System.out.println("hello-----2");
    }
}

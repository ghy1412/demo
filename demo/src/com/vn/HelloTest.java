package com.vn;

import java.util.Arrays;

interface AAA{
   final static String fasf = "dasd";
   default void prinh(){
       System.out.println("hello");
   }
}
public class HelloTest {
    public static void main(String[] args) {
        //byte  char short int  float  double  long  boolean
        //1024Byte = 1kB
/*        System.out.println("\"");
        System.out.println("9"+1);*/
/*        int[] ints = new int[]{1,3}; //数组是引用类
        int[][] ints1 = {{}, {}, {}};
        System.out.println(ints1.length);
        System.out.println(ints1[2].length);

        int[][] ints2 = Arrays.copyOf(ints1, 21);
        System.out.println(ints1.length);*/
        //面向对象的三大特性 继承封装多态

/*        new Son(); //静态代码块只会运行一次
        new Son();
        new Parent();*/
        char s = 'a';
        char c = 'a';
        char a = (char) (s + c); // byte char short 计算之后都会转化成int类型
        System.out.println(a);
        string("we", "are", "family");
        try {
            String.class.getConstructor().setAccessible(true);
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
        /*
        * 反射可以通过三种方式来获取对象
        * 对象.getClass()
        * 类名.class
        * Class.forName("全限定名");
        * */
    }

     static void string(String ... strings){

    }
}

class Parent<T>{
    static int c = 90;
    static {
        System.out.println("我是父类静态代码块");
    }

    {
        System.out.println("我是父类构造块");
    }

    public Parent(){
        System.out.println("我是父类构造方法");
    }
}

class Son extends Parent{
    static {
        System.out.println("我是子类静态代码块");
    }

    {
        System.out.println("我是子类构造块");
    }

    public Son(){
        System.out.println("我是子类构造方法");
    }
}
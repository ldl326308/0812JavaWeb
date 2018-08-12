package com.test;

public class Program {
    public static void main(String[] args) {
        String a = "ab";
        String b = "ab";
        String aa = new String("ab");
        String bb = new String("ab");

        System.out.println(a==b); //true 指向同一个地址
        System.out.println(a.equals(b));  //true 内容相同
        System.out.println(aa==a);  //false  不是指向同一个地址
        System.out.println(aa.equals(a));  //true 内容相同
        System.out.println(aa==bb);  // false  不是指向同一个地址

        //总结：== 比较的是是不是指向同一个地址  equals 比较的是内容是否相同
        //  ==  运行速度快，因为它只比较引用地址

    // String StringBuilder StringBuffer 的区别
    /*
        1、String 对象的修改，不是在原先的对象进行修改，是创建了一个新的对象，产生一个新的地址，是不可变字符序列，
        可以空赋值，如果该对象多次执行内容修改操作，会导致大量副本字符串对象存留在内存中，降低效率，影响性能，
        适宜操作少量数据的时候使用，String 因为是定义为final的，所以线程是安全的。

     2、StringBuffer 对象可以进行修改，修改操作不会重新创建一个第一个地址，是在原地址进行修改操作，
     StringBuffer加了同步锁，所以线程是安全的，执行速度慢，可多线程操作字符，效率低，
     创建对象适宜在多线程操作字符串缓冲区下操作大量数据是使用，创建新对象要通过new 的方式，继承 AbstractStringBuilder。

    3、StringBuilder 对象可进行修改，只支持单线程操作字符串，线程不安全，效率高，继承 AbstractStringBuilder，
    StringBuffer 和  StringBuilder 有些相似

    */
    String str1 = "string";
    String str2 = new String("string");
    String str3 = null;

    StringBuffer sb1 = null;
    // StringBuffer sb2 ="";  错误做法
    StringBuffer sb3 = new StringBuffer("StringBuffer");

    StringBuilder sbui = new StringBuilder("StringBuilder");
    //StringBuilder sbui1 = "";错误做法





    }
}

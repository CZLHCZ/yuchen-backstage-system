package chapter02;

public class java03_DataType_2 {
    public static void main(String[] args) {
        // TODO 数据的存储单位
        // 1.比特（bit位）：数据运算的最小存储单位。
        // 2.字节（byte）: 数据的最小存储单位。
        // 字节和比特之间可以相互转换的
        // 1byte = 8bit
        // kB,MB,GB,TB ...
        // 1024 byte => 1kB
        // 1024 KB => 1MB
        // 1024 MB => 1GB
        // 1024 GB => 1TB

        // JAVA 的数据类型可以确定数据的范围

        // java 数据类型包括：一、基本数据类型  二、引用数据类型

        // 一、基本数据类型：1、数值类型，2、字符类型: char，3、布尔类型: boolean
        // 其中数值类型包括：
        //  1、整数类型：byte、short、int、long
        //  2、浮点类型：float、double

        // 二、应用数据类型：1、类，String。2、接口，3、数组，4、枚举，5、特殊类型值：null

        // TODO 数值类型转换
        String name = "zhangsan";
        int age = 30;
        name = "lisi";
//        name = age
        // byte-> short -> int -> long -> float -> double
        byte b = 10;
        short s = b;
        int i = s;
        long lon = i;
        float f = lon;
        double d = f;
        // java 中范围小的数据可以直接转换范围大的数据， 但是范围大的数据无法直接转换为范围小的数据
        // int i1 = d;
        // 如果想要将范围大的数据转换为范围小的数据，那么需要使用小的括号进行强制转换。
        int i1 = (int)d;
    }
}

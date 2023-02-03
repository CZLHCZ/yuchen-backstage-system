package chapter02;

public class java03_DataType_1 {
    public static void main(String[] args) {
        String name = "zhangsan";
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

        // 二、引用数据类型：1、类，String。2、接口，3、数组，4、枚举，5、特殊类型值：null

        // TODO 基本数值类型

        // TODO 1.整数类型
        // byte : 8位
        byte b = 10;
        // short : 16位
        short s = 10;
        // int : 32位
        int i = 10;
        // long : 64位
        long lon = 10;

        // TODO 2.浮点类型：含有小数的数据类型
        // 根据计算精度分为
        // 默认情况下，小数点的数据会被识别为精度较高的双精度double类型
        // float: 单精度浮点类型，数据需要使用F（f）结尾
        float f = 1.0F;
        // double : 双精度浮点类型
        double d = 2.0;

        // TODO 3.字符类型
        // 所谓的字符类型，其实就是使用符号标识文字内容
        char c = 'A';

        // TODO 4.布尔类型
        // true,false,标识判断条件是否成立，如果成立，取值为true,如果不成立，那么取值为false
        boolean bln = true;
    }
}

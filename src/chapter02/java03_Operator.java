package chapter02;

public class java03_Operator {
    public static void main(String[] args) {
        // TODO 运算符
        // 所谓的运算符就是参与数据运算的符号。
        // TODO 表达式
        // 所谓的表达式就是采用运算符和数据连接在一起形成符合Java语法规则的指令代码，称之为表达式。

        // TODO 算术运算符
        // 1.二元运算符： 两个元素参与运算的运算符, 1 + 2
        // TODO 算术表达式 = 元素1 二元运算符 元素2
        // 这个表达式是有结果的，就需要有类型，这里的类型是元素种类型最大的哪一种，最小使用的类型为int类型。
//        System.out.println(1 + 2); // 3
//        System.out.println(2 - 2); // 0
//        System.out.println(3 * 2); // 6
//        System.out.println(4 / 2); // 2
//        System.out.println(1 / 2); // 0 (int, int) => int
//        System.out.println(1.0 / 2); // 0.5 (double, int) => double
//        System.out.println(5 % 2); // 1(取余，模运算)
//
//        byte b1 = 10;
//        byte b2 = 20;
//        byte b3 = (byte)(b1 + b2); // (int, int) => int
//        System.out.println(1 + 2 * 3); // 7
//        System.out.println((1 + 2) * 3); // 9

        // 2.一元运算符：一个元素参与运算的运算符
        // ++, --
        // ++运算符的本质其实就是加1的简化版本。自增运算符
        int i = 0;
//        i = i + 1;
        int j = ++i;

        System.out.println("i = " + i);
        System.out.println("j = " + j);

    }
}

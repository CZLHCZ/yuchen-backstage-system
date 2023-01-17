package chapter02;

public class java01_Variable {
    public static void main(String[] args) {
        // TODO 变量
        // 所谓的变量， 其实就是可以改变的向量存储
        // 1. 变量声明
        // 数据类型 变量的名称
        String name;
        // 2. 变量的赋值
        // 变量名称 = 数据
        name = "zhangsan";
        // 3. 变量的实用
        // 直接访问变量的名称即可
        System.out.println(name);

        // 将变量的声明和赋值在一行的代码中完成
        String username = "lisi";
        System.out.println(username);

        // 在使用变量之前，必须给变量赋值，将这个操作称之为变量的初始化
        String email;
        email = "xxxxx";
        System.out.println(email);

    }
}

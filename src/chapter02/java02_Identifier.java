package chapter02;

public class java02_Identifier {
    public static void main(String[] args) {
        // TODO 标识符
        // 标识数据的符号，称之为标识符。
        // 变量的名称就是标识符。
        // 标识符主要用于起名。
        String name = "zhangsan";

        // TODO 标识符的命名规则
        // 1. 英文拉丁字母
        // wx，qq
        String unername = "zhangsan";
        String xingming = "lisi";
        // 2.符号
        // @，#，%，$
        // 标识符只能采用下划线和美元$符号，其他符号不能使用，称之为特殊符号
        // 空格属于特殊符号，所以不能作为标识符使用。
        String _name = "wangwu";
        String $name = "wagnwu";
        String $na_me = "wangwu";
        System.out.println(_name);
        System.out.println($name);
        System.out.println($na_me);

        // 3. 数字
        // 阿拉伯数字 0 到 9 可以作为标识符使用。
        // 数字如果在标识符的开头位置，那么会被识别为数字，而不是标识符，所以会发生錯誤
        //  String 1name = "zhangsan";
        String name1 = "zhangsan";

        // 4.在大括号范围内，标识符不允许重复
        // String name = "shangsan";
         String name2 = "sahngsan";
         // 标识符是可以区分大小写。
        // 5.java 语言中预先定义好了一些标识符名称，称之为关键字或者保留字。
        // 可以使用大小来实现关键字名称的定义，但是容易造成歧义，所以不推荐。
        String Public = "zhaoliu";
        // 6. 驼峰标识：规范
        String userName = "张三";

        // 7. 标识符的长度。
        // 没有限制
    }
}

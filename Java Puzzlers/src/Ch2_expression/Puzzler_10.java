package Ch2_expression;

/**
 * 八两
 * 声明两个变量使得
 * x += i; 非法
 * x = x + i; 合法
 */
public class Puzzler_10 {
    public static void main(String[] args) {
        declare();

    }

    /* 似乎从jdk1.6时期开始不存在此问题 可以通过编译(?) */
    public static void declare() {
        Object x = "???";
        String i = "JAva";
        x = x + i;
        System.out.println(x);
        x += i;
        System.out.println(x);
    }
}

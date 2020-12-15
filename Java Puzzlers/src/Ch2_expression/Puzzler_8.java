package Ch2_expression;

/**
 * Dos Equis'(an american beer brand)
 * 意为 Dos下的等价物
 */
public class Puzzler_8 {
    public static void main(String[] args) {
        dosEqualInt();
        dosEqualLong();
    }

    /* 如果第一个操作数的类型是 byte short char 第二个是int型常量且能用前者类型表示 则类型为前者
     * 否则会进行类型升格 返回类型为升格后类型
     * 所以第二行输出为升格后的X(char -> int) 即 X对应的十进制数字88
     * 我们(as programmer)应该避免混合类型的计算
     */
    public static void dosEqualInt() {
        char x = 'X';
        int i = 0;
        System.out.println(true ? x : 0);  // X
        System.out.println(false ? i : x); // 88
    }

    public static void dosEqualLong() {
        char x = 'X';
        long i = 0L;
        System.out.println(true ? x : 0L);  // 88
        System.out.println(false ? i : x);  // 88
    }
}

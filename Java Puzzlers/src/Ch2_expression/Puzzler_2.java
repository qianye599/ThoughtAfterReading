package Ch2_expression;

import java.math.BigDecimal;

/**
 * 找零时刻(浮点数减法)
 */
public class Puzzler_2 {
    public static void main(String[] args) {
        subtract_1(2.00, 1.10);     // 0.8999999999999999
        subtract_2(2.00, 1.10);     // 0.90
        subtract_3("2.00", "1.10"); // 0.90
    }

    /* 错误的解法 并不是所有小数 都可以用二进制浮点数精确表示 */
    public static void subtract_1(double a, double b) {
        System.out.println(a - b);
    }

    /* 不合适的解法 结果正确 但只是提供了结果上正确的近似 并非底层通用方案 */
    public static void subtract_2(double a, double b) {
        String format = "%.2f%n";
        System.out.printf(format, a - b);
    }

    /* 使用单BigDecimal(String) 速度较慢 注意!千万不要用BigDecimal(double)!  */
    public static void subtract_3(String a, String b) {
        System.out.println(new BigDecimal(a).subtract(new BigDecimal(b)));
    }

    /*
     * 总而言之在需要精确结果的地方 应该避免使用float和double
     * 对于货币计算 要使用int long 或 BigDecimal
     * 对语言设计者来说 应该考虑对小数运算提供语言支持
     */
}

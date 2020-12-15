package Ch2_expression;

/**
 * 整数的奇偶性
 */
public class Puzzler_1 {

    public static void main(String[] args) {

    }

    /* 错误解法 对于负奇数 将会返回 i%2的结果是 -1 */
    public boolean isOdd_1(int i) {
        return i % 2 == 1;
    }

    /* 一个正确的解决方案 */
    public boolean isOdd_2(int i) {
        return i % 2 != 0;
    }

    /* 一个性能更好的解决方案 */
    public boolean isOdd_3(int i) {
        return (i & 1) != 0;
    }
}

package Ch2_expression;

/**
 * 长整除
 */
public class Puzzler_3 {
    /* 变量声明为long 但是是由int因数运算升格而成 升格前溢出 则会错误 */
    private static final long MICROS_PER_DAY_1 = 24 * 60 * 60 * 1000 * 1000;
    private static final long MILLIS_PER_DAY_1 = 24 * 60 * 60 * 1000;

    /* 操作大数时 千万要提防溢出 */
    private static final long MICROS_PER_DAY_2 = 24L * 60 * 60 * 1000 * 1000;
    private static final long MILLIS_PER_DAY_2 = 24L * 60 * 60 * 1000;
}

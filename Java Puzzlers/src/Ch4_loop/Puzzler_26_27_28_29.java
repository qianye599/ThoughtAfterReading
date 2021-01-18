package Ch4_loop;

/**
 * 在循环中
 */
public class Puzzler_26_27_28_29 {
    public static void main(String[] args) {
        loop();
    }

    /*
     * 这个循环不会结束 因为当 i == END 时 i+1 == Integer.MIN_VALUE
     * 即 又从0开始
     * 这里的教训就是 int不能表示所有的整数
     */
    public static void loop() {
        int END = Integer.MAX_VALUE;
        int START = END - 100;
        int count = 0;
        for (int i = START; i <= END - 100; i++) {
            count++;
        }
        System.out.println(count);
    }

    /* 这也是无限循环
     * 因为当右操作数为int型 位移操作符最多只能移动0～31位
     * 而当右操作数为long型 位移操作符最多只能移动0～63位
     * 这里的教训是 使用位移操作符的话 最好使用常量 这样使用的时候可以控制在范围内 不易错
     */
    public static void loop2() {
        int i = 0;
        while (-1 << i != 0) {
            i++;
        }
        System.out.println(i);
    }

    /* 这仍是无限循环
     * 因为i被声明为无限大 实际上是1无法填补浮点数中的后继间隔
     */
    public static void loop3() {
        double i = Double.POSITIVE_INFINITY;
        while (i == i + 1) {
            i++;
            System.out.println("this is a loop");
        }
    }

    /* 这也是无限循环
     * 因为i被声明为NaN(Not a Number) 它不等于任何浮点数 包括它自己
     */
    public static void loop4() {
        double i = Double.NaN;
        while (i != i) {
            i++;
            System.out.println("this is a loop,too");
        }
    }

}

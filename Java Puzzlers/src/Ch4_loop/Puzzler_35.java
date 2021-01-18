package Ch4_loop;

/**
 * 分分钟
 */
public class Puzzler_35 {
    public static void main(String[] args) {
        clock(); // 60000
        clock2();// 60
    }

    /* 注意二级运算的顺序 */
    public static void clock() {
        int min = 0;
        for (int ms = 0; ms < 60 * 60 * 1000; ms++) {
            if (ms % 60 * 1000 == 0) {
                min++;
            }
        }
        System.out.println(min);
    }

    public static void clock2() {
        int min = 0;
        int PER_HOUR = 60 * 60 * 1000;
        int PER_MIN = 60 * 1000;
        for (int ms = 0; ms < PER_HOUR; ms++) {
            if (ms % PER_MIN == 0) {
                min++;
            }
        }
        System.out.println(min);
    }

}

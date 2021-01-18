package Ch4_loop;

/**
 * 无情的增量操作
 */
public class Puzzler_25 {
    public static void main(String[] args) {
        preIncrement();
        postIncrement();
    }

    /*
     * i = i++可以解释为
     * int temp = i;
     * i = i+1;
     * i = temp;
     */
    public static void preIncrement() {
        int i = 1;
        i = i++;
        System.out.println(i);
    }

    /*
     * i = ++i可以解释为
     * i = i+1;
     * i = i;
     */
    public static void postIncrement() {
        int i = 1;
        i = ++i;
        System.out.println(i);
    }
}

package Ch3_chars;

/**
 * 循环者的鬼魂
 */
public class Puzzler_32 {
    public static void main(String[] args) {
        ghost();
    }

    /**
     * 当左值右值都为boxer的时候 执行的是对象之间的比较
     */
    public static void ghost() {
        System.out.println(new Integer(0) != 0);// false
        System.out.println(new Integer(0) == 0);// true
        System.out.println(new Integer(0) != new Integer(0));// true
        System.out.println(new Integer(0) == new Integer(0));// false
    }
}

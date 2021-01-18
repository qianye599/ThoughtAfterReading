package Ch4_loop;

/**
 * 循环者遇到了狼人
 */
public class Puzzler_33 {
    public static void main(String[] args) {
        werewolf();
    }

    /* Java中的int运算实际上是(mod 2^31)
     * 故选取 i = -2^31
     */
    public static void werewolf() {
        int i = Integer.MIN_VALUE;
        System.out.println(i != 0 && i == -i);//true && true
    }
}

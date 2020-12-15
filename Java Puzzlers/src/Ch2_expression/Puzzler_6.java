package Ch2_expression;

/**
 * 多重转型
 */
public class Puzzler_6 {
    public static void main(String[] args) {
        typeTrans();
    }

    /*
    -1的补码是 1111 1111 ...(32位)
    转换流程为 int -> byte -> int -> char -> int
    有符号则进行符号(0/1)拓展;若是char 则0拓展
    于是:
    1111 1111 ...(32位) -> 1111 1111(8位)
    1111 1111(8位) -> 1111 1111 ...(32位)
    1111 1111 ...(32位) -> 1111 1111 ...(16位)
    1111 1111 ...(16位) -> 0000 0000 ... 1111 1111(32位)
    故结果是 0000 0000 0000 0000 1111 1111 1111 1111
    给我们的教训是 如果你不观察程序将要做什么 那么很可能结果就不是我们想要的
    */
    public static void typeTrans() {
        System.out.println((int) (char) (byte) -1);
    }
}

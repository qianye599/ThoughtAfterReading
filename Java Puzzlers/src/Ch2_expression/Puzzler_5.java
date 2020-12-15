package Ch2_expression;

/**
 * 十六进制的趣事
 */
public class Puzzler_5 {
    public static void main(String[] args) {
        toHexString();
    }

    /*
     本以为输出1cafebabe 实际只输出cafebabe
     执行计算时 左值为long 右值为int 右值被升格为long
     由于int(十进制) 最高位为1(二进制) 字面常量为正数 而升格成十六进制后成了负数
     即:
       0x0000000100000000L
     + 0xffffffffcafebabeL
     ---------------------
       0x00000000cafebabeL
     故输出:cafebabe
     我们应该考虑避免混合类型的计算
     程序设计者应该考虑对混合类型提供支持
     */
    public static void toHexString() {
        System.out.println(Long.toHexString(0x100000000L + 0xcafebabe));
    }
}

package Ch2_expression;

/**
 * 半斤
 * 声明两个变量使得
 * x += i; 合法
 * x = x + i; 非法
 */
public class Puzzler_9 {
    public static void main(String[] args) {

    }


    /* 合法的复合赋值操作使得窄化类型转换赋值出现意想之外的结果
     * 而简单赋值操作拒绝窄化类型转换
     */
    public static void declare() {
        char x = 'a';
        int i = 1;
        x += i;     // 合法复合赋值
        //x = x + i;  // 非法简单赋值 会进行显式转型 故error
    }
}

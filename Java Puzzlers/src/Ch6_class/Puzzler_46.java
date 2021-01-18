package Ch6_class;

/**
 * 令人混淆的构造器
 */
public class Puzzler_46 {
    /* 构造分两阶段
     * 一阶段 选取可以使用的构造器
     * 二阶段 选择更加精确的构造器
     * 此处Object引用可以接受的类型更宽泛 故被视为更不精确的
     * 若出现同等更精确的构造器 则无法通过编译
     */
    public static void main(String[] args) {
        new Puzzler_46(null);// Array
    }

    private Puzzler_46(Object o) {
        System.out.println("Object");
    }

//    private Puzzler_46(int[] arr) {
//        System.out.println("Arrays");
//    }

    private Puzzler_46(double[] arr) {
        System.out.println("Array");
    }

}

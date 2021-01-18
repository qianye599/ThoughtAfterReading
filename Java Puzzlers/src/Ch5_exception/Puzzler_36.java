package Ch5_exception;

/**
 * 优柔寡断
 */
public class Puzzler_36 {

    public static void main(String[] args) {
        boolean res = decision();
        System.out.println(res);
    }

    /*
     * finally语句在离开try block时执行
     * return continue break throw来退出try block属于意外退出
     * 意外退出控制权最终在finally手上 禁用用以上操作来结束try block
     * 除了io流的关闭(特例)
     */
    public static boolean decision() {
        try {
            return true;
        } finally {
            return false;
        }
    }
}

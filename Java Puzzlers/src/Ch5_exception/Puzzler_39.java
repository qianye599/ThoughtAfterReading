package Ch5_exception;

/**
 * 你好,再见
 */
public class Puzzler_39 {
    public static void main(String[] args) {
        try{
            System.out.println("Hello World");
            // System.exit()会停止所有的程序线程 不会执行finally中的语句
            System.exit(0);
        }finally {
            System.out.println("GoodBye World");
        }
    }
}

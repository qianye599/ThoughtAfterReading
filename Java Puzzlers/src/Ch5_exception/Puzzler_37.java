package Ch5_exception;

/**
 * 极端不可思议
 */
public class Puzzler_37 {
    public static void main(String[] args) {
//        func1();
        func2();
        func3();

    }

    /* checked exception 必须由try块抛出 */
//    public static void func1(){
//        try {
//            System.out.println("function1 success");
//        }catch (IOException e){
//            //System.out.println("function1 success");
//        }
//    }

    /* 尽管Exception混淆不清 但是是合法的 */
    public static void func2() {
        try {
        } catch (Exception e) {
            System.out.println("function2 fail");
        }
    }

    /* 一个方法可以抛出的checked exception是所有类型声明所能抛出的checked exception的交集而非并集
     * 所以Type.f()不会抛出任何checked exception
     */
    public static void func3() {
        Type3 t = new C();
        t.f();
    }

    interface Type1 {
        void f() throws CloneNotSupportedException;
    }

    interface Type2 {
        void f() throws InterruptedException;
    }

    interface Type3 extends Type1, Type2 {
    }

    static class C implements Type3 {

        @Override
        public void f() {
            System.out.println("function3 success");
        }
    }
}

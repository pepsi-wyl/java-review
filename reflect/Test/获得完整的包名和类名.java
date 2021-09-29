package Test;

/**
 * @author by wyl
 * @date 2021/9/27.15点53分
 * 实例化Class类对象
 * 获得完整的包名和类名
 */

public class T_1 {
    public static void main(String[] args) throws ClassNotFoundException {

        /**
         * 实例化Class对象
         */
        Class<T_1> clazz1 = T_1.class;
        Class<? extends T_1> clazz2 = new T_1().getClass();
        Class<?> clazz3 = Class.forName("Test.T_1");              //常用方式

        /**
         * 获得完整的包名及类名
         */
        System.out.println(clazz1.getName());
        System.out.println(clazz2.getName());
        System.out.println(clazz3.getName());

    }
}

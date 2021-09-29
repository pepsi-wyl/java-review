package Test;

import pojo.User;

import java.lang.reflect.Constructor;
import java.util.Arrays;

/**
 * @author by wyl
 * @date 2021/9/27.16点07分
 * 通过反射机制实例化一个类的对象
 */

public class T_3 {

    public static void main(String[] args) throws Exception {

        //加载Class实例
        Class<?> clazz = Class.forName("pojo.User");

        /**
         * 1.使用newInstance方式   必须有空参构造器   且为public
         */
        User user = (User) clazz.newInstance();
        System.out.println(user);


        /**
         * 2.使用构造器函数赋值
         */

        /**
         * getDeclaredConstructor实例化对象   ( getDeclaredConstructor(Class<?>... parameterTypes   填写类型反射 )
         * 私有化构造器需要setAccessible(true)
         */
        User user3 = (User) clazz.getDeclaredConstructor().newInstance();
        System.out.println(user3);

        Constructor<?> constructor = clazz.getDeclaredConstructor(int.class, String.class);  //得到构造器
        constructor.setAccessible(true);     //设置权限为true
        User user4 = (User) constructor.newInstance(20, "zhazha");  //实例化对象
        System.out.println(user4);

        /**
         * getDeclaredConstructors实例化对象   (getDeclaredConstructors 返回所有的构造器 利用下标可以调用相应的构造器   注意:正确填写参数 )
         * 私有化构造器需要setAccessible(true)
         */
        Constructor<?>[] constructors = clazz.getDeclaredConstructors();   //得到所有构造器
        System.out.println(Arrays.asList(constructors));

        User user1 = (User) constructors[0].newInstance();
        System.out.println(user1);

        Constructor<?> constructor1 = constructors[1];    //得到构造器
        constructor1.setAccessible(true);     //设置权限为可访问
        User user2 = (User) constructor1.newInstance(20, "zhazha");  //实例化对象
        System.out.println(user2);

    }

}

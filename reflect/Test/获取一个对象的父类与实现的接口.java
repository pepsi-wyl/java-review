package Test;

import java.io.Serializable;
import java.util.Arrays;

/**
 * @author by wyl
 * @date 2021/9/27.16点01分
 * 获取一个对象的父类与实现的接口
 */

public class T_2 implements Serializable {

    private static final long serialVersionUID = -2862585049955236662L;

    public static void main(String[] args) throws ClassNotFoundException {

        //获得Class实例
        Class<?> clazz = Class.forName("Test.T_2");

        //得到父类
        Class<?> superclass = clazz.getSuperclass();
        System.out.println(superclass.getName());

        //得到所有接口
        Class<?>[] interfaces = clazz.getInterfaces();
        System.out.println(Arrays.asList(interfaces));

    }


}

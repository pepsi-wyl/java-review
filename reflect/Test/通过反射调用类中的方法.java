package Test;

import pojo.User;

import java.lang.reflect.Method;

/**
 * @author by wyl
 * @date 2021/9/29.20点06分
 * 通过反射调用类中的方法
 */
public class T_6 {

    public static void main(String[] args) {

        Class<User> clazz = User.class;

        try {

            User user = clazz.getConstructor().newInstance();

            Method fun2 = clazz.getMethod("fun2");      //得到方法
            System.out.println(fun2.invoke(user));            //调用invoke方法

            Method setAge = clazz.getMethod("setAge", int.class);       //得到方法
            setAge.invoke(user,14);                                     //调用invoke方法

            Method setName = clazz.getMethod("setName", String.class);   //得到方法
            setAge.invoke(user,14);                                      //调用invoke方法


        } catch (Exception e) {
            e.printStackTrace();
        }



    }


}

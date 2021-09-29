package Test;

import pojo.User;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

/**
 * @author by wyl
 * @date 2021/9/27.16点25分
 * 获取某个类的全部属性并设置属性的值
 */
public class T_4 {

    public static void main(String[] args) throws Exception {

        Class<?> clazz = Class.forName("pojo.User");                 //得到Class实例

        /**
         * getDeclaredFields
         * 得到所有字段信息   权限不限   限于该类(不包括父类)
         */
        System.out.println("===============getDeclaredFields==================");
        Field[] fields = clazz.getDeclaredFields();
        for (Field field : fields) {
            //得到权限修饰符
            System.out.print(Modifier.toString(field.getModifiers()) + " ");
            //得到类型名称
            System.out.print(field.getType().getName() + " ");
            //得到字段名称
            System.out.println(field.getName());
        }

        /**
         * getFields
         * 得到所有的字段信息  public   不限于该类(包括父类)
         */
        System.out.println("===============getFields==================");
        Field[] fields1 = clazz.getFields();
        for (Field field : fields1) {
            //得到权限修饰符
            System.out.print(Modifier.toString(field.getModifiers()) + " ");
            //得到类型名称
            System.out.print(field.getType().getName() + " ");
            //得到字段名称
            System.out.println(field.getName());
        }

        /**
         * 设置属性的值
         */
        User user = (User) clazz.getConstructor().newInstance();
        Field age = clazz.getDeclaredField("age");
        age.set(user, 20);
        Field name = clazz.getDeclaredField("name");
        name.setAccessible(true);    //私有属性设置值时需为true
        name.set(user, "zhazha");
        System.out.println(user);

    }


}

package pojo;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author by wyl
 * @date 2021/9/27.16点07分
 */

@Data
@NoArgsConstructor

public class User {

    public int age;
    private String name;

    private User(int age, String name) throws Exception {
        this.age = age;
        this.name = name;
    }

    private void fun1()  {
        System.out.println("private!");
    }

    public String fun2() {
        return "public!";
    }

}

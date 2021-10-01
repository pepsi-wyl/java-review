package Proxy;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author by wyl
 * @date 2021/9/25.19点19分
 */

/**
 * T      接口名称
 * impl   接口实现类
 * new ProxyInvocationHandler<UserDao>(new UserDaoImpl()).getProxy();
 */
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ProxyInvocationHandler<T> implements InvocationHandler {

    private Object impl;

    //生成代理类
    public T getProxy() {
        return
                (T)
                        Proxy.newProxyInstance(
                                this.getClass().getClassLoader(),
                                impl.getClass().getInterfaces(),
                                this
                        );
        //public static Object newProxyInstance(ClassLoader loader, Class<?>[] interfaces, InvocationHandler h)     面向接口编程   
    }
        
        
    //处理代理类，并返回结果
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        return method.invoke(impl, args);
    }

}

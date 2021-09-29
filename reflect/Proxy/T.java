import Proxy.ProxyInvocationHandler;
import dao.UserDao;
import dao.UserDaoImpl;

/**
 * @author by wyl
 * @date 2021/9/25.
 */
public class T {

    @Test
    public void test() {
        UserDao userDao = new ProxyInvocationHandler<UserDao>(new UserDaoImpl()).getProxy();
        userDao.add();
        userDao.delete();
    }

}

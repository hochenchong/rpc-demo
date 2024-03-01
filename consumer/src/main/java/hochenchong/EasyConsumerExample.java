package hochenchong;

import hochenchong.model.User;
import hochenchong.proxy.ServiceProxyFactory;
import hochenchong.service.UserService;

/**
 * 简易的服务消费者
 */
public class EasyConsumerExample {
    public static void main(String[] args) {
        // 获取 UserService 实现类
        UserService userService = ServiceProxyFactory.getProxy(UserService.class);
        User user = userService.getUser("zhangsan");
        if (user != null) {
            System.out.println(user.getName());
        } else {
            System.out.println("user == null");
        }
    }
}

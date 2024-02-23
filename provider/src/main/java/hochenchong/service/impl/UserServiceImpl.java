package hochenchong.service.impl;

import hochenchong.model.User;
import hochenchong.service.UserService;

/**
 * 用户服务接口实现类
 */
public class UserServiceImpl implements UserService {
    @Override
    public User getUser(String name) {
        // 简单输出一下
        System.out.println("用户名：" + name);
        User user = new User();
        user.setName(name);
        return user;
    }
}

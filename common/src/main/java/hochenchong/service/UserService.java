package hochenchong.service;

import hochenchong.model.User;

/**
 * 用户服务接口
 */
public interface UserService {
    /**
     * 获取用户
     *
     * @param name 用户名
     * @return 用户信息
     */
    User getUser(String name);
}

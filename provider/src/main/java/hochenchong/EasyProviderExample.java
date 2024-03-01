package hochenchong;

import hochenchong.registry.LocalRegistry;
import hochenchong.server.HttpServer;
import hochenchong.server.VertxHttpServer;
import hochenchong.service.UserService;
import hochenchong.service.impl.UserServiceImpl;

/**
 * 简易的服务提供者
 */
public class EasyProviderExample {
    public static void main(String[] args) {
        // 启动 web 服务
        HttpServer httpServer = new VertxHttpServer();
        httpServer.doStart(8080);
        // 注册服务
        LocalRegistry.register(UserService.class.getName(), UserServiceImpl.class);
    }
}

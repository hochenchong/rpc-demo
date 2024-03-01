package hochenchong.model;

import lombok.Data;
import lombok.ToString;

/**
 * RPC 请求
 */
@Data
@ToString
public class RpcRequest {
    /**
     * 服务名称
     */
    private String serviceName;
    /**
     * 方法名
     */
    private String methodName;
    /**
     * 参数类型
     */
    private Class<?>[] parameterTypes;
    /**
     * 入参
     */
    private Object[] parameters;
}

package hochenchong.model;

import lombok.Data;
import lombok.ToString;

/**
 * RPC 响应
 */
@Data
@ToString
public class RpcResponse {
    /**
     * 响应数据
     */
    private Object data;

    /**
     * 响应数据类型（预留）
     */
    private Class<?> dataType;

    /**
     * 响应信息
     */
    private String message;

    /**
     * 异常信息
     */
    private Exception exception;
}

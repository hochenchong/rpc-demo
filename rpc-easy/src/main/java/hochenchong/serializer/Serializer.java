package hochenchong.serializer;

import java.io.IOException;

/**
 * 序列化器接口
 */
public interface Serializer {
    /**
     * 序列化
     *
     * @param object 对象
     * @return 二进制
     * @param <T> 要序列化的对象
     * @throws IOException 异常
     */
    <T> byte[] serialize(T object) throws IOException;

    /**
     * 反序列化
     *
     * @param bytes 二进制数据
     * @param clazz 对象类型
     * @return 对象
     * @param <T> 类型
     * @throws IOException 异常
     */
    <T> T deserialize(byte[] bytes, Class<T> clazz) throws IOException;
}

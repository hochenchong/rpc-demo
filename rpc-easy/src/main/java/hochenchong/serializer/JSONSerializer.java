package hochenchong.serializer;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.ByteArrayOutputStream;
import java.io.ByteArrayInputStream;
import java.io.IOException;

public class JSONSerializer implements Serializer {
    @Override
    public <T> byte[] serialize(T object) throws IOException {
        // 创建一个 ObjectMapper 对象
        ObjectMapper mapper = new ObjectMapper();
        // 序列化对象为 byte 数组
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        mapper.writeValue(outputStream, object);
        return outputStream.toByteArray();
        // return JSONUtil.toJsonStr(object).getBytes(StandardCharsets.UTF_8);
    }

    @Override
    public <T> T deserialize(byte[] bytes, Class<T> clazz) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        // 反序列化byte数组为对象
        ByteArrayInputStream inputStream = new ByteArrayInputStream(bytes);
        return mapper.readValue(inputStream, clazz);
        // return JSONUtil.toBean(new String(bytes, StandardCharsets.UTF_8), clazz);
    }
}

package cn.dm.common;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

/**
 * 日志工具类
 *
 * @author leon
 * @date 2018-7-4
 */
@Component
public class LogUtils {
    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    public void i(String topic, String msg) {
        kafkaTemplate.send(topic, "dm", msg);
    }
}

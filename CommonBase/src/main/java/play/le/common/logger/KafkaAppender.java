package play.le.common.logger;

import org.apache.log4j.AppenderSkeleton;
import org.apache.log4j.spi.LoggingEvent;

/**
 * 自定义Appender <br/>
 * 消息级别: INFO <br/>
 * 用于将LOG4J的日志[消费]到Kafka中
 */
public class KafkaAppender extends AppenderSkeleton {
    /** 消息主题 */
    private String topic;
    /** Kafka Broker列表 */
    private String brokerList;
    private KafkaBuilder kafkaBuilder = null;

    @Override
    public void activateOptions() {
//        if(kafkaBuilder == null) {
//            if (StringUtils.isEmpty(topic)) { // 如果[topic]为空,则使用默认的队列
//                topic = "LENOVO_CLUB_LOG4J";
//            }
//            kafkaBuilder = new KafkaBuilder(brokerList, topic);
//        }
    }

    @Override
    protected void append(LoggingEvent event) {
//        //kafkaBuilder.produce(layout.format(event), topic + "_" + event.getLevel().toString());
//        kafkaBuilder.produce(layout.format(event), topic);
    }

    @Override
    public void close() {
//        kafkaBuilder.close();
    }

    @Override
    public boolean requiresLayout() {
        return true;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public String getBrokerList() {
        return brokerList;
    }

    public void setBrokerList(String brokerList) {
        this.brokerList = brokerList;
    }
}

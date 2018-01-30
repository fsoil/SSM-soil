package play.le.common.logger;

//import kafka.javaapi.producer.Producer;
//import kafka.producer.KeyedMessage;
//import kafka.producer.ProducerConfig;
//import org.apache.commons.io.FileUtils;


/**
 * Kafka构造器
 *
 * @author LENOVO)DU-YI
 * @version 0.1
 */
public class KafkaBuilder {
//    private static final String FS      = (char)01 + "";
//    private static final Logger LOGGER  = Logger.getLogger(KafkaBuilder.class);
//    private static final String OS_NAME = System.getProperty("os.name").toLowerCase();
//    private static String LF            = "\n";
//    private static String IP            = "localhost";
//    //    private static String HOST_NAME     = "localhost";
//    private String topic;
//    Producer<String, String> producer = null;
//
//    static {
//        try {
//            InetAddress addr = InetAddress.getLocalHost();
//            IP               = addr.getHostAddress().toString();
////            HOST_NAME        = addr.getHostName().toString();
//        } catch (UnknownHostException e) {
//            LOGGER.error(e.getMessage());
//        }
//
//        if (OS_NAME.indexOf("windows") >= 0) {
//            LF = "\r\n";
//        } else { // 这里仅仅进行简单的判断
//            LF = "\n";
//        }
//    }
//
//    /**
//     *
//     * @param brokerList String
//     * @param topic      String
//     */
//    public KafkaBuilder(String brokerList, String topic) {
//        this.topic         = topic;
//        Properties props   = new Properties();
//        props.put("serializer.class", "kafka.serializer.StringEncoder");
//        props.put("metadata.broker.list", brokerList);
//
//        // TODO
////        props.put("batch.num.messages", "1000");
////        props.put("request.required.acks", "1");
////        props.put("send.buffer.bytes", "1048576");
////        props.put("request.timeout.ms", "8000");
//        ProducerConfig config = new ProducerConfig(props);
//        producer = new Producer(config);
//    }
//
//    /**
//     * 发送消息
//     *
//     * @param message String
//     * @param topic   String
//     */
//    public void produce(String message, String topic) {
//        String partitionKey = System.currentTimeMillis() % 5 == 0 ? "1" : "2";
//        KeyedMessage<String, String> data = new KeyedMessage(topic, partitionKey, message);
//        try {
//            synchronized (producer) {
//                producer.send(data);
//            }
//        } catch (Exception e) {
//            try {
//            	String failedMsg   = data.message();
//            	String failedTopic = data.topic();
//            	StringBuffer failedDataBuf = new StringBuffer();
//            	failedDataBuf.append(failedMsg);
//            	failedDataBuf.append(FS);
//            	failedDataBuf.append(failedTopic);
//            	failedDataBuf.append(LF);
//            	File file = FileUtils.getFile(IP + "_" + failedTopic + ".data");
//                FileUtils.write(file, failedDataBuf.toString(), "UTF-8", true);
//                ApiLogger.error("Kafka msg sender error,please check the server status. msg is write to local file " +
//                		file.getAbsolutePath() + file.getName());
//            } catch (Exception ioe) {
//                LOGGER.error(ioe.getMessage());
//            }
//        }
//
//    }
//
//    public void close() {
//        if(producer != null)
//            producer.close();
//    }
//
//    public String getTopic() {
//        return topic;
//    }
//
//    public void setTopic(String topic) {
//        this.topic = topic;
//    }
}


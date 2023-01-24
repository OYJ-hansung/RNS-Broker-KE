package shop.rns.kakaobroker.utils.rabbitmq;

public class RabbitUtil {

    // EXCHANGE
    public static final String KAKAO_EXCHANGE_NAME = "dx.kakao.work";

    public static final String DLX_EXCHANGE_NAME = "dx.kakao.wait";

    public static final String DEAD_EXCHANGE_NAME = "dx.kakao.dead";

    public static final String RECEIVE_EXCHANGE_NAME = "dx.kakao.receive";

    // QUEUE
    public static final String KE_WORK_QUEUE_NAME = "q.kakao.ke.work";
    public static final String KE_RECEIVE_QUEUE_NAME = "q.kakao.ke.receive";
    public static final String KE_WAIT_QUEUE_NAME = "q.kakao.ke.wait";

    // Routing Key
    public static final String KE_WORK_ROUTING_KEY = "kakao.send.ke";
    public static final String KE_RECEIVE_ROUTING_KEY = "kakao.receive.ke";
    public static final String KE_WAIT_ROUTING_KEY = "kakao.wait.ke";

    // DLX Routing key
    public static final String CNS_WAIT_ROUTING_KEY = "kakao.wait.cns";

    public static final int WAIT_TTL = 3000;
}

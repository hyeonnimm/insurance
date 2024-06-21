package insurance.infra;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import insurance.config.kafka.KafkaProcessor;
import insurance.domain.*;
import javax.naming.NameParser;
import javax.naming.NameParser;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;

//<<< Clean Arch / Inbound Adaptor
@Service
@Transactional
public class PolicyHandler {

    @Autowired
    PaymentRepository paymentRepository;

    @StreamListener(KafkaProcessor.INPUT)
    public void whatever(@Payload String eventString) {}

    @StreamListener(
        value = KafkaProcessor.INPUT,
        condition = "headers['type']=='Reviewed'"
    )
    public void wheneverReviewed_ReadyToPay(@Payload Reviewed reviewed) {
        Reviewed event = reviewed;
        System.out.println(
            "\n\n##### listener ReadyToPay : " + reviewed + "\n\n"
        );

        // Sample Logic //
        Payment.readyToPay(event);
    }
}
//>>> Clean Arch / Inbound Adaptor

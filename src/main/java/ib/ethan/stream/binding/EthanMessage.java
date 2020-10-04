package ib.ethan.stream.binding;

import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;

public interface EthanMessage {
    String OUTPUT = "output";

    @Output(EthanMessage.OUTPUT)
    MessageChannel output();
}

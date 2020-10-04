package ib.ethan.stream.config;

import ib.ethan.stream.binding.EthanMessage;
import org.springframework.cloud.stream.annotation.EnableBinding;

@EnableBinding(EthanMessage.class)
public class RabbitConfiguration {
}

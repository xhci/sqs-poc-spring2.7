package com.example.demo;

import org.springframework.stereotype.Component;
import io.awspring.cloud.messaging.listener.annotation.SqsListener;


@Component
public class SqsReceiver {

    @SqsListener("test2.fifo")
    public void listen(String message) {
        System.out.println(message);
    }
}

package io.chatty.impl.config;

import io.chatty.impl.domain.user.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

@Configuration
public class QueueConfig {

    @Bean
    public Queue<User> userQueue() {
        return new ConcurrentLinkedQueue<>();
    }
}

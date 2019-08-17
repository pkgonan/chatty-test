package io.chatty.impl.config;

import io.chatty.impl.domain.room.Room;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@Configuration
public class MapConfig {

    @Bean
    public Map<Long, Room> roomMap() {
        return new ConcurrentHashMap<>();
    }
}

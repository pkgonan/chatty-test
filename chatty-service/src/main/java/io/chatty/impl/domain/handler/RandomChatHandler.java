package io.chatty.impl.domain.handler;

import io.chatty.core.handler.WebSocketHandler;
import org.springframework.web.reactive.socket.WebSocketSession;
import reactor.core.publisher.Mono;

public class RandomChatHandler extends WebSocketHandler {

    public RandomChatHandler() {
    }

    @Override
    public Mono<Void> handle(final WebSocketSession session) {
        return session.send(session.receive()
                .map(msg -> "RECEIVED ON SERVER :: " + msg.getPayloadAsText())
                .map(session::textMessage));
    }
}

package io.chatty.impl.domain.sender;

import io.chatty.core.message.Message;
import io.chatty.core.sender.WebSocketSender;
import org.springframework.web.reactive.socket.WebSocketHandler;
import org.springframework.web.reactive.socket.WebSocketMessage;
import org.springframework.web.reactive.socket.client.WebSocketClient;
import reactor.core.publisher.Mono;

import java.net.URI;
import java.util.Arrays;

public class RandomChatSender extends WebSocketSender {

    public RandomChatSender(final WebSocketClient webSocketClient, final URI uri) {
        super(webSocketClient, uri);
    }

    @Override
    public void send(final Message message) {
        final WebSocketHandler webSocketHandler = webSocketHandler(message);
        webSocketClient.execute(uri, webSocketHandler).subscribe();
    }

    private WebSocketHandler webSocketHandler(final Message message) {
        return session -> session.send(
                Mono.just(session.textMessage(Arrays.toString(message.getPayload()))))
                .thenMany(session.receive()
                        .map(WebSocketMessage::getPayloadAsText)
                        .log())
                .then();
    }
}

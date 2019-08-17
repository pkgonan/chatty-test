package io.chatty.core.sender;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.util.Assert;
import org.springframework.web.reactive.socket.client.WebSocketClient;

public abstract class WebSocketSender implements Sender {

    protected static final Logger LOG = LoggerFactory.getLogger(WebSocketSender.class.getName());

    protected final WebSocketClient webSocketClient;

    public WebSocketSender(final WebSocketClient webSocketClient) {
        Assert.notNull(webSocketClient, "WebSocketClient must not be null.");

        this.webSocketClient = webSocketClient;
    }
}

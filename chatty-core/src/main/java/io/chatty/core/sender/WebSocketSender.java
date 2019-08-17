package io.chatty.core.sender;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.util.Assert;
import org.springframework.web.reactive.socket.client.WebSocketClient;

import java.net.URI;

public abstract class WebSocketSender implements Sender {

    protected static final Logger LOG = LoggerFactory.getLogger(WebSocketSender.class.getName());

    protected final WebSocketClient webSocketClient;
    protected final URI uri;

    public WebSocketSender(final WebSocketClient webSocketClient, final URI uri) {
        Assert.notNull(webSocketClient, "WebSocketClient must not be null.");
        Assert.notNull(uri, "URI must not be null.");

        this.webSocketClient = webSocketClient;
        this.uri = uri;
    }
}

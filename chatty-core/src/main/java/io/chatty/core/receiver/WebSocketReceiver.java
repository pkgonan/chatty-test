package io.chatty.core.receiver;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.util.Assert;
import org.springframework.web.reactive.socket.WebSocketHandler;

public abstract class WebSocketReceiver implements Receiver {

    protected static final Logger LOG = LoggerFactory.getLogger(WebSocketReceiver.class.getName());

    protected final WebSocketHandler webSocketHandler;

    public WebSocketReceiver(final WebSocketHandler webSocketHandler) {
        Assert.notNull(webSocketHandler, "WebSocketHandler must not be null.");

        this.webSocketHandler = webSocketHandler;
    }
}

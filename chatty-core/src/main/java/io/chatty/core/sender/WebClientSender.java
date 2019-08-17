package io.chatty.core.sender;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.util.Assert;
import org.springframework.web.reactive.function.client.WebClient;
import org.springframework.web.reactive.socket.client.WebSocketClient;

public abstract class WebClientSender implements Sender {

    protected static final Logger LOG = LoggerFactory.getLogger(WebClientSender.class.getName());

    protected final WebClient webClient;

    public WebClientSender(final WebClient webClient) {
        Assert.notNull(webClient, "WebClient must not be null.");

        this.webClient = webClient;
    }
}

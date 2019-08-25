package io.chatty.core.handler;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.reactive.socket.WebSocketSession;

public abstract class WebSocketHandler implements Handler<WebSocketSession>, org.springframework.web.reactive.socket.WebSocketHandler {

    protected static final Logger LOG = LoggerFactory.getLogger(WebSocketHandler.class.getName());

}

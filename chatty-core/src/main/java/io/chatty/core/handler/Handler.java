package io.chatty.core.handler;

import reactor.core.publisher.Mono;

public interface Handler<T> {

    Mono<Void> handle(T data);

}

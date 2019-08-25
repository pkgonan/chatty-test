package io.chatty.core.receiver;

import reactor.core.publisher.Mono;

public interface Receiver {

    <T> Mono<Void> receive(T data);

}

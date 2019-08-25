package io.chatty.core.sender;

import reactor.core.publisher.Mono;

public interface Sender {

    <T> Mono<Void> send(T data);

}

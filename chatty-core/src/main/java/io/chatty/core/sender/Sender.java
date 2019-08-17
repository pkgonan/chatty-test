package io.chatty.core.sender;

public interface Sender {

    <T> void send(T data);

}

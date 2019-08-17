package io.chatty.core.receiver;

public interface Receiver {

    <T> void receive(T data);

}

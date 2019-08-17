package io.chatty.core.sender;

import io.chatty.core.message.Message;

public interface Sender {

    void send(Message message);

}

package io.chatty.core.receiver;

import io.chatty.core.message.Message;

public interface Receiver {

    void receive(Message message);

}

package io.chatty.impl.service;

import io.chatty.impl.domain.user.User;
import org.springframework.stereotype.Service;

import java.util.Queue;

@Service
public class RandomChatService {

    private final Queue<User> userQueue;

    RandomChatService(final Queue<User> userQueue) {
        this.userQueue = userQueue;
    }

    public void join(final User user) {
        userQueue.add(user);
    }

    public long users() {
        return userQueue.size();
    }
}

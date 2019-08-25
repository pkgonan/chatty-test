package io.chatty.impl.controller;

import io.chatty.impl.domain.user.User;
import io.chatty.impl.service.RandomChatService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
public class RandomChatUserController {

    private final RandomChatService randomChatService;

    RandomChatUserController(final RandomChatService randomChatService) {
        this.randomChatService = randomChatService;
    }

    @PostMapping("/chats/random/users")
    public void add(@RequestBody @Valid final UserPayload payload) {
        final User user = User.of(payload.getId());
        randomChatService.join(user);
    }

    @GetMapping("/chats/random/users")
    public long size() {
        return randomChatService.users();
    }

    private static class UserPayload {
        private final String id;

        UserPayload(final String id) {
            this.id = id;
        }

        String getId() {
            return id;
        }
    }
}

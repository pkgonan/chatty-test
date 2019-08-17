package io.chatty.impl.controller;

import io.chatty.impl.domain.user.User;
import io.chatty.impl.service.RandomChatService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
public class RandomChatController {

    private final RandomChatService randomChatService;

    RandomChatController(RandomChatService randomChatService) {
        this.randomChatService = randomChatService;
    }

    @PostMapping("/chats/random")
    public void join(@RequestBody @Valid final User user) {
        randomChatService.join(user);
    }
}

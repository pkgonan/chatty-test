package io.chatty.impl.scheduler;

import io.chatty.impl.domain.room.Room;
import io.chatty.impl.domain.room.RoomGenerator;
import io.chatty.impl.domain.user.User;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.Queue;

@Component
public class RandomChatScheduler {

    private final RoomGenerator roomGenerator;
    private final Queue<User> userQueue;

    RandomChatScheduler(Queue<User> userQueue) {
        this.userQueue = userQueue;
        this.roomGenerator = RoomGenerator.of();
    }

    @Scheduled(fixedDelay = 3000L)
    public void mapping() {
        final int roomSize = 2;
        final Room room = roomGenerator.generate(roomSize);

        while (room.isAvailable() && !userQueue.isEmpty()) {
            final User user = userQueue.poll();
            room.join(user);
        }
    }
}

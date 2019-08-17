package io.chatty.impl.domain.room;

import java.util.concurrent.atomic.AtomicLong;

public class RoomGenerator {

    private final AtomicLong counter;

    private RoomGenerator() {
        this.counter = new AtomicLong();
    }

    public static RoomGenerator of() {
        return new RoomGenerator();
    }

    public Room generate(final int size) {
        return Room.of(counter.incrementAndGet(), size);
    }
}

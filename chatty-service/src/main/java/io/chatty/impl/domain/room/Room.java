package io.chatty.impl.domain.room;

import io.chatty.impl.domain.user.User;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import java.util.HashSet;
import java.util.Set;

@ToString
@EqualsAndHashCode(of = "id")
public class Room {

    private final long id;
    private final int size;
    private final Set<User> users;

    private Room(final long id, final int size) {
        this.id = id;
        this.size = size;
        this.users = new HashSet<>();
    }

    static Room of(final long id, final int size) {
        return new Room(id, size);
    }

    public void join(final User user) {
        this.users.add(user);
    }

    public boolean isAvailable() {
        return size > users.size();
    }
}

package io.chatty.impl.domain.user;

import lombok.EqualsAndHashCode;
import lombok.ToString;

@ToString
@EqualsAndHashCode(of = "id")
public class User {

    private final String id;

    private User(final String id) {
        this.id = id;
    }

    public static User of(final String id) {
        return new User(id);
    }

    public String getId() {
        return id;
    }
}

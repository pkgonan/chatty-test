package io.chatty.core.message;

import org.springframework.util.Assert;
import org.springframework.util.ObjectUtils;

import java.util.Arrays;

public final class Message {

    private final Type type;
    private final byte[] payload;

    public Message(final Type type, final byte[] payload) {
        Assert.notNull(type, "Type must not be null.");
        Assert.notNull(payload, "byte[] must not be null.");

        this.type = type;
        this.payload = payload;
    }

    public Type getType() {
        return type;
    }

    public byte[] getPayload() {
        return payload;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Message)) {
            return false;
        }
        final Message otherMessage = (Message) other;
        return (this.type.equals(otherMessage.type) &&
                ObjectUtils.nullSafeEquals(this.payload, otherMessage.payload));
    }

    @Override
    public int hashCode() {
        return this.type.hashCode() * 29 + Arrays.hashCode(this.payload);
    }

    /**
     * Message types.
     */
    public enum Type {
        /**
         * Text message.
         */
        TEXT,
        /**
         * Ping.
         */
        PING,
        /**
         * Pong.
         */
        PONG;
    }
}

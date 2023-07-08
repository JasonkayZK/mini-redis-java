package io.github.jasonkayzk.storage;

import io.netty.channel.Channel;

import java.time.Duration;

public abstract class KvStore {

    /**
     *
     * @param key key
     * @return the value, null if not found
     */
    abstract public Byte[] get(String key);

    /**
     * Set the value associated with a key along with an optional expiration
     * Duration.
     * If a value is already associated with the key, it is removed.
     * @param key key
     * @param value the value associated with the key
     * @param expire expiration of the key, null means no expiration.
     */
    abstract public void set(String key, Byte[] value, Duration expire);

    /**
     * Returns a `Receiver` for the requested channel.
     * The returned `Receiver` is used to receive values broadcast by `PUBLISH`
     * commands.
     *
     * @param key key
     * @return the receiver for the message channel
     */
    abstract public Channel subscribe(String key);

    /**
     * Publish a message to the channel. Returns the number of subscribers
     * listening on the channel.
     *
     * @param key key
     * @param value the value to publish for the channel
     * @return the count of bytes published
     */
    abstract public Integer publish(String key, Byte[] value);

}

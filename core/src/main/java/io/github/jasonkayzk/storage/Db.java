package io.github.jasonkayzk.storage;

import io.netty.channel.Channel;

import java.time.Duration;

public class Db extends KvStore {

    @Override
    public Byte[] get(String key) {
        return new Byte[0];
    }

    @Override
    public void set(String key, Byte[] value, Duration expire) {

    }

    @Override
    public Channel subscribe(String key) {
        return null;
    }

    @Override
    public Integer publish(String key, Byte[] value) {
        return null;
    }
}

package com.amuer.messagequeue;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.TimeUnit;

/**
 * Created by mark on 2015/7/9.
 */
public interface QueueInterface {

    public int push(Message message);
    public int push(Message message, int timeout, TimeUnit timeUnit) throws InterruptedException;

    public Message pop();
    public BlockingQueue<Message> pop(int num);
    public BlockingQueue<Message> popAll();
}

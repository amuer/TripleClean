package com.amuer.messagequeue;

import com.amuer.config.ConfigManager;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.TimeUnit;

/**
 * Created by mark on 2015/7/9.
 */
public class MessageQueue implements QueueInterface{

    private BlockingQueue<Message> blockingQueue = new ArrayBlockingQueue<Message>(Integer.parseInt(ConfigManager.getInstance().getValue("MessageQueueCapacity")));

    @Override
    public int push(Message message) {
        blockingQueue.offer(message);
        return 1;
    }

    @Override
    public int push(Message message, int timeout, TimeUnit timeUnit) {
        try {
            blockingQueue.offer(message, timeout, timeUnit);
            return 1;
        } catch (InterruptedException e) {
            e.printStackTrace();
            return -1;
        }
    }

    @Override
    public Message pop() {
        return null;
    }

    @Override
    public BlockingQueue<Message> pop(int num) {
        return null;
    }

    @Override
    public BlockingQueue<Message> popAll() {
        return null;
    }
}

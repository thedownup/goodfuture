package com.goodfuture.lock;

import org.springframework.stereotype.Component;

import java.util.concurrent.locks.AbstractQueuedSynchronizer;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @description:
 * @author: jintengzhou
 * @date: 2022-02-10 11:52
 */

public class MyLock extends AbstractQueuedSynchronizer {
    
    public static void main(String[] args) {
        final ReentrantLock reentrantLock = new ReentrantLock();
        reentrantLock.lock();
    }
    
}
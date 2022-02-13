package com.goodfuture.goodfuture;

import com.google.common.collect.Lists;
import org.junit.jupiter.api.Test;

import java.util.concurrent.locks.LockSupport;

class GoodfutureApplicationTests {
    
    @Test
    void contextLoads() {
    }
    
    @Test
    public void test1() {
    
        LockSupport.unpark(Thread.currentThread());
        LockSupport.unpark(Thread.currentThread());
        System.out.println("true = " + true);
        LockSupport.park();
        System.out.println("true = " + false);
        LockSupport.park();
        System.out.println("true = " + true);
    }
    
}

package com.goodfuture.spitest;

import org.apache.dubbo.common.URL;
import org.apache.dubbo.common.extension.Adaptive;
import org.apache.dubbo.common.extension.SPI;

/**
 * @description:
 * @author: jintengzhou
 * @date: 2022-02-08 17:24
 */
@SPI()
public interface Car {
    
    @Adaptive({"a","b1","c","b"})
    String getName(URL url);
    
}
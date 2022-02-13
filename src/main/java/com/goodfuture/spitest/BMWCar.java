package com.goodfuture.spitest;

import org.apache.dubbo.common.URL;

/**
 * @description:
 * @author: jintengzhou
 * @date: 2022-02-08 17:26
 */
public class BMWCar implements Car {
    @Override
    public String getName(URL url) {
        return "bmw";
    }
}
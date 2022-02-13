package com.goodfuture.spitest;

import org.apache.dubbo.common.URL;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;


/**
 * @description:
 * @author: jintengzhou
 * @date: 2022-02-08 17:26
 */
public class TeslaCar implements Car {
    @Override
    public String getName(URL url) {
        return "tesla";
    }
}
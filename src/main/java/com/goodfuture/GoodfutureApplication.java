package com.goodfuture;

import com.goodfuture.lock.MyLock;
import com.goodfuture.spitest.BMWCar;
import com.goodfuture.spitest.Car;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class GoodfutureApplication {
    
    
    public static void main(String[] args) {
        final ConfigurableApplicationContext applicationContext = SpringApplication.run(GoodfutureApplication.class, args);
        
        System.out.println(applicationContext.getBean(Car.class).getName(null));
        System.out.println(applicationContext.getBean(MyLock.class).getClass().getSimpleName());

//        final Car car = ExtensionLoader.getExtensionLoader(Car.class).getAdaptiveExtension();
//        System.out.println("car = " + car.getName(URL.valueOf("https://www.materialpalette.com?b=TeslaCar")));
        
    }
    
}

package com.goodfuture.spitest;

import com.goodfuture.lock.MyLock;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DeferredImportSelector;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

import java.util.function.Predicate;

/**
 * @description:
 * @author: jintengzhou
 * @date: 2022-02-11 16:05
 */
@Configuration
@Import(ImportTest.class)
public class ImportTest implements DeferredImportSelector {
    
    
    @Override
    public String[] selectImports(AnnotationMetadata importingClassMetadata) {
        return new String[]{TeslaCar.class.getName()};
    }
    
    
    @Bean
    public MyLock myLock() {
    
        final ThreadLocal<Object> threadLocal = new ThreadLocal<>();
    
        threadLocal.remove();
        
        return new MyLock();
    }
}
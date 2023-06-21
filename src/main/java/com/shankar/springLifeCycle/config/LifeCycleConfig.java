package com.shankar.springLifeCycle.config;

import com.shankar.springLifeCycle.services.FirstBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Configuration
public class LifeCycleConfig {

    @Bean(initMethod = "initMethod",destroyMethod = "destroyMethod")
    @Lazy
    public FirstBean getFirstBean(){
        return new FirstBean();
    }
}

package com.shankar.springLifeCycle.beanPostProcessors;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class customBeanPostProcessors implements BeanPostProcessor {

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName)
    {
        if(beanName.equals("getFirstBean")) {
            log.info("customBeanPostProcessors > postProcessBeforeInitialization > start");
            log.info(" bean name is " + bean.toString());
            log.info("customBeanPostProcessors > postProcessBeforeInitialization > end");
        }
        return bean;
    }
    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName)
    {
        if(beanName.equals("getFirstBean")) {
            log.info("customBeanPostProcessors > postProcessAfterInitialization > start");
            log.info(" bean name is " + bean.toString());
            log.info("customBeanPostProcessors > postProcessAfterInitialization > end");
        }
        return bean;
    }
}

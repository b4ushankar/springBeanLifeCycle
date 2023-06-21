package com.shankar.springLifeCycle.beanfactory;

import com.shankar.springLifeCycle.services.FirstBean;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
@Slf4j
public class CustomBeanFactoryPostProcessor implements BeanFactoryPostProcessor {
    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
        log.info("CustomBeanFactoryPostProcessor > postProcessBeanFactory > start");
        BeanDefinition beanDefinition = beanFactory.getBeanDefinition("getFirstBean");
        log.info("Bean defination of a class "+beanDefinition.toString());
        log.info("CustomBeanFactoryPostProcessor > postProcessBeanFactory > end");
    }
}

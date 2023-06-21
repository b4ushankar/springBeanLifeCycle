package com.shankar.springLifeCycle.services;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;


@Slf4j
@ConditionalOnClass(value=SecondBean.class)
public class FirstBean implements InitializingBean, DisposableBean {


    private SecondBean secondBean;

    public FirstBean(){
        log.info("first bean Constructor");
    }

    @Autowired
    public void setSecondBean(SecondBean secondBean){
        log.info("FirstBean > setSecondbean > start");
        this.secondBean=secondBean;
        log.info("FirstBean > setSecondbean > end");
    }

    /**
     * destroy method executes before garbage collection
     * @throws Exception
     */
    @Override
    public void destroy() throws Exception {
    log.info("Disposable bean > destroy method");
    }


    @Override
    public void afterPropertiesSet() throws Exception {
        log.info("Initializing bean > afterProperties method");
    }

    @PostConstruct
    public void postConstruct(){
        log.info("PostConstruct annotation > postConstruct method");

    }

    @PreDestroy
    public void preDestroy(){
        log.info("PreDestroy annotation > postConstruct method");

    }

    public void initMethod(){
        log.info("Bean init method > init method");
    }

    public void destroyMethod(){
        log.info("Bean destroy method > destroy method");
    }
}

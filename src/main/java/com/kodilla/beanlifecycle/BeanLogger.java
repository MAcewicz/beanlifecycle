package com.kodilla.beanlifecycle;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class BeanLogger implements BeanPostProcessor {

    private Logger LOGGER = LoggerFactory.getLogger(BeanLogger.class);

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {

        LOGGER.info("Created bean: " + beanName);
        return bean;
    }
}

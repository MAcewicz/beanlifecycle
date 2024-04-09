package com.kodilla.beanlifecycle.events;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class MathEventListener implements ApplicationListener<MathEvent> {

    private final Logger LOGGER = LoggerFactory.getLogger(MathEventListener.class);

    @Override
    public void onApplicationEvent(MathEvent event) {
        LOGGER.info(event.toString());
    }
}

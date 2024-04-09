package com.kodilla.beanlifecycle.events;

import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/calc")
public class MathController implements ApplicationEventPublisherAware {

    private ApplicationEventPublisher publisher;

    private final MathService mathService;

    public MathController(MathService mathService) {
        this.mathService = mathService;
    }

    @RequestMapping("/add")
    public double addition(@RequestParam double no1, @RequestParam double no2) {
        double result = mathService.add(no1, no2);
        publisher.publishEvent(new MathEvent(this, MathOperation.ADDITION, no1, no2, result));
        return result;
    }

    @RequestMapping("/subtract")
    public double subtraction(@RequestParam double no1, @RequestParam double no2) {
        double result = mathService.sub(no1, no2);
        publisher.publishEvent(new MathEvent(this, MathOperation.SUBTRACTION, no1, no2, result));
        return result;
    }

    @RequestMapping("/multiply")
    public double multiplication(@RequestParam double no1, @RequestParam double no2) {
        double result = mathService.multiply(no1, no2);
        publisher.publishEvent(new MathEvent(this, MathOperation.MULTIPLICATION, no1, no2, result));
        return result;
    }

    @RequestMapping("/divide")
    public double division(@RequestParam double no1, @RequestParam double no2) {
        double result = mathService.divide(no1, no2);
        publisher.publishEvent(new MathEvent(this, MathOperation.DIVISION, no1, no2, result));
        return result;
    }

    @Override
    public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) {
        this.publisher = applicationEventPublisher;
    }
}

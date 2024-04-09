package com.kodilla.beanlifecycle.events;

import org.springframework.context.ApplicationEvent;

public class MathEvent extends ApplicationEvent {

    private MathOperation operation;
    private double number1;
    private double number2;
    private double result;

    public MathEvent(Object source, MathOperation operation, double number1, double number2, double result) {
        super(source);
        this.operation = operation;
        this.number1 = number1;
        this.number2 = number2;
        this.result = result;
    }

    public MathOperation getOperation() {
        return operation;
    }

    public double getNumber1() {
        return number1;
    }

    public double getNumber2() {
        return number2;
    }

    public double getResult() {
        return result;
    }

    @Override
    public String toString() {
        return "MathEvent{" +
                "operation=" + operation +
                ", number1=" + number1 +
                ", number2=" + number2 +
                ", result=" + result +
                '}';
    }
}

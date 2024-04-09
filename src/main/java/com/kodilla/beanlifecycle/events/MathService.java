package com.kodilla.beanlifecycle.events;

import org.springframework.stereotype.Service;

@Service
public class MathService {

    public double add(double no1, double no2) {
        return no1 + no2;
    }

    public double sub(double no1, double no2) {
        return no1 - no2;
    }

    public double multiply(double no1, double no2) {
        return no1 * no2;
    }

    public double divide(double no1, double no2) {
        return no1 / no2;
    }
}

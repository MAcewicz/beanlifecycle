package com.kodilla.beanlifecycle.reflection;

import java.util.Random;

public class Student {

    private final String indexNumber;

    public Student(int z) {
        this.indexNumber = generateString(z);
    }

    public String generateString(int z) {

        return new Random().ints(97, 123)
                .limit(z)
                .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                .toString();
    }

}

package com.kodilla.beanlifecycle.reflection;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/v1/students")
public class StudentController {

    @GetMapping("/create")
    public Map<Integer, String> generateStudents(@RequestParam int n, @RequestParam  int z) throws NoSuchFieldException, IllegalAccessException {

        Map<Integer, String> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            Student student = new Student(z);
            Field index = Student.class.getDeclaredField("indexNumber");
            index.setAccessible(true);
            map.put(student.hashCode(), (String) index.get(student));
        }

        return map;
    }
}

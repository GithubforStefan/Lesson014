package Exercises;

import java.util.*;

public class Exercise2 {
    public static void main(String[] args) {
        HashMap<String, String> employees = new HashMap<>();
        employees.put("a1234", "Steve Jobs");
        employees.put("a1235", "Bill Gates");
        employees.put("a1236", "Jeff Bezos");
        employees.put("a1237", "Larry Page");
        employees.put("a1238", "Sergey Brin");
        employees.put("A1238", "So Brin");
        System.out.println(employees);
        employees.forEach(
                (key, value)-> System.out.println(employees.get(key.))
        );
    }

}

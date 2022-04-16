package ru.java2.lessons.lesson_3;

import java.util.Set;

public interface IPhoneBook {

    void add(String surname, String phoneNumber);

    Set<String> get(String surname);

    Set<String> getAllSurnames();
}

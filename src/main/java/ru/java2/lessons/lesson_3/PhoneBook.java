package ru.java2.lessons.lesson_3;

import java.util.*;

public class PhoneBook implements IPhoneBook {

    private final Map<String, Set<String>> phonesBySurname;

    public PhoneBook() {
        phonesBySurname = new TreeMap<>();
    }

    @Override
    public void add(String surname, String phoneNumber) {
        Set<String> phones = getPhones(surname);
        phones.add(phoneNumber);
    }

    private Set<String> getPhones(String surname) {
        Set<String> phones = phonesBySurname.getOrDefault(surname, new HashSet<>());
        if (phones.isEmpty()) {
            phonesBySurname.put(surname, phones);
        }

        return phones;

    }

    @Override
    public Set<String> get(String surname) {
        return getPhones(surname);
    }

    @Override
    public Set<String> getAllSurnames() {
        return phonesBySurname.keySet();
    }
}

package ru.java2.lessons.lesson_2;

import java.text.MessageFormat;

public class MyArrayDataException extends Exception {

    public MyArrayDataException(int column, int row) {
        super(MessageFormat.format("Неверные данные в ячейке: [{0}][{1}]", row, column));
    }
}

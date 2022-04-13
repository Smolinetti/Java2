package ru.java2.lessons.lesson_2.games.common;

import java.awt.*;

public interface Controller {
    void onDrawCanvas(GameCanvas c, Graphics g, float deltaTime);
}

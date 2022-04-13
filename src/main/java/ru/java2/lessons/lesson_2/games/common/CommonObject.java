package ru.java2.lessons.lesson_2.games.common;

import java.awt.*;

public abstract class CommonObject {
    public abstract void update(GameCanvas canvas, float deltaTime);
    public abstract void render(GameCanvas canvas, Graphics g);
}

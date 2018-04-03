package com.epam.lab.memento_pattern;

public class Saver {
    private final int health;
    private final int level;

    public Saver(int health, int level) {
        this.health = health;
        this.level = level;
    }

    public int getHealth() { return health; }
    public int getLevel() { return level; }
}

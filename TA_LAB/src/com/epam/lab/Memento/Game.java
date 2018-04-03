package com.epam.lab.memento_pattern;

public class Game {
    private int health;
    private int level;

    public Game(int health, int level) {
        this.health = health;
        this.level = level;
    }

    public void set(int health, int level) {
        this.health = health;
        this.level = level;
    }

    public void load(Saver saver) {
        health = saver.getHealth();
        level = saver.getLevel();
    }

    public Saver save() {
        return new Saver(health, level);
    }

    @Override
    public String toString() {
        return "Game{" +"health=" + health +", level=" + level +'}';
    }
}

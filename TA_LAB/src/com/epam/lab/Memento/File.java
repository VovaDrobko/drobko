package com.epam.lab.memento_pattern;

public class File {
    Saver save;

    public Saver getSave() { return save; }
    public void setSave(Saver save) { this.save = save; }
}

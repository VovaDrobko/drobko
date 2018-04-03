package com.epam.lab.memento_pattern;

public class Memento implements Command {
    public void execute() {
        Game game = new Game(3, 1);
        System.out.println(game);

        game.set(2, 2);
        System.out.println(game);

        System.out.println("--------------------------------------\nSave game!!!\n--------------------------------------");
        File file = new File();
        file.setSave(game.save());

        game.set(1, 2);
        System.out.println(game);

        game.set(0, 2);
        System.out.println(game);
        System.out.println("--------------------------------------\nGame over!!!\n--------------------------------------");

        System.out.println("--------------------------------------\nLoad game!!!\n--------------------------------------");
        game.load(file.getSave());
        System.out.println(game);
    }
}

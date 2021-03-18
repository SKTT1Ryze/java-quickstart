package main;
import generic.Game;
import generic.GameIterator;


public class helloworld {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        String faker = new String("sktt1 faker");
        System.out.println(faker);
        Game<String> game = new Game<String>(faker);
        assert(game.cookie() == 0);
        assert(game.name() == "League of Ledgends");
        System.out.printf("game name: %s\n", game.name());
        System.out.println(game.object_inner());

        GameIterator<String> iterator = game.iterator();
        iterator.push("Rust ");
        iterator.push("is ");
        iterator.push("better ");
        iterator.push("than ");
        iterator.push("java.\n");
        while(iterator.hasNext()) {
            System.out.print(iterator.next());
        }
    }
}
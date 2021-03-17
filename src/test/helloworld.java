package test;
import generic.Game;



public class helloworld {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        String faker = new String("sktt1 faker");
        System.out.println(faker);
        Game<String> game = new Game<String>(faker);
        assert(game.cookie() == 0);
        assert(game.name() == "League of Ledgends");
        System.out.printf("game name: %s\n", game.name());
        game.print_generic();
    }
}
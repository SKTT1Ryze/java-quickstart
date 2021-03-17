package generic;

/**
 * game
 * Java 类和范型测试
 */
public class Game<T> {
    /**
     * 数据成员定义
     */
    enum mode {
        EASY,
        MID,
        HARD
    };
    String name = new String("League of Ledgends");
    int cookie = 0;
    /**
     * 范型成员
     */
    T generic;

    /**
     * 方法成员定义
     */
    public Game(T generic) {
        this.generic = generic;
    }
    public Game(T generic, int cookie) {
        this.generic = generic;
        this.cookie = cookie;
    }
    public Game(T generic, String name, int cookie) {
        this.generic = generic;
        this.name = name;
        this.cookie = cookie;
    }
    public String name() {
        return this.name;
    }
    public int cookie() {
        return this.cookie;
    }
    public void print_generic() {
        System.out.println(this.generic);
    }
}
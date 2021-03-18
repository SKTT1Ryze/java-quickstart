package generic;

import java.util.ArrayList;

/**
 * game
 * Java 类和范型测试
 */
public class Game<T extends java.lang.constant.Constable> {
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
     * 泛型成员
     */
    TObject<T> object;
    GameIterator<T> iterator = new GameIterator<T>(new ArrayList<T>());
    /**
     * 方法成员定义
     */
    public Game(T inner) {
        this.object = new TObject<T>(inner);
    }
    public Game(T inner, int cookie) {
        this.object.set_inner(inner);
        this.cookie = cookie;
    }
    public Game(T inner, String name, int cookie) {
        this.object.set_inner(inner);
        this.name = name;
        this.cookie = cookie;
    }
    public String name() {
        return this.name;
    }
    public int cookie() {
        return this.cookie;
    }
    public T object_inner() {
        return this.object.inner;
    }
    public GameIterator<T> iterator() {
        return this.iterator;
    }
}

class TObject<O> implements GameObject<O>{
    public O inner;
    public TObject(O inner) {
        this.inner = inner;
    }
    public void translate() {}
    public void set_inner(O inner) {
        this.inner = inner;
    }
    public O inner() {
        return this.inner;
    }
}
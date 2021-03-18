package generic;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * 自定义迭代器
 */

public class GameIterator<I> implements Iterator<I> {
    ArrayList<I> array;
    int max_size = 0;
    int pos = 0;
    public GameIterator(ArrayList<I> array) {
        this.array = array;
    }
    public boolean hasNext() {
        return !(this.pos == this.max_size);
    }
    public I next() {
        pos += 1;
        return this.array.get(pos - 1);
    }
    public void remove() {
        
    }
    public void forEachRemaining(java.util.function.Consumer<? super I> action) {
        
    }
    public void push(I item) {
        array.add(item);
        max_size += 1;
    }
}
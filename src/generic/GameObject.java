package generic;

/**
 * 泛型接口定义
 */
public interface GameObject<I> {
    public void translate();
    public void set_inner(I inner);
    public I inner();
}
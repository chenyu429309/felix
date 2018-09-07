package guancahzhe;

/**
 * 作者 : Felix
 * 创建时间 : 2018-09-07 15:34
 */
public interface Observer<T extends Subject> {
    public void update(T t);
}

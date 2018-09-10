package adapter;

/**
 * 作者 : Felix
 * 创建时间 : 2018-09-10 17:50
 */
public class ComTarget implements Target {
    @Override
    public void sampleOperation1() {
        System.out.println("123");
    }

    @Override
    public void sampleOperation2() {
        System.out.println("456");
    }
}

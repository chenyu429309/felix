package adapter;

/**
 * 作者 : Felix
 * 创建时间 : 2018-09-10 17:48
 */
public class Test {
    public static void main(String[] args) {
        Target target=new Adapter();
        target.sampleOperation2();
        target=new ComTarget();
        target.sampleOperation2();
    }
}

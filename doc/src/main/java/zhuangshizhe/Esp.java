package zhuangshizhe;

/**
 * 作者 : Felix
 * 创建时间 : 2018-09-07 17:09
 */
public class Esp extends Beverage {
    public Esp() {
        description = "Esp";
    }

    @Override
    public double cost() {
        return 0.99;
    }
}

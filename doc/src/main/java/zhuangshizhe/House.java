package zhuangshizhe;

/**
 * 作者 : Felix
 * 创建时间 : 2018-09-07 17:12
 */
public class House extends Beverage {
    public House() {
        description = "House";
    }

    @Override
    public double cost() {
        return 0.88;
    }
}

package zhuangshizhe;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 作者 : Felix
 * 创建时间 : 2018-09-07 17:12
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Mocha extends CDecorator {

    Beverage beverage;

    @Override
    public String getDesc() {
        return beverage.getDescription() + ", Mocha";
    }

    @Override
    public double cost() {
        return 20 + beverage.cost();
    }
}

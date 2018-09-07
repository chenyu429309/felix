package zhuangshizhe;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 作者 : Felix
 * 创建时间 : 2018-09-07 16:58
 */
@AllArgsConstructor
@Data
@NoArgsConstructor
public abstract class Beverage {
    public String description;

    public abstract double cost();
}

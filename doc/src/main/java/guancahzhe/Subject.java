package guancahzhe;

import com.google.common.collect.Lists;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.checkerframework.checker.units.qual.A;

import java.util.List;

/**
 * 作者 : Felix
 * 创建时间 : 2018-09-07 15:33
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public abstract class Subject {
    private List<Observer> list = Lists.newArrayList();


    private String status;

    /**
     * 注册观察者
     *
     * @param observer
     */
    public void attch(Observer observer) {
        list.add(observer);
    }

    public void remove(Observer observer) {
        list.remove(observer);
    }

    public void nodifyAll() {
        list.parallelStream().forEach(s -> s.update(this));
    }

}

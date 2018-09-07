package guancahzhe;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Objects;
import java.util.Optional;

/**
 * 作者 : Felix
 * 创建时间 : 2018-09-07 15:35
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CObserver<T extends  Subject> implements Observer {


    private String status;

    public CObserver(T t) {
        t.attch(this);
    }

    @Override
    public void update(Subject subject) {
        if(Objects.equals(subject.getStatus(),"123")){
            System.out.println(subject.getStatus());
        }
    }
}

package guancahzhe;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 作者 : Felix
 * 创建时间 : 2018-09-07 16:36
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class TowTuple<A extends Subject,B extends Observer> {
    private A a;
    private B b;

    public <A> void get(A a){

    }

    public TowTuple gets(Class<? extends A> a){
        return null;
    }

    public A set(){
       return null;
    }

    @Override
    public String toString() {
        return "TowTuple{" +
                "a=" + a +
                ", b=" + b +
                '}';
    }
}

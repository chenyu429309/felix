package guancahzhe;

/**
 * 作者 : Felix
 * 创建时间 : 2018-09-07 15:45
 */
public class Test {
    public static void main(String[] args) {
        CSubject subject=new CSubject();
        CObserver observer=new CObserver(subject);
        subject.change("123");

        TowTuple a=new TowTuple(subject,observer);
        System.out.println( a.toString());
    }
}

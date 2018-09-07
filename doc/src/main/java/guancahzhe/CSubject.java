package guancahzhe;

/**
 * 作者 : Felix
 * 创建时间 : 2018-09-07 15:44
 */
public class CSubject extends Subject {
    public void change(String status) {
        this.setStatus(status);
        this.nodifyAll();
    }
}

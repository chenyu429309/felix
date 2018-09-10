package lishitihuan;

/**
 * 作者 : Felix
 * 创建时间 : 2018-09-10 15:32
 */
public class Test {
    public static void main(String[] args) {

        Father father = new Father();
        System.out.println(father.test(1.1, 2.3));
        father = new FatherImpl();
        System.out.println(father.test(1.1, 2.3));
    }
}

package javaclass_08_01_19;

import static javaclass_08_01_19.StaticNonStaticEx.y;

public class StaticNonStaticExTest {

    public static void main(String[] args) {
        StaticNonStaticEx obj2 = new StaticNonStaticEx();
        System.out.println(StaticNonStaticEx.y);
        System.out.println(obj2.x);

    }
    private int x;

    public int makeSum(int bonus) {
        int sum = x + y + bonus;
        return sum;
    }

}

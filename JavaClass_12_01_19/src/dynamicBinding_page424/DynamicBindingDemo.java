package dynamicBinding_page424;

public class DynamicBindingDemo {

    public static void main(String[] args) {
        m(new GraduateStudent());
        m(new Student());
        m(new Person());
        m(new Object());
    }

    public static void m(Object o) {
        System.out.println(o.toString());
    }
}

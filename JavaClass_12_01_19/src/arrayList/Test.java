package arrayList;

import java.util.ArrayList;
import java.util.List;

public class Test {

    public static void main(String[] args) {
        List<Student> list = new ArrayList();
        Student s1 = new Student(100, "Shuvo", 20);
        Student s2 = new Student(102, "Minhaz", 30);
        Student s3 = new Student(103, "Shetu", 40);
        list.add(s1);
        list.add(s2);
        list.add(s3);
        list.add(new Student(101, "Rony", 10));
    }
}

package javaclass_14_01_19;

import java.util.ArrayList;
import java.util.List;

public class Test {

    public static void main(String[] args) {
        List li = new ArrayList();
        li.add(new Student(1246972, "Asaduzzaman", "01684627575", "rony01674@gmail.com"));
        System.out.println(li);

        List<Student> list = new ArrayList();
        list.add(new Student(1246972, "Asaduzzaman", "01684627575", "rony01674@gmail.com"));
        System.out.println("Size: "+list.size());
        
        for(Student s : list){
            System.out.println(s.getId()+", "+s.getName()+", "+s.getMobileNo()+", "+s.getEmail());
            System.out.println(s);
        }

    }
}

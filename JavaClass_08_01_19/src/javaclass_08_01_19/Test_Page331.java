package javaclass_08_01_19;

public class Test_Page331 {

    public static void main(String[] args) {
        Student student1 = new Student();
        student1.setName("Rony");
        student1.setAge(27);
        student1.setIsScienceMajor(true);
        student1.setGender('m');

        System.out.println("=========Way 1===========");

        System.out.println("name?" + student1.name);
        System.out.println("age?" + student1.age);
        System.out.println("isScienceMajor?" + student1.isScienceMajor);
        System.out.println("gender?" + student1.gender);

        System.out.println("=========Way 2===========");

        Student student2 = new Student();
        student2.name = "Asaduzzaman";
        student2.age = 26;
        student2.isScienceMajor = true;
        student2.gender = 'M';

        System.out.println("name?" + student2.name);
        System.out.println("age?" + student2.age);
        System.out.println("isScienceMajor?" + student2.isScienceMajor);
        System.out.println("gender?" + student2.gender);

        System.out.println("=========Way 3===========");

        Student student3 = new Student("Asad", 26, true, 'M');

        System.out.println("name?" + student3.name);
        System.out.println("age?" + student3.age);
        System.out.println("isScienceMajor?" + student3.isScienceMajor);
        System.out.println("gender?" + student3.gender);

        System.out.println("=========way 4===========");

        Student2 student4 = new Student2("Nafia", 23, false, 'f');

        System.out.println("name?" + student4.getName());
        System.out.println("age?" + student4.getAge());
        System.out.println("isScienceMajor?" + student4.isIsScienceMajor());
        System.out.println("gender?" + student4.getGender());
    }
}

package week1;

public class StudentManagement {

    // TODO: khai báo thu?c tính students là array ch?a các ??i t??ng thu?c l?p Student (max. 100)

    public boolean sameGroup(Student s1, Student s2) {
        String t1 = s1.getGroup();
        String t2 = s2.getGroup();

        return t1.equals(t2);

    }

    void studentsByGroup() {
        // TODO:
    }

    void removeStudent(String id) {
        // TODO:
    }

    public static void main(String[] args) {
        // TODO:
        Student p = new Student();
        Student p1 = new Student();

        p1.setName("Nguyen Lan Huong");
        p1.setId("17020820");
        p1.setGroup("IE4K62");
        p1.setEmail("nguyenlanhuong@gmail.com");

        System.out.println(p1.getName());
        System.out.println(p1.getInfo());

        Student q1 = new Student();
        System.out.println(q1.getInfo());

        Student q2 = new Student("Nguyen Lan Huong","17020820","lanhuong@gmail.com");
        System.out.println(q2.getInfo());


        Student q3 = new Student(q2);
        System.out.println(q3.getInfo());

        Student sv1 =new Student();
        sv1.setGroup("INT22041");
        Student sv2 =new Student();
        sv2.setGroup("INT22041");
        Student sv3 =new Student();
        sv3.setGroup("INT22042");

        StudentManagement m = new StudentManagement();
        System.out.println(m.sameGroup(sv1,sv2));
        System.out.println(m.sameGroup(sv1,sv3));



    }
}

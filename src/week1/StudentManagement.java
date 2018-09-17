package week1;

public class StudentManagement {
    public static Student[] array = new Student[100];

    // TODO: khai báo thu?c tính students là array ch?a các ??i t??ng thu?c l?p Student (max. 100)

    public boolean sameGroup(Student s1, Student s2) {
        String t1 = s1.getGroup();
        String t2 = s2.getGroup();

        return t1.equals(t2);

    }

    void studentsByGroup() {
        // TODO:
        int dem = array.length;
        System.out.println("Danh sach sinh vien lop INT22041:");
        for (int i = 0 ; i < dem; i++) {
            if (array[i].getGroup() == "INT22041") {
                System.out.println(array[i].getInfo());
            }
        }

         System.out.println("Danh sach sinh vien lop INT22042:");
            for (int i = 0 ; i < dem ; i++) {
                if (array[i].getGroup() == "INT20042") {
                    System.out.println(array[i].getInfo());
                }
            }


    }

    void removeStudent(String id) {
        // TODO:
        int dem = array.length;
        int i;
        for ( i = 0 ; i < dem ; i++){
            if(array[i].getId().equals(id)){
                break;
            }
        }
        for (int j = i ; j < dem - 1 ; j++){
            array[j] = array[j+1];
        }
        dem--;
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
        sv1.setName("Nguyen Huong");
        sv1.setId("17020820");
        Student sv2 =new Student();
        sv2.setGroup("INT22041");
        sv2.setName("Nguyen Lan");
        sv2.setId("17020346");
        Student sv3 =new Student();
        sv3.setGroup("INT22042");
        sv3.setName("Nguyen Hang");
        sv3.setId("17020930");

        StudentManagement m = new StudentManagement();
        System.out.println(m.sameGroup(sv1,sv2));
        System.out.println(m.sameGroup(sv1,sv3));

        array[0] = sv1;
        array[1] = sv2;
        array[2] = sv3;
        

        m.removeStudent("17020820");
        for (int i = 0 ; i < array.length ; i++)
            System.out.println(array[i].getName());





    }
}

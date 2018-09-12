package week1;

public class StudentManagement {

    // TODO: khai báo thuộc tính students là array chứa các đối tượng thuộc lớp Student (max. 100)

    public boolean sameGroup(Student s1, Student s2) {
        // TODO:
        return false; // xóa dòng này sau khi cài đặt
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


    }
}

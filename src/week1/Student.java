package week1;

public class Student {

    // TODO: khai báo các thuộc tính cho Student
    private String id;
    private String name;
    private String group;
    private String email;

    // TODO: khai báo các phương thức getter, setter cho Student
    
      public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    /**
     * Constructor 1
     */
    public Student() {
        // TODO:

        id = "000";
        name = "Student";
        group = "INT22041";
        email = "uet@vnu.edu.vn";

    }

    /**
     * Constructor 2
     * @param n
     * @param sid
     * @param em
     */
    Student(String n, String sid, String em) {
        // TODO:

       name = n;
        id = sid;
        email = em;
        group = "INT22041";

    }

    /**
     * Constructor 3
     * @param s
     */
    Student(Student s) {
        // TODO:

      name = s.name;
        id = s.id;
        group = s.group;
        email = s.email;

    }

    String getInfo() {
        // TODO:

       return ("\n"+name+"\n"+id+"\n"+group+"\n"+email);
 

    }
}



public class Student extends Person{
    public static int studentId = 0;
    private String name;
    private int age;
    private int cin;
    private String field;

    public Student(String name, int age, int cin, String field) {
        super(name,age);
        this.cin = cin;
        this.field = field;
        studentId++;
    }

    public static int getStudentId() {return studentId;}

    public static void setStudentId(int studentId) {Student.studentId = studentId;}

    public String getName() {return name;}

    public void setName(String name) {this.name = name;}

    public int getAge() {return age;}

    public void setAge(int age) {this.age = age;}

    public int getCin() {return cin;}

    public void setCin(int cin) {this.cin = cin;}

    public String getField() {return field;}

    public void setField(String field) {this.field = field;}

    @Override
    public String toString() {
        return "Student [studentId =" + studentId +",name=" + name + ", age=" + age + ", cin=" + cin + ", field=" + field + "]";
    }

    

}

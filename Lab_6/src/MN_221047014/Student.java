package MN_221047014;

public class Student {
    private  int StudentId;
    private  String Studentname;
    private  int age;
    public Student(int studentId, String name, int age) {
        StudentId = studentId;
        this.Studentname = name;
        this.age = age;
    }
    public int getStudentId() {
        return StudentId;
    }
    public String getName() {
        return Studentname;
    }
    public int getAge() {
        return age;
    }
    public String toString(){
        return  StudentId+" "+ Studentname +" "+ age;
    }
}

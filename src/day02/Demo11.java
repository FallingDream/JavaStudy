package day02;
@SuppressWarnings("all")
public class Demo11 {
    public static void main(String[] args) {
        Teacher teacher = new Teacher();
        Student student = new Student();
        teacher.test(student);
    }
}
@SuppressWarnings("all")
class Teacher{
    public void test(Student student){

        student.study();
    }
}

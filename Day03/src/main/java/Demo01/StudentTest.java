package Demo01;

public class StudentTest {
    public static void main(String[] args) {
        Student s = new Student();
        s.setSex(Gender.男);
        System.out.println(s.toString());
    }
}

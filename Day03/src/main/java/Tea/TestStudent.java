package Tea;

public class TestStudent {
    public static void main(String[] args) {
        Student student = new Student();
        student.setSex(Gender.男);
        System.out.println(student.toString());
    }

}

package Demo01;

public class Student {
    private Gender sex;

    public Student() {
    }

    public Student(Gender sex) {
        this.sex = sex;
    }

    public Gender getSex() {
        return sex;
    }

    public void setSex(Gender sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "Student{" +
                "sex='" + sex + '\'' +
                '}';
    }
}

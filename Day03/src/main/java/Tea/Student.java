package Tea;

/*
*  枚举：
*       可能出现的结果一一列举
*  语法：
*       新建一个Enum  ,在里面将可能出现的值列出来，使用的时候使用枚举类点的方法调出属性
*
*
* */
public class Student {
    private Gender sex;

    public Gender getSex() {
        return sex;
    }

    public void setSex(Gender sex) {
        this.sex = sex;
    }

    public Student() {
    }

    public Student(Gender sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "Student{" +
                "sex='" + sex + '\'' +
                '}';
    }
}

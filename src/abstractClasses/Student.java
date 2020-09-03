package abstractClasses;

/**
 * @ClassName:Student
 * @Description:
 * @Author: liuanhai
 * @Date 2020/7/23 0023
 * @Version 1.0
 */
public class Student extends Person{
    private String major;

    public Student(String name, String major){
        super(name);
        this.major = major;
    }

    public String getMajor() {
        return major;
    }

    @Override
    public String getDescription() {
        return "a student majoring in " + major;
    }
}

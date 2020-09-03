package abstractClasses;

/**
 * @ClassName:Person
 * @Description:
 * @Author: liuanhai
 * @Date 2020/7/23 0023
 * @Version 1.0
 */
public abstract class Person {
    public abstract String getDescription();
    private String name;

    public Person(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

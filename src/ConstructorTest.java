import java.util.*;

public class ConstructorTest {
    public static void main(String[] args){
        Employee_2[] staff = new Employee_2[3];
        staff[0] = new Employee_2("Harry", 40000);
        staff[1] = new Employee_2(60000);
        staff[2] = new Employee_2();

        for (Employee_2 e : staff)
            System.out.println("Name=" + e.getName() + ", id=" + e.getId() + ", salary=" + e.getSalary());
    }
}

class Employee_2{
    private static int nextId;

    private int id;
    private String name = "";
    private double salary;
    // static initialization block
    static {
        Random generator = new Random();
        nextId = generator.nextInt(10000);
    }

    // object initialization block
    {
        id = nextId;
        nextId++;
    }

    // three overloaded constructors
    public Employee_2(String aName, double aSalary){
        name = aName;
        salary = aSalary;
    }

    public Employee_2(double aSalary){
        // calls the Employee(String, double)constructor
        this("Employee_2 #" + nextId, aSalary);
    }

    // The default constructor
    public Employee_2(){
        // name initialized to ""
        // salary not explicitly set --- initialized to 0
        // id initialized in initialization block
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public int getId() {
        return id;
    }
}

public class StaticTest {
    public static void main(String[] args){
        Employee[] staff = new Employee[3];
        staff[0] = new Employee("Tom", 40000);
        staff[1] = new Employee("Dick", 60000);
        staff[2] = new Employee("Harry", 65000);

        for (Employee e : staff)
        {
            e.setID();
            System.out.println("name=" + e.getName() + ", id=" + e.getID() + ",salary=" + e.getSalary() );
        }
        int n = Employee.getNextId();
        System.out.println("Next available id= " + n);
}
}


class Employee{
    private static int nextID = 1;
    private String name;
    private Double salary;
    private int id;

    public Employee(String n, double s){
        name = n;
        salary = s;
        id = 0;
    }


    public String getName(){
        return name;
    }

    public  double getSalary(){
        return salary;
    }

    public int getID(){
        return id;
    }

    public void setID(){
        id = nextID;
        nextID++;
    }

    public static int getNextId(){
       return nextID;
    }

    public static void main(String[] args){
        Employee e = new Employee("Harry", 50000);
        System.out.println(e.getName()+" "+ e.getSalary());

    }
}
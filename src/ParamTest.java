public class ParamTest {
    public static void main(String[] args){
        /*
         *Test1: Methods can't modify numeric parameters.
         */
        System.out.println("Testing tripleValue:");
        double percent = 10;
        System.out.println("Before: percent=" + percent);
        tripleValue(percent);
        System.out.println("After: percent=" + percent);

        /*
         *Test2: Methods can change the state of object parameters.
         */
        System.out.println("\nTesting TripleSalary:");
        Employee_1 harry = new Employee_1("Harry", 50000);
        System.out.println("Before: Salary=" + harry.getSalary());
        tripleSalary(harry);
        System.out.println("After: Salary=" + harry.getSalary());

        /*
         *Test3: Methods can't attach new objects to object parameters.
         */
        System.out.println("\nTesting swap:");
        Employee_1 a = new Employee_1("Alice", 70000);
        Employee_1 b = new Employee_1("Bob", 60000);
        System.out.println("Before: a=" + a.getSalary());
        System.out.println("Before: b=" + b.getSalary());
        swap(a, b);

        System.out.println("After: a=" + a.getSalary());
        System.out.println("After: b=" + b.getSalary());
    }

    public static void tripleValue(double x){
        x=x*3;
        System.out.println("End of Method: x=" +x);
    }

    public static void tripleSalary(Employee_1 x){
        x.raiseSalary(200);
        System.out.println("End of method: salary=" + x.getSalary());
    }

    public static void swap(Employee_1 x, Employee_1 y){
        Employee_1 temp = x;
        x = y;
        y = temp;
        System.out.println("End of Method: x=" + x.getName());
        System.out.println("End of Method: y=" + y.getName());
    }
}


class Employee_1{
    private String name;
    private double salary;

    public Employee_1(String n, double s){
       name = n;
       salary = s;
   }

    public String getName(){
       return name;
   }

    public double getSalary() {
        return salary;
    }

    public void raiseSalary(double byPercent){
        double raise = salary * byPercent / 100;
        salary += raise;
    }
}
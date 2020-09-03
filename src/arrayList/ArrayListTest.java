package arrayList;

import inheritance.Employee;

import java.util.ArrayList;

/**
 * @ClassName:ArrayListTest
 * @Description:
 * @Author: liuanhai
 * @Date 2020/7/23 0023
 * @Version 1.0
 */
public class ArrayListTest {
    public static void main(String[] args){
        ArrayList<Employee> staff = new ArrayList<>();
        staff.add(new Employee("Carl Cracker", 75000, 1987, 12, 15));
        staff.add(new Employee("Harry Hacker", 50000, 1991, 12, 02 ));
        staff.add(new Employee("Tony Tester", 40000, 1992, 9,26));

        for (Employee e : staff)
            e.raiseSalary(5);

        for (Employee e : staff)
            System.out.println("name=" + e.getName() + ", salary=" + e.getSalary() + ", hireDay=" + e.getHireDay());

    }
}

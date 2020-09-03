package map;

//import abstractClasses.Employee;


import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 * @ClassName:MapTest
 * @Description:
 * @Author: liuanhai
 * @Date 2020/8/25 0025
 * @Version 1.0
 */
public class MapTest {
    public static void main(String[] args){
        Map<String, Employee>staff = new HashMap<>();
//        Map<String, String> test = new TreeMap<>()
        staff.put("144-25-5464", new Employee("Amy Lee"));
        staff.put("567-24-2546", new Employee("Harry Hacker"));
        staff.put("157-62-7935", new Employee("Gary Cooper"));
        staff.put("456-62-5527", new Employee("Francesca Cruz"));

        System.out.println(staff);

        // remove
        staff.remove("567-24-2546");

        // replace
        staff.put("456-62-5527", new Employee("Francesca Miller"));

        System.out.println(staff.get("157-62-7935"));

        staff.forEach((k, v) -> System.out.println("Key=" + k + ", Value=" + v));
    }
}

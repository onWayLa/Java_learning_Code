package lambda;
import java.util.*;
import javax.swing.*;
import javax.swing.Timer;

/**
 * @ClassName:LambdaTest
 * @Description: This program demonstrates the use of lambda expressions.
 * @Author: liuanhai
 * @Date 2020/8/5 0005
 * @Version 1.0
 */
public class LambdaTest {
    public static void main(String[] args){
        String[] planets = new String[]{"Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune"};
        System.out.println(Arrays.toString(planets));
        System.out.println("Sorted in dictionary order:");
        Arrays.sort(planets);
        System.out.println(Arrays.toString(planets));
        System.out.println("Sorted by length:");
        Arrays.sort(planets, (first, second) -> first.length() - second.length());
        System.out.println(Arrays.toString(planets));

        Timer t = new Timer(10000, event -> System.out.println("This time is " + new Date()));
        t.start();

        // Keep program running until user selects "OK"
        JOptionPane.showMessageDialog(null, "Quit program?");
        System.exit(0);
    }


}

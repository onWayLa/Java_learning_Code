package enums;
//import com.sun.glass.ui.Size;

import java.util.*;
/**
 * @ClassName:EnumTest
 * @Description:
 * @Author: liuanhai
 * @Date 2020/7/24 0024
 * @Version 1.0
 */
public class EnumTest {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a size:(SMALL, MEDIUM, LARGE, EXTRA_LARGE)");
        String input = in.next().toUpperCase();
        Size size = Enum.valueOf(Size.class, input);
        System.out.println("size=" + size);
        System.out.println("abbreviation=" + size. getAbbreviation( ));
        if (size == Size.EXTRA_LARGE)
            System.out.println("Good job -- you paid attention to the _.");
    }
}

enum Size{
    SMALL("S"), MEDIUM("M"), LARGE("L"), EXTRA_LARGE("XL");
    private Size(String abbreviation){this.abbreviation = abbreviation;}
    private String abbreviation;

    public String getAbbreviation() {
        return abbreviation;
    }
}

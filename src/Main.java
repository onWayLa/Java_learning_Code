//import java.util.Scanner;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException
    {
////        System.out.println("Hello World!");
//        Scanner in = new Scanner(System.in);
//        System.out.println("What's your name?");
//        String name = in.nextLine();
//        System.out.println("How old are you?");
//        int age = in.nextInt();
//        System.out.println("Hello, " + name + ". Next year, you'will be " + (age + 1));
////        String firstName = in.next();
//        Scanner in_1 = new Scanner(Paths.get("myfile.txt"), "UTF-8");
        // read input
        Scanner in = new Scanner(System.in);

        System.out.print("How much money do you need to retire?");
        double goal = in.nextDouble();
        System.out.print("How much money will you contribute every year?");
        double payment = in.nextDouble();

        System.out.print("Interest rate in %: ");
        double interestRate = in.nextDouble();


        double balance = 0;
        int years = 0;

        while (balance < goal){
            balance += payment;
            double interest = balance * interestRate / 100;
            balance += interest;
            years++;
        }

        System.out.println("You can retired in " + years + " years.");
    }

}

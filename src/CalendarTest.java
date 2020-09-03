import java.time.*;


public class CalendarTest {

    public static void main(String[] args){
        LocalDate date = LocalDate.now();
        int month = date.getMonthValue();
        int today = date.getDayOfMonth();
//        System.out.println(today);

        date = date.minusDays(today - 1 );
        DayOfWeek weekday = date.getDayOfWeek();
        int value = weekday.getValue();
//        System.out.println(value);

        System.out.println("Mon Tue Wed Thu Fri Sat Sun");
        for (int i=0; i<value - 1 ; i++)
            System.out.print("    ");
        while (date.getMonthValue() == month)
        {
            System.out.printf("%3d", date.getDayOfMonth());
            if (date.getDayOfMonth() == today)
                System.out.print("*");
            else
                System.out.print(" ");
            date = date.plusDays(1);
            if (date.getDayOfWeek().getValue() == 1) System.out.println();
        }
        if (date.getDayOfWeek().getValue() != 1) System.out.println();
    }
}

package regular;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @ClassName:RegexMatches
 * @Description:
 * @Author: liuanhai
 * @Date 2020/8/10 0010
 * @Version 1.0
 */
public class RegexMatches {
    public static void main(String args[]){

        String mac_f0 = "112233gh445566".replaceAll("(.{2})", "$1-").replaceFirst(".$","");
        System.out.println(mac_f0);
        if(Pattern.compile("^([0-9A-Fa-f]{2}[:-]){5}([0-9A-Fa-f]{2})$").matcher(mac_f0).find()){
            System.out.println("The result is right");
        } else {
            System.out.println("Wrong");
        }
        String line = "This order was placed for QT3000！ OK?";
        String pattern = "(\\D*)(\\d+)(.*)";

        Pattern r = Pattern.compile(pattern);

        Matcher m = r.matcher(line);
        if (m.find()){
            System.out.println("Found value: " + m.group(0));
            System.out.println("Found value: " + m.group(1));
            System.out.println("Found value: " + m.group(2));
            System.out.println("Found value: " + m.group(3));
        }
        else {
            System.out.println("NO MATCH");
        }
    }

}

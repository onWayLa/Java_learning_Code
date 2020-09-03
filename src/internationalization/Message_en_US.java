package internationalization;

import java.util.ListResourceBundle;

/**
 * @ClassName:Message_en_US
 * @Description:
 * @Author: liuanhai
 * @Date 2020/8/5 0005
 * @Version 1.0
 */
public class Message_en_US extends ListResourceBundle {
    private final Object mydata[][] = {{ "hello", "hello！" },{ "greetting", "Love you . {0}" }};

    @Override
    protected Object[][] getContents(){
        return mydata;
    }
}



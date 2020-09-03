package anonymouslnneClass;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;
import java.util.*;

/**
 * @ClassName:AnonymouslnneClassTest
 * @Description:
 * @Author: liuanhai
 * @Date 2020/8/6 0006
 * @Version 1.0
 */
public class AnonymouslnneClassTest {
    public static void main(String[] args){
        TalkingClock clock = new TalkingClock();
        clock.start(10000, true);

        JOptionPane.showMessageDialog(null, "Quit Program!");
        System.exit(0);
    }
}

class TalkingClock{
    public void start(int interval, boolean beep){
        ActionListener listener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event) {
                System.out.println("At the tone, the time is " + new Date());
                if (beep) Toolkit.getDefaultToolkit().beep();
            }
        };
       Timer t = new Timer(interval, listener);
        t.start();
    }

}

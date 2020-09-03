//package timer;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;
import javax.swing.Timer;

/**
 * @ClassName:TimerTest
 * @Description:
 * @Author: liuanhai
 * @Date 2020/8/4 0004
 * @Version 1.0
 */
public class TimerTest {
    public static void main(String[] args) {
        ActionListener listener = new TimerPrinter();
        Timer t = new Timer(10000, listener);
        t.start();
        JOptionPane.showMessageDialog(null, "Quit Program?");
        System.exit(0);
    }
}


class TimerPrinter implements ActionListener{
    public void actionPerformed ( ActionEvent event ){
        System.out.println("At the tone, the time is " + new Date());
        Toolkit.getDefaultToolkit().beep();
    }

}



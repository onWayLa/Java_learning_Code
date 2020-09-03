package plaf;

import javax.swing.*;
import java.awt.*;

/**
 * @ClassName:PlafFrameTest
 * @Description:
 * @Author: liuanhai
 * @Date 2020/9/1 0001
 * @Version 1.0
 */
public class PlafFrameTest {
    public static void main(String[] args){
        EventQueue.invokeLater(()->{
            JFrame frame = new  PlafFrame();
            frame.setTitle("PlafFrameTest");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setVisible(true);
        });
    }
}

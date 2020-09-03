package action;

import javax.swing.*;
import java.awt.*;

/**
 * @ClassName:ActionFrameTest
 * @Description:
 * @Author: liuanhai
 * @Date 2020/9/1 0001
 * @Version 1.0
 */
public class ActionFrameTest {
    public static void main(String[] args){
        EventQueue.invokeLater(()->{
            JFrame frame = new ActionFrame();
            frame.setTitle("ActionFrameTest");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setVisible(true);
        });
    }
}

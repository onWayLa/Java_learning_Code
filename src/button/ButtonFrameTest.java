package button;

import javax.swing.*;
import java.awt.*;

/**
 * @ClassName:ButtonFrameTest
 * @Description:
 * @Author: liuanhai
 * @Date 2020/9/1 0001
 * @Version 1.0
 */
public class ButtonFrameTest {
    public static void main(String[] args){
        EventQueue.invokeLater(()->{
            JFrame frame = new ButtonFrame();
            frame.setTitle("ButtonFrameTest");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setVisible(true);
        });
    }
}

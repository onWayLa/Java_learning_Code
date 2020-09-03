package mouse;

import javax.swing.*;

/**
 * @ClassName:MouseFrameTest
 * @Description:
 * @Author: liuanhai
 * @Date 2020/9/1 0001
 * @Version 1.0
 */
public class MouseFrameTest {
    public static void main(String[] args){
        JFrame frame = new MouseFrame();
        frame.setTitle("MouseFrameTest");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}

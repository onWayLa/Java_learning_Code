package border;

import javax.swing.*;

/**
 * @ClassName:BorderFrameTest
 * @Description:
 * @Author: liuanhai
 * @Date 2020/9/3 0003
 * @Version 1.0
 */
public class BorderFrameTest {
    public static void main(String[] args){
        JFrame frame = new BorderFrame();
        frame.setTitle("BorderFrameTest");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}

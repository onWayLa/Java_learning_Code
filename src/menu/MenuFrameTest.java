package menu;

import javax.swing.*;

/**
 * @ClassName:MenuFrameTest
 * @Description:
 * @Author: liuanhai
 * @Date 2020/9/3 0003
 * @Version 1.0
 */
public class MenuFrameTest {
    public static void main(String[] args){
        JFrame frame = new MenuFrame();
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setTitle("MenuFrameTest");
        frame.setVisible(true);
    }
}

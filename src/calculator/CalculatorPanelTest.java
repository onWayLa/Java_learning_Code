package calculator;

import javax.swing.*;

/**
 * @ClassName:CalculatorPanelTest
 * @Description:
 * @Author: liuanhai
 * @Date 2020/9/2 0002
 * @Version 1.0
 */
public class CalculatorPanelTest {
    public static void main(String[] args){
        JFrame frame = new JFrame();
        frame.setSize(250, 250);
        frame.add(new CalculatorPanel());
        frame.setTitle("CalculatorPanelTest");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}

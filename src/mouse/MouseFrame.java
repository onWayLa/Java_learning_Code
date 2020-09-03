package mouse;

import javax.swing.*;

/**
 * @ClassName:MouseFrame
 * @Description:
 * @Author: liuanhai
 * @Date 2020/9/1 0001
 * @Version 1.0
 */
public class MouseFrame extends JFrame {
    public MouseFrame(){
        add(new MouseComponent());
        pack();
    }
}

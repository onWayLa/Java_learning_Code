package notHelloWorld;

import javax.swing.*;
import java.awt.*;

/**
 * @ClassName:NotHelloWorld
 * @Description:
 * @Author: liuanhai
 * @Date 2020/8/31 0031
 * @Version 1.0
 */
public class NotHelloWorld {
    public static void main(String[] args){
        EventQueue.invokeLater(()->{
            JFrame frame = new NotHelloWorldFrame();
            frame.setTitle("NotHelloWorld");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setVisible(true);
        });
    }
}

class NotHelloWorldFrame extends JFrame{
    public NotHelloWorldFrame(){
        add(new NotHelloWorldComponent());
        pack();
    }
}

class NotHelloWorldComponent extends JComponent{
    public static final int MESSAGE_X = 75;
    public static final int MESSAGE_Y = 100;

    private static final int DEFAULT_WIDTH = 300;
    private static final int DEFAULT_HEIGT = 200;

    @Override
    protected void paintComponent(Graphics g) {
//        super.paintComponent(g);
        g.drawString("Not a Hello, World program", MESSAGE_X, MESSAGE_Y);
    }

    @Override
    public Dimension getPreferredSize() {
        return new Dimension(DEFAULT_WIDTH, DEFAULT_HEIGT);
    }
}

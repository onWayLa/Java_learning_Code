package toolBar;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

/**
 * @ClassName:ToolBarFrame
 * @Description:
 * @Author: liuanhai
 * @Date 2020/9/4 0004
 * @Version 1.0
 */
public class ToolBarFrame extends JFrame {
    private static final int DEFAULT_WIDTH = 300;
    private static final int DEFAULT_HEIGHT = 200;
    private JPanel panel;

    public ToolBarFrame(){
        setSize(DEFAULT_WIDTH, DEFAULT_HEIGHT);
        panel = new JPanel();
        add(panel, BorderLayout.CENTER);

        Action blueAction = new ColorAction("Blue", new ImageIcon("blue-ball.gif"), Color.BLUE);
        Action yellowAction = new ColorAction("yellow", new ImageIcon("yellow-ball.gif"), Color.YELLOW);
        Action redAction = new ColorAction("Red", new ImageIcon("red-ball.gif"), Color.RED);

        Action exitAction = new AbstractAction("Exit", new ImageIcon("exit.gif")) {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        };

        exitAction.putValue(Action.SHORT_DESCRIPTION, "Exit");

        JToolBar bar = new JToolBar();
        bar.add(blueAction);
        bar.add(yellowAction);
        bar.add(redAction);
        bar.addSeparator();
        bar.add(exitAction);
        add(bar, BorderLayout.NORTH);

        // populate menu
        JMenu menu = new JMenu("Color");
        menu.add(yellowAction);
        menu.add(blueAction);
        menu.add(redAction);
        menu.add(exitAction);
        JMenuBar menuBar = new JMenuBar();
        menuBar.add(menu);
        setJMenuBar(menuBar);
    }

    class ColorAction extends AbstractAction{
        public ColorAction(String name, Icon icon, Color c){
            putValue(Action.NAME, name);
            putValue(Action.SMALL_ICON, icon);
            putValue(Action.SHORT_DESCRIPTION, name + "background");
            putValue("Color", c);
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            Color c = (Color) getValue("Color");
            panel.setBackground(c);
        }
    }

    public  static void main(String[] args){
        JFrame frame = new ToolBarFrame();
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setTitle("ToolBarFrameTest");
        frame.setVisible(true);
    }
}

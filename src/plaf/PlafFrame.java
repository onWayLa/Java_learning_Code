package plaf;

import javax.swing.*;
import java.awt.*;

/**
 * @ClassName:PlafFrame
 * @Description:
 * @Author: liuanhai
 * @Date 2020/9/1 0001
 * @Version 1.0
 */
public class PlafFrame extends JFrame {
    private JPanel buttonPanel;
    private static final int DEFAULT_WIDTH = 500;
    private static final int DEFAULT_HEIGHT = 100;

    public PlafFrame(){
//        setSize(DEFAULT_WIDTH, DEFAULT_HEIGHT);
        buttonPanel = new JPanel();
        UIManager.LookAndFeelInfo[] infos = UIManager.getInstalledLookAndFeels();
        for (UIManager.LookAndFeelInfo info : infos)
            makeButton(info.getName(), info.getClassName());

        add(buttonPanel);
        pack();
    }

    private void makeButton(String name, String className){
        JButton button = new JButton(name);
        buttonPanel.add(button);

        // set button action
        button.addActionListener(event -> {
            // button action: switch to this new look-end-feel
            try {
                UIManager.setLookAndFeel(className);
                SwingUtilities.updateComponentTreeUI(this);
                pack();
            }
            catch (Exception e){
                e.printStackTrace();
            }
        });
    }

    @Override
    public Dimension getPreferredSize() {
        return new Dimension(DEFAULT_WIDTH, DEFAULT_HEIGHT);
    }
}

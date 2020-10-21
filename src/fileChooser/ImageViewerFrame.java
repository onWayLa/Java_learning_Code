package fileChooser;

import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.io.File;
import javax.swing.filechooser.FileFilter;

public class ImageViewerFrame extends JFrame {
    private static final int DEFAULT_WIDTH = 300;
    private static final int DEFAULT_HEIGHT = 400;
    private JLabel label;
    private JFileChooser chooser;

    private ImageViewerFrame(){
        setSize(DEFAULT_WIDTH, DEFAULT_HEIGHT);
//        set up menu bar
        JMenuBar menuBar = new JMenuBar();
        setJMenuBar(menuBar);

        JMenu menu = new JMenu("File");
        menuBar.add(menu);

        JMenuItem openItem = new JMenuItem("OPEN");
        menu.add(openItem);

        openItem.addActionListener(event->{
            chooser.setCurrentDirectory(new File("."));
//            show file chooser dialog
            int result = chooser.showOpenDialog(ImageViewerFrame.this);
            if (result == JFileChooser.APPROVE_OPTION){
                String name = chooser.getSelectedFile().getPath();
                label.setIcon(new ImageIcon(name));
                pack();
            }
        });
        JMenuItem exitItem = new JMenuItem("Exit");
        menu.add(exitItem);
        exitItem.addActionListener(e -> System.exit(0));

//        use a label to display the images
        label = new JLabel();
        add(label);
//        set up file chooser
        chooser = new JFileChooser();

        FileFilter filter = new FileNameExtensionFilter("Image files", "jpg","jpeg","gif");
        chooser.setFileFilter(filter);
        chooser.setAccessory(new ImagePreviewer(chooser));
        chooser.setFileView(new FileIconView(filter,new ImageIcon("palette.gif")));
    }

    public static void main(String[] args){
        JFrame frame = new ImageViewerFrame();
        frame.setVisible(true);
        frame.setTitle("文件选择器");
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}

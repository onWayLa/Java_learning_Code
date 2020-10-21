package fileChooser;

import javax.swing.*;
import java.awt.*;
import java.io.File;

public class ImagePreviewer extends JLabel {
    public ImagePreviewer(JFileChooser chooser){
        setPreferredSize(new Dimension(100, 100));
        setBorder(BorderFactory.createEtchedBorder());

        chooser.addPropertyChangeListener(evt -> {
            if (evt.getPropertyName() == JFileChooser.SELECTED_FILE_CHANGED_PROPERTY){
                File f = (File) evt.getNewValue();
                if (f == null){
                    setIcon(null);
                    return;
                }
//                read the image into an icon
                ImageIcon icon = new ImageIcon(f.getPath());
                if (icon.getIconWidth()>getWidth())
                    icon = new ImageIcon(icon.getImage().getScaledInstance(getWidth(), -1, Image.SCALE_DEFAULT));
                setIcon(icon);
            }
        });
    }
}

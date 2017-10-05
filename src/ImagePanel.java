

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class ImagePanel extends JPanel {
    javax.swing.ButtonGroup radioButtonGroup;
    
    public void setRadioButtonGroup(javax.swing.ButtonGroup radioButtonGroup) {
        this.radioButtonGroup = radioButtonGroup;
    }
    
    public javax.swing.ButtonGroup getRadioButtonGroup() {
        return radioButtonGroup;
    }
    
    @Override
    public void paintComponent (Graphics g) {
        super.paintComponent(g);
        BufferedImage image;
        
        try {
            //switch(radioButtonGroup.getSelection().toString())
            image = ImageIO.read(new File("./misc/nyan-cat.jpg"));
        } catch (IOException ex) {
            image = null;
            System.out.println("Can't load image");
        }
        g.drawImage(image, 0, 0, null);
    }
}

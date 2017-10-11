

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.awt.image.ConvolveOp;
import java.awt.image.Kernel;
import java.io.File;
import java.io.IOException;
import java.util.Enumeration;
import javax.imageio.ImageIO;
import javax.swing.AbstractButton;
import javax.swing.ButtonGroup;
import javax.swing.JPanel;

public class ImagePanel extends JPanel {
    ButtonGroup radioButton;
    ButtonGroup checkBox;
    BufferedImage image;

    public ButtonGroup getCheckBox() {
        return checkBox;
    }

    public void setCheckBox(ButtonGroup checkBox) {
        this.checkBox = checkBox;
    }
    
    public void setRadioButton(ButtonGroup radioButtonGroup) {
        this.radioButton = radioButtonGroup;
    }
    
    public ButtonGroup getRadioButton() {
        return radioButton;
    }
    
    private void smoothImage() {
        float[] difuminar = {
            0.111f, 0.111f, 0.111f,
            0.111f, 0.111f, 0.111f,
            0.111f, 0.111f, 0.111f,};
        Kernel sharpkernel = new Kernel(3, 3, difuminar);
        ConvolveOp sop = new ConvolveOp(sharpkernel, ConvolveOp.EDGE_NO_OP, null);
        image = sop.filter(image, null);
    }
    
    private void lusterImage() {
        float[] resaltar = {
            0.f, -1.f, 0.f,
            -1.f, 5.0f, -1.f,
            0.f, -1.f, 0.f};
        Kernel sharpkernel = new Kernel(3, 3, resaltar);
        ConvolveOp sop = new ConvolveOp(sharpkernel, ConvolveOp.EDGE_NO_OP, null);
        image = sop.filter(image, null);
    }
    
    @Override
    public void paintComponent (Graphics g) {
        super.paintComponent(g);
        try {
            Enumeration elements = radioButton.getElements();
            for (int i = 0; i < radioButton.getButtonCount(); i++) {
                AbstractButton button = (AbstractButton)elements.nextElement();
                if(button.isSelected()) {
                    switch(button.getText()) {
                        case "Nyan Cat":
                            paintImage("./misc/nyan-cat.jpg");
                            break;
                        case "Moon":
                            paintImage("./misc/moon.jpg");
                            break;
                        case "Dog":
                            paintImage("./misc/dog.jpg");
                            break;
                        default:
                            paintImage("./misc/nyan-cat.jpg");
                            break;
                    }
                }
            }
        } catch (IOException ex) {
            image = null;
            System.out.println("Can't load image");
        }
        g.drawImage(image, 0, 0, null);
    }
    
    private void paintImage(String path) throws IOException {
        image = ImageIO.read(new File(path));
        Enumeration elements = checkBox.getElements();
        for (int i = 0; i < checkBox.getButtonCount(); i++) {
            AbstractButton button = (AbstractButton)elements.nextElement();
            if(button.isSelected()) {
                        System.out.println(button.getText());
                switch(button.getText()){
                    case "Smooth":
                        System.out.println(button.getText());
                        smoothImage();
                        break;
                    case "Luster":
                        System.out.println(button.getText());
                        lusterImage();
                        break;
                    default:
                        System.out.println(button.getText());
                        break;
                }
            }
        }
                
    }
}

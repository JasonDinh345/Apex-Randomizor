
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class MapsPanel extends JPanel {
    private Image backgroundImage;
   
    private Dimension size;
   

    public MapsPanel(){
       
        backgroundImage = new ImageIcon(getClass().getClassLoader().getResource("extra/we_background.jpg")).getImage();
        size = new Dimension(backgroundImage.getWidth(null), backgroundImage.getHeight(null));
        setPreferredSize(size);
        setMinimumSize(size);
        setMaximumSize(size);
        setSize(size);


    }
    public void setBackground(String file){
         backgroundImage = new ImageIcon(getClass().getClassLoader().getResource(file)).getImage();
        size = Toolkit.getDefaultToolkit().getScreenSize();
        setPreferredSize(size);
        setMinimumSize(size);
        setMaximumSize(size);
        setSize(size);
        repaint();
    }
    
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        
        g.drawImage(backgroundImage, 0, 0, this);

     
        
    }
}

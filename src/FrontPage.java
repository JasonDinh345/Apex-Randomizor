import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class FrontPage extends JPanel{
    private ImageIcon backgroundImage;
    private Image img;
    private Dimension size;
    WeaponRec slot1 = new WeaponRec();
    WeaponRec slot2 = new WeaponRec();

    public FrontPage(){
        backgroundImage = new ImageIcon(getClass().getClassLoader().getResource("extra/season19.jpg"));
        
        img = backgroundImage.getImage();
        size = Toolkit.getDefaultToolkit().getScreenSize();
        setPreferredSize(size);
        setMinimumSize(size);
        setMaximumSize(size);
        setSize(size);
    }

    public void paintComponent(Graphics g){
        super.paintComponent(g);

        g.drawImage(img, 0, 0, this);

        //first rec
        g.setColor(slot1.getColor2());
         g.fillRect(700, 295, slot1.getWidth()+10, slot1.getHeight()+10 );
        g.setColor(slot1.getColor());
        g.fillRect(705, 300, slot1.getWidth(), slot1.getHeight() );
        
        //second rect
        g.setColor(slot2.getColor2());
         g.fillRect(700, 725, slot2.getWidth()+10, slot2.getHeight()+10 );
        g.setColor(slot2.getColor());
        g.fillRect(705,730,slot2.getWidth(),slot2.getHeight()); 

        g.setColor(Color.BLACK);
        g.fillRect(1295,245,510,610);
        g.setColor(Color.WHITE);
        g.fillRect(1300, 250, 500, 600);
        

    }
    public void changeTheColorOfSlot1(Color g){
        slot1.changeColor(g);
        repaint();
    }
    public void changeTheColor2OfSlot1(Color g){
        slot1.changeColor2(g);
        repaint();
    }
    public void changeTheColorOfSlot2(Color g){
        slot2.changeColor(g);
        repaint();
    }
    public void changeTheColor2OfSlot2(Color g){
        slot2.changeColor2(g);
        repaint();
    }
}


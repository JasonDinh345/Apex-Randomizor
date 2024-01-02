import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Picture extends JLabel {
    private ImageIcon originalImg;
    private Image scaledImg;
    private ImageIcon newImg;

    public void changeCircleLocation(int x, int y){
       originalImg = new ImageIcon(getClass().getClassLoader().getResource("extra/circle.png"));
         int width;
        int height;
        if (originalImg.getIconWidth()/2 == 0){
            width = 1;
        } else{
            width= originalImg.getIconWidth()/2;
        }
         if (originalImg.getIconHeight()/2 == 0){
            height = 1;
        } else{
            height= originalImg.getIconHeight()/2;
        }
        scaledImg = originalImg.getImage().getScaledInstance(width,height, 1);
        newImg = new ImageIcon(scaledImg);
         this.setIcon(newImg);
         this.setBounds(x + 450, y -330, 1920,1000);
    }

    public void changeMapImage(String file){
        originalImg = new ImageIcon(getClass().getClassLoader().getResource(file));
        scaledImg = originalImg.getImage().getScaledInstance(800,800, 1);
        newImg = new ImageIcon(scaledImg);
        this.setIcon(newImg);
        this.setBounds(500, 170, 800,800);
    }
    public void changeLegendImage(String file){
         originalImg = new ImageIcon(getClass().getClassLoader().getResource(file));
                scaledImg = originalImg.getImage().getScaledInstance(-1,-1, 1);
                newImg = new ImageIcon(scaledImg);
                this.setIcon(newImg);
                this.setBounds(20, 125, 1920,1000);
    }
    public void changeGunImage(String file){
        originalImg = new ImageIcon(getClass().getClassLoader().getResource(file));
         int width;
        int height;
        if (originalImg.getIconWidth()/4 == 0){
            width = 1;
        } else{
            width= originalImg.getIconWidth()/4;
        }
         if (originalImg.getIconHeight()/4 == 0){
            height = 1;
        } else{
            height= originalImg.getIconHeight()/4;
        }
        scaledImg = originalImg.getImage().getScaledInstance(width,height, 1);
         newImg = new ImageIcon(scaledImg);
        this.setIcon(newImg);
         this.setBounds(725, 330,originalImg.getIconWidth()/4 ,originalImg.getIconHeight()/4);
    }
    public void changeGun2Image(String file){
        originalImg = new ImageIcon(getClass().getClassLoader().getResource(file));
         int width;
        int height;
        if (originalImg.getIconWidth()/4 == 0){
            width = 1;
        } else{
            width= originalImg.getIconWidth()/4;
        }
         if (originalImg.getIconHeight()/4 == 0){
            height = 1;
        } else{
            height= originalImg.getIconHeight()/4;
        }
        scaledImg = originalImg.getImage().getScaledInstance(width,height, 1);
         newImg = new ImageIcon(scaledImg);
        this.setIcon(newImg);
         this.setBounds(725, 760,originalImg.getIconWidth()/4 ,originalImg.getIconHeight()/4);
    }
    public void changeGunImageSpecial(String file){
        originalImg = new ImageIcon(getClass().getClassLoader().getResource(file));
        int width;
        int height;
        if (originalImg.getIconWidth()/5 == 0){
            width = 1;
        } else{
            width= originalImg.getIconWidth()/5;
        }
         if (originalImg.getIconHeight()/5 == 0){
            height = 1;
        } else{
            height= originalImg.getIconHeight()/5;
        }
        scaledImg = originalImg.getImage().getScaledInstance(width,height, 1);
         newImg = new ImageIcon(scaledImg);
        this.setIcon(newImg);
         this.setBounds(825, 310,originalImg.getIconWidth()/5 ,originalImg.getIconHeight()/5);
    }
    public void changeGun2ImageSpecial(String file){
        originalImg = new ImageIcon(getClass().getClassLoader().getResource(file));
         int width;
        int height;
        if (originalImg.getIconWidth()/5 == 0){
            width = 1;
        } else{
            width= originalImg.getIconWidth()/5;
        }
         if (originalImg.getIconHeight()/5 == 0){
            height = 1;
        } else{
            height= originalImg.getIconHeight()/5;
        }
        scaledImg = originalImg.getImage().getScaledInstance(width,height, 1);
         newImg = new ImageIcon(scaledImg);
        this.setIcon(newImg);
         this.setBounds(825, 740,originalImg.getIconWidth()/5 ,originalImg.getIconHeight()/5);
    }
    public void changeGunImageCR(String file){
         originalImg = new ImageIcon(getClass().getClassLoader().getResource(file));
         int width;
        int height;
        if (originalImg.getIconWidth()/5 == 0){
            width = 1;
        } else{
            width= originalImg.getIconWidth()/5;
        }
         if (originalImg.getIconHeight()/5 == 0){
            height = 1;
        } else{
            height= originalImg.getIconHeight()/5;
        }
        scaledImg = originalImg.getImage().getScaledInstance(width,height, 1);
         newImg = new ImageIcon(scaledImg);
        this.setIcon(newImg);
         this.setBounds(775, 310,originalImg.getIconWidth()/4 ,originalImg.getIconHeight()/4);
    }
    public void changeGun2ImageCR(String file){
        originalImg = new ImageIcon(getClass().getClassLoader().getResource(file));
         int width;
        int height;
        if (originalImg.getIconWidth()/5 == 0){
            width = 1;
        } else{
            width= originalImg.getIconWidth()/5;
        }
         if (originalImg.getIconHeight()/5 == 0){
            height = 1;
        } else{
            height= originalImg.getIconHeight()/5;
        }
        scaledImg = originalImg.getImage().getScaledInstance(width,height, 1);
         newImg = new ImageIcon(scaledImg);
        this.setIcon(newImg);
         this.setBounds(775, 740,originalImg.getIconWidth()/5 ,originalImg.getIconHeight()/5);
    }
     public void changeGunImageB(String file){
        originalImg = new ImageIcon(getClass().getClassLoader().getResource(file));
        int width;
        int height;
        if (originalImg.getIconWidth()/6 == 0){
            width = 1;
        } else{
            width= originalImg.getIconWidth()/6;
        }
         if (originalImg.getIconHeight()/6 == 0){
            height = 1;
        } else{
            height= originalImg.getIconHeight()/6;
        }
        scaledImg = originalImg.getImage().getScaledInstance(width,height, 1);
         newImg = new ImageIcon(scaledImg);
        this.setIcon(newImg);
         this.setBounds(785, 310,originalImg.getIconWidth()/6 ,originalImg.getIconHeight()/6);
    }
    public void changeGun2ImageB(String file){
         originalImg = new ImageIcon(getClass().getClassLoader().getResource(file));
         int width;
        int height;
        if (originalImg.getIconWidth()/6 == 0){
            width = 1;
        } else{
            width= originalImg.getIconWidth()/6;
        }
         if (originalImg.getIconHeight()/6 == 0){
            height = 1;
        } else{
            height= originalImg.getIconHeight()/6;
        }
        scaledImg = originalImg.getImage().getScaledInstance(width,height, 1);
         newImg = new ImageIcon(scaledImg);
        this.setIcon(newImg);
         this.setBounds(785, 740,originalImg.getIconWidth()/6 ,originalImg.getIconHeight()/6);
    }
}

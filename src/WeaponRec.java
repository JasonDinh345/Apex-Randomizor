import java.awt.Color;

public class WeaponRec{
    private Color color;
    private Color color2;
    private int width;
    private int height;
    
    public WeaponRec(){
        color = Color.black;
        color2 = Color.black;
        width =510;
        height =225;
    }
    public void changeColor(Color g){
        color = g;
    }
    public void changeColor2(Color g){
        color2 = g;
    }
    public Color getColor(){
        return color;
    }
    public Color getColor2(){
        return color2;
    }
    public int getWidth(){
        return width;
    }
    public int getHeight(){
        return height;
    }
}


import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTabbedPane;
import javax.swing.SwingConstants;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.io.InputStream;

public class GUI implements ActionListener {
     private JFrame frame;
    private JLabel label;
    private FrontPage panel;
    private MapsPanel panel2;
     private JButton button;
     private JButton button2;
     private JButton button3;
     private JLabel label2;
     private JLabel label3;
     Maps mapList = new Maps();
     String[] maps = mapList.getMaps();
     Weapons gunList= new Weapons();
     private JComboBox listOfMaps;
    private Picture picture;
    private JTabbedPane tab = new JTabbedPane();
    private JButton button4;
    private JLabel dropPoint;
    private DropLocations dLocations = new DropLocations();
    private RandomizeLegend legend;
    private Font apexFont;
    private Font apexFontTitle;
    private JLabel title;
    private RandomizeGun gun1;
    private RandomizeGun gun2;
    private JCheckBox hasCarePackage;
    private JCheckBox hasRep;
    private JButton randomizeAll;
    private JLabel options;
    private Circle circle;

    

    public GUI(){

        frame = new JFrame();
        panel = new FrontPage();
        panel2 = new MapsPanel();

        //font
        try {
             InputStream is = getClass().getResourceAsStream("extra/Apex-Bold.ttf");
             InputStream is2 = getClass().getResourceAsStream("extra/Apex-Bold.ttf");
             apexFont = Font.createFont(Font.TRUETYPE_FONT, is).deriveFont(30f);
             apexFontTitle =Font.createFont(Font.TRUETYPE_FONT, is2).deriveFont(50f);
        }  catch(IOException | FontFormatException e){

        }
       


        /*try{
            apexFont = Font.createFont(Font.TRUETYPE_FONT, new File(getClass().getClassLoader().getResource("extra/Apex-Bold.ttf").getPath())).deriveFont(30f);
            GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
            ge.registerFont(Font.createFont(Font.TRUETYPE_FONT, new File(getClass().getClassLoader().getResource("extra/Apex-Bold.ttf").getPath())));

            apexFontTitle = Font.createFont(Font.TRUETYPE_FONT, new File(getClass().getClassLoader().getResource("extra/Apex-Bold.ttf").getPath())).deriveFont(50f);
            GraphicsEnvironment ge2 = GraphicsEnvironment.getLocalGraphicsEnvironment();
            ge2.registerFont(Font.createFont(Font.TRUETYPE_FONT, new File(getClass().getClassLoader().getResource("extra/Apex-Bold.ttf").getPath())));
        }
        catch(IOException | FontFormatException e){

        }*/
        //tabs
        tab.addTab("Legend and Guns", panel);
        tab.addTab("Maps", panel2);
    
       //title
       title = new JLabel("Apex Randomizer", SwingConstants.CENTER);
       title.setBounds(700, 10, 500, 100);
       title.setFont(apexFontTitle);
       
        //legends and weapon buttons
        button = new JButton("Randomize Legend");
        button.setBounds(180, 120 ,300, 100);
        button.addActionListener(this);
        button.setFont(apexFont);
        button.setFocusable(false);

        button2 = new JButton("Randomize Weapon1");
        button2.setBounds(800, 120,300,100);
        button2.addActionListener(this);
        button2.setFont(apexFont);
        button2.setFocusable(false);

        button3 = new JButton("Randomize Weapon2");
        button3.setBounds(800,550,300,100);
        button3.addActionListener(this);
        button3.setFont(apexFont);
        button3.setFocusable(false);

        randomizeAll = new JButton("Randomize All");
        randomizeAll.setBounds(1395, 120, 300, 100);
        randomizeAll.addActionListener(this);
        randomizeAll.setFont(apexFont);
        randomizeAll.setFocusable(false);
        
        // labels for weapon and legends
        label = new JLabel("???",SwingConstants.CENTER );
        label.setBounds(30,220,600,100);
        label.setFont(apexFont);

        label2 = new JLabel("???",SwingConstants.CENTER);
        label2.setBounds(755,230, 400, 60);
        label2.setFont(apexFont);
        label2.setForeground(new Color(255,3,1));
        label2.setBackground(Color.WHITE);
        label2.setBorder(BorderFactory.createLineBorder(Color.black,3));
        label2.setOpaque(true);

        label3= new JLabel("???",SwingConstants.CENTER);
        label3.setBounds(755,660,400,60);
        label3.setFont(apexFont);
        label3.setForeground(new Color(255,3,1));
        label3.setBackground(Color.WHITE);
        label3.setBorder(BorderFactory.createLineBorder(Color.black,3));
        label3.setOpaque(true);

       options= new JLabel("OPTIONS",SwingConstants.CENTER);
       options.setBounds(1335,280,400,60);
        options.setFont(apexFontTitle);

        // legend image
        legend = new RandomizeLegend();
        legend.changeLegendImage("legends/mysterylegend.png");



        //checkbox for care package weapons
        hasCarePackage = new JCheckBox("Include Care Package Weapons");
        hasCarePackage.setBounds(1350, 450,400, 100);
        hasCarePackage.setFocusable(false);
        hasCarePackage.setFont(apexFont);
        hasCarePackage.addActionListener(this);
        hasCarePackage.setOpaque(false);
    

        //checkbox for rep weapons
        hasRep = new JCheckBox("Include Replicator Weapons");
        hasRep.setBounds(1350, 650,400, 100);
        hasRep.setFocusable(false);
        hasRep.setFont(apexFont);
        hasRep.addActionListener(this);
        
        hasRep.setOpaque(false);
        
        //gun

        gun1 = new RandomizeGun();
       gun1.changeGunImageSpecial("extra/questionmark.png");
      

        gun2 = new RandomizeGun();
      gun2.changeGun2ImageSpecial("extra/questionmark.png");
         
    

      //weapons panel
        
        panel.setLayout(null);
        panel.add(button);
        panel.add(label);
        panel.add(button2);
        panel.add(label2);
        panel.add(button3);
        panel.add(label3);
        panel.add(legend);
        panel.add(title);
        panel.add(gun1);
        panel.add(gun2);
        panel.add(hasCarePackage);
        panel.add(hasRep);
        panel.add(randomizeAll);
        panel.add(options);
        //map randomize button

        button4 = new JButton("Randomize Drop Location");
        button4.setBounds(700,60,400,50);
        button4.addActionListener(this);
        button4.setFont(apexFont);
        button4.setFocusable(false);
        


          //map picture default
        picture = new Picture();
       picture.changeMapImage("extra/worlds_edge.jpeg");
        picture.setBorder(BorderFactory.createLineBorder(Color.black,5));
        

         //drop down for maps
        listOfMaps = new  JComboBox(maps);
        listOfMaps.setBounds(800,10, 200,40);
        listOfMaps.setSelectedIndex(0);
        listOfMaps.addActionListener(this);
     

        //label for  drop point

        dropPoint = new JLabel("???",SwingConstants.CENTER);
        dropPoint.setBounds(700, 115, 400, 50);
        dropPoint.setFont(apexFont);
        dropPoint.setForeground(Color.BLACK);
        dropPoint.setBackground(Color.white);
        dropPoint.setOpaque(true);
        dropPoint.setBorder(BorderFactory.createLineBorder(Color.black,3));

        //map circle
        circle = new Circle();
        circle.randomizeLocation("reset");


        //background default for maps

       panel2.setBackground("extra/we_background.jpg");

        //maps panel

        panel2.setLayout(null);
        panel2.add(circle);
        panel2.add(listOfMaps);
        panel2.add(picture);
       panel2.add(button4);
        panel2.add(dropPoint);
        

            
      
    
        //frame
        ImageIcon icon = new ImageIcon(getClass().getClassLoader().getResource("extra/unknown.png"));
        frame.setIconImage(icon.getImage());
        frame.add(tab, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Apex Randomizer");
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        frame.setMinimumSize(screenSize);
        frame.setMaximumSize(screenSize);
        frame.setLocationRelativeTo(null);
        frame.pack();
        frame.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        //randomizes legend
        if(e.getSource() == button){
            Legends characters = new Legends();
            String name  = characters.getRandomLegend();
            while (name == label.getText()){
                name  = characters.getRandomLegend();
            }
            label.setText(name);
            legend.changeLegend(name);
        }
        //randomizes weapon 1
        if(e.getSource() ==button2){
            String gun = gunList.getRandomWeapon();
            while (gun ==null || gun.equals(label2.getText())){
                gun = gunList.getRandomWeapon();
            }
            label2.setText(gun);
            gun1.changeGun1(gun, panel);
            
        }
        //randomizes weapon 2
        if(e.getSource() ==button3){
            String gun = gunList.getRandomWeapon();
            while (gun ==null || gun.equals(label3.getText())){
                gun = gunList.getRandomWeapon();
            }
            label3.setText(gun);
            gun2.changeGun2(gun,panel);
            }
        //randomize all button
        if(e.getSource() == randomizeAll){
            String gun = gunList.getRandomWeapon();
            while (gun ==null || gun.equals(label2.getText())){
                gun = gunList.getRandomWeapon();
            }
            label2.setText(gun);
            gun1.changeGun1(gun, panel);
            gun = gunList.getRandomWeapon();
            while (gun ==null || gun.equals(label3.getText())){
                gun = gunList.getRandomWeapon();
            }
            label3.setText(gun);
            gun2.changeGun2(gun,panel);
            Legends characters = new Legends();
            String name  = characters.getRandomLegend();
            while (name == label.getText()){
                name  = characters.getRandomLegend();
            }
            label.setText(name);
            legend.changeLegend(name);
            }
        //changes the map image 
        if(e.getSource() == listOfMaps){
            String target = (String) listOfMaps.getSelectedItem();
           switch (target) { //checks which map it chosen
                case "World's Edge":
                 picture.changeMapImage("extra/worlds_edge.jpeg");
                    panel2.setBackground("extra/we_background.jpg");
                    circle.randomizeLocation("reset");
                    dropPoint.setText("???");
                    break;
                case "Kings Canyon":
                   
                    picture.changeMapImage("extra/kings_canyon.png");
                    panel2.setBackground("extra/kingsbg.jpg");
                    circle.randomizeLocation("reset");
                    dropPoint.setText("???");
                    break;
                case "Olympus":
                    picture.changeMapImage("extra/olympus.jpg");
                    panel2.setBackground("extra/obg.jpg");
                    circle.randomizeLocation("reset");
                    dropPoint.setText("???");
                    break;
                case "Storm Point":
                    picture.changeMapImage("extra/storm_point.jpg");
                    panel2.setBackground("extra/spbg.jpg");
                    circle.randomizeLocation("reset");
                    dropPoint.setText("???");
                    break;
                case "Broken Moon":
                    picture.changeMapImage("extra/broken_moon.jpeg");
                    panel2.setBackground("extra/bmbg.jpg");
                    circle.randomizeLocation("reset");
                    dropPoint.setText("???");
                    break;
                    
            } 
            
        }
        // randomizes map drop location per map
        if(e.getSource() == button4){
            String target = (String) listOfMaps.getSelectedItem();
             int random;
             switch(target){ // checks which map it is
                case "World's Edge":
                    random = (int)(Math.random()* dLocations.getWorldsEdgeDrops().length);
                    while(dropPoint.getText().equals(dLocations.getWorldsEdgeDrops()[random])){
                        random = (int)(Math.random()* dLocations.getWorldsEdgeDrops().length);
                    }
                    dropPoint.setText(dLocations.getWorldsEdgeDrops()[random]);
                    circle.randomizeLocation(dropPoint.getText());
                    break;
                case "Kings Canyon":
                    random = (int)(Math.random()* dLocations.getKingsCanyonDrops().length);
                    while(dropPoint.getText().equals(dLocations.getKingsCanyonDrops()[random])){
                        random = (int)(Math.random()* dLocations.getKingsCanyonDrops().length);
                    }
                    dropPoint.setText(dLocations.getKingsCanyonDrops()[random]);
                  circle.randomizeLocation(dropPoint.getText());
                    break;
                case "Olympus":
                    random = (int)(Math.random()* dLocations.getOlympusDrops().length);
                     while(dropPoint.getText().equals(dLocations.getOlympusDrops()[random])){
                        random = (int)(Math.random()* dLocations.getOlympusDrops().length);
                    }
                    dropPoint.setText(dLocations.getOlympusDrops()[random]);
                    circle.randomizeLocation(dropPoint.getText());
                    break;
                case "Storm Point":
                    random= (int)(Math.random()* dLocations.getStormPointDrops().length);
                     while(dropPoint.getText().equals(dLocations.getStormPointDrops()[random])){
                        random = (int)(Math.random()* dLocations.getStormPointDrops().length);
                    }
                    dropPoint.setText(dLocations.getStormPointDrops()[random]);
                   circle.randomizeLocation(dropPoint.getText());
                    break;
                case "Broken Moon":
                    random = (int)(Math.random()* dLocations.getBrokenMoonDrops().length);
                     while(dropPoint.getText().equals(dLocations.getBrokenMoonDrops()[random])){
                        random = (int)(Math.random()* dLocations.getBrokenMoonDrops().length);
                    }
                    dropPoint.setText(dLocations.getBrokenMoonDrops()[random]);
                    circle.randomizeLocation(dropPoint.getText());
                    break;
                    
            } 
        }
        if(e.getSource() == hasCarePackage){
            if(hasCarePackage.isSelected() == true){
                gunList.addCarePackageWeapons();
            }else{
                gunList.removeCarePackageWeapons();
            }
        }
        if(e.getSource() == hasRep){
            if(hasRep.isSelected() == true){
                gunList.addRepWeapons();
                System.out.println("yo");
            }else{
                gunList.removeRepWeapons();
            }
        }
    }
       
}

    



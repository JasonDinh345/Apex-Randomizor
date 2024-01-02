public class Weapons {
    private String[][] guns = {{"Alternator SMG","R-99 SMG","M600 Spitfire","G7 Scout","RE-45 Auto","P2020"},{"VK-47 Flatline","Hemlok Burst AR","C.A.R. SMG","Rampage LMG","30-30 Repeater"}
    ,{"HAVOC Rifle", "Nemesis Burst AR","Devotion LMG","L-STAR EMG","Triple Take"},{"Charge Rifle","Longbow DMR","Sentinel"},{"EVA-8 Auto","Mastiff Shotgun","Mozambique Shotgun","Peacekeeper"},
    {null,null,null,null,null,null,null}, {null,null}};


    public String getRandomWeapon(){
    int randomNum = (int) (Math.random()* guns.length);
    int randomNumCol = (int)(Math.random() * guns[randomNum].length);
    return guns[randomNum][randomNumCol];
    }

    public void addCarePackageWeapons(){
        guns[5][0]= "Wingman";
        guns[5][1]= "Prowler Burst PDW";
        guns[5][2]= "Kraber .50-Cal Sniper";
        guns[5][3]= "Wingman";
        guns[5][4]= "Bocek Compound Bow";

    }
    public void removeCarePackageWeapons(){
         guns[5][0]= null;
        guns[5][1]= null;
        guns[5][2]= null;
        guns[5][3]= null;
        guns[5][4]=null;
    }
    public void addRepWeapons(){
        guns[6][0] = "R-301 Carbine";
        guns[6][1]= "Volt SMG";
    }
    public void removeRepWeapons(){
         guns[6][0] = null;
        guns[6][1]= null;
    }
}
import java.awt.Color;


public class RandomizeGun extends Picture{
    public void changeGun1(String gun, FrontPage panel){
        switch (gun) {
            case "30-30 Repeater":
            this.changeGunImage("guns/3030.png");
            panel.changeTheColorOfSlot1(new Color(208,255,218));
            panel.changeTheColor2OfSlot1(new Color(30,112,98));

            break;
            case "Alternator SMG":
             this.changeGunImageSpecial("guns/alternator.png");
              panel.changeTheColorOfSlot1(new Color(255,196,102));
            panel.changeTheColor2OfSlot1(new Color(156,77,28));
            break;
            case "HAVOC Rifle":
            this.changeGunImage("guns/havoc.png");
            panel.changeTheColorOfSlot1(new Color(252,253,150));
            panel.changeTheColor2OfSlot1(new Color(95,126,11));
            break;
            case "VK-47 Flatline":
            this.changeGunImage("guns/flatline.png");
            panel.changeTheColorOfSlot1(new Color(208,255,218));
            panel.changeTheColor2OfSlot1(new Color(30,112,98));
                break;
            case "Hemlok Burst AR":
            this.changeGunImage("guns/hemlock.png");
            panel.changeTheColorOfSlot1(new Color(208,255,218));
            panel.changeTheColor2OfSlot1(new Color(30,112,98));
                break;
            case "R-301 Carbine":
            this.changeGunImage("guns/r301.png");
            panel.changeTheColorOfSlot1(new Color(255,196,102));
            panel.changeTheColor2OfSlot1(new Color(156,77,28));
                break;
            case "Nemesis Burst AR":
            this.changeGunImage("guns/nemisis.png");
            panel.changeTheColorOfSlot1(new Color(252,253,150));
            panel.changeTheColor2OfSlot1(new Color(95,126,11));
                break;
            case "Prowler Burst PDW":
            this.changeGunImageSpecial("guns/prowler.png");
            panel.changeTheColorOfSlot1(new Color(248,3,74));
            panel.changeTheColor2OfSlot1(new Color(145,0,23));
                break;
            case "R-99 SMG":
            this.changeGunImage("guns/r99.png");
            panel.changeTheColorOfSlot1(new Color(255,196,102));
            panel.changeTheColor2OfSlot1(new Color(156,77,28));
                break;
            case "Volt SMG":
            this.changeGunImage("guns/volt.png");
            panel.changeTheColorOfSlot1(new Color(252,253,150));
            panel.changeTheColor2OfSlot1(new Color(95,126,11));
                break;  
            case "C.A.R. SMG":
            this.changeGunImage("guns/car.png");
           panel.changeTheColorOfSlot1(new Color(208,255,218));
            panel.changeTheColor2OfSlot1(new Color(30,112,98));
                break;
            case "Devotion LMG":
            this.changeGunImage("guns/devo.png");
            panel.changeTheColorOfSlot1(new Color(252,253,150));
            panel.changeTheColor2OfSlot1(new Color(95,126,11));
                break;
            case "L-STAR EMG":
            this.changeGunImage("guns/lstar.png");
            panel.changeTheColorOfSlot1(new Color(252,253,150));
            panel.changeTheColor2OfSlot1(new Color(95,126,11));
                break;
            case "M600 Spitfire":
            this.changeGunImage("guns/spitfire.png");
            panel.changeTheColorOfSlot1(new Color(255,196,102));
            panel.changeTheColor2OfSlot1(new Color(156,77,28));
                break;
            case "Rampage LMG":
            this.changeGunImage("guns/rampage.png");
            panel.changeTheColorOfSlot1(new Color(208,255,218));
            panel.changeTheColor2OfSlot1(new Color(30,112,98));
                break;
            case "G7 Scout":
            this.changeGunImage("guns/g7.png");
           panel.changeTheColorOfSlot1(new Color(255,196,102));
            panel.changeTheColor2OfSlot1(new Color(156,77,28));
                break;
            case "Triple Take":
            this.changeGunImage("guns/triple_take.png");
            panel.changeTheColorOfSlot1(new Color(252,253,150));
            panel.changeTheColor2OfSlot1(new Color(95,126,11));
                break;
            case "Bocek Compound Bow":
            this.changeGunImageB("guns/bocek.png");
            panel.changeTheColorOfSlot1(new Color(248,3,74));
            panel.changeTheColor2OfSlot1(new Color(145,0,23));
                break;
            case "EVA-8 Auto":
            this.changeGunImage("guns/eva8.png");
            panel.changeTheColorOfSlot1(new Color(255,168,129));
            panel.changeTheColor2OfSlot1(new Color(169,9,0));
                break;
            case "Mastiff Shotgun":
            this.changeGunImage("guns/mastiff.png");
            panel.changeTheColorOfSlot1(new Color(255,168,129));
            panel.changeTheColor2OfSlot1(new Color(169,9,0));
                break;
            case "Mozambique Shotgun":
            this.changeGunImageSpecial("guns/mozam.png");
            panel.changeTheColorOfSlot1(new Color(255,168,129));
            panel.changeTheColor2OfSlot1(new Color(169,9,0));
                break;
            case "Peacekeeper":
            this.changeGunImage("guns/peacekeeper.png");
            panel.changeTheColorOfSlot1(new Color(255,168,129));
            panel.changeTheColor2OfSlot1(new Color(169,9,0));
                break;
            case "RE-45 Auto":
            this.changeGunImageSpecial("guns/re45.png");
          panel.changeTheColorOfSlot1(new Color(255,196,102));
            panel.changeTheColor2OfSlot1(new Color(156,77,28));
                break;
            case "P2020":
            this.changeGunImageSpecial("guns/p2020.png");
           panel.changeTheColorOfSlot1(new Color(255,196,102));
            panel.changeTheColor2OfSlot1(new Color(156,77,28));
                break;
            case "Wingman":
            this.changeGunImageSpecial("guns/wingman.png");
           panel.changeTheColorOfSlot1(new Color(248,3,74));
            panel.changeTheColor2OfSlot1(new Color(145,0,23));
                break;
            case "Charge Rifle":
            this.changeGunImageCR("guns/charge_rifle.png");
            panel.changeTheColorOfSlot1(new Color(140,143,240));
            panel.changeTheColor2OfSlot1(new Color(44,44,201));
                break;
            case "Longbow DMR":
            this.changeGunImage("guns/longbow.png");
            panel.changeTheColorOfSlot1(new Color(140,143,240));
            panel.changeTheColor2OfSlot1(new Color(44,44,201));
                break;
            case "Kraber .50-Cal Sniper":
            this.changeGunImage("guns/kraber.png");
            panel.changeTheColorOfSlot1(new Color(248,3,74));
            panel.changeTheColor2OfSlot1(new Color(145,0,23));
                break;
            case "Sentinel":
            this.changeGunImage("guns/sentinal.png");
            panel.changeTheColorOfSlot1(new Color(140,143,240));
            panel.changeTheColor2OfSlot1(new Color(44,44,201));
                break;
        }
    }
    public void changeGun2(String gun, FrontPage panel){
        switch (gun) {
            case "30-30 Repeater":
            this.changeGun2Image("guns/3030.png");
             panel.changeTheColorOfSlot2(new Color(208,255,218));
            panel.changeTheColor2OfSlot2(new Color(30,112,98));
            break;
            case "Alternator SMG":
              this.changeGun2ImageSpecial("guns/alternator.png");
             panel.changeTheColorOfSlot2(new Color(255,196,102));
            panel.changeTheColor2OfSlot2(new Color(156,77,28));
            break;
            case "HAVOC Rifle":
             this.changeGun2Image("guns/havoc.png");
            panel.changeTheColorOfSlot2(new Color(252,253,150));
            panel.changeTheColor2OfSlot2(new Color(95,126,11));
            break;
            case "VK-47 Flatline":
             this.changeGun2Image("guns/flatline.png");
             panel.changeTheColorOfSlot2(new Color(208,255,218));
            panel.changeTheColor2OfSlot2(new Color(30,112,98));
                break;
            case "Hemlok Burst AR":
             this.changeGun2Image("guns/hemlock.png");
             panel.changeTheColorOfSlot2(new Color(208,255,218));
            panel.changeTheColor2OfSlot2(new Color(30,112,98));
                break;
            case "R-301 Carbine":
             this.changeGun2Image("guns/r301.png");
             panel.changeTheColorOfSlot2(new Color(255,196,102));
            panel.changeTheColor2OfSlot2(new Color(156,77,28));
                break;
            case "Nemesis Burst AR":
             this.changeGun2Image("guns/nemisis.png");
            panel.changeTheColorOfSlot2(new Color(252,253,150));
            panel.changeTheColor2OfSlot2(new Color(95,126,11));
                break;
            case "Prowler Burst PDW":
             this.changeGun2ImageSpecial("guns/prowler.png");
             panel.changeTheColorOfSlot2(new Color(248,3,74));
            panel.changeTheColor2OfSlot2(new Color(145,0,23));
                break;
            case "R-99 SMG":
             this.changeGun2Image("guns/r99.png");
             panel.changeTheColorOfSlot2(new Color(255,196,102));
            panel.changeTheColor2OfSlot2(new Color(156,77,28));
                break;
            case "Volt SMG":
             this.changeGun2Image("guns/volt.png");
             panel.changeTheColorOfSlot2(new Color(252,253,150));
            panel.changeTheColor2OfSlot2(new Color(95,126,11));
                break;  
            case "C.A.R. SMG":
             this.changeGun2Image("guns/car.png");
             panel.changeTheColorOfSlot2(new Color(208,255,218));
            panel.changeTheColor2OfSlot2(new Color(30,112,98));
                break;
            case "Devotion LMG":
             this.changeGun2Image("guns/devo.png");
            panel.changeTheColorOfSlot2(new Color(252,253,150));
            panel.changeTheColor2OfSlot2(new Color(95,126,11));
                break;
            case "L-STAR EMG":
             this.changeGun2Image("guns/lstar.png");
            panel.changeTheColorOfSlot2(new Color(252,253,150));
            panel.changeTheColor2OfSlot2(new Color(95,126,11));
                break;
            case "M600 Spitfire":
             this.changeGun2Image("guns/spitfire.png");
             panel.changeTheColorOfSlot2(new Color(255,196,102));
            panel.changeTheColor2OfSlot2(new Color(156,77,28));
                break;
            case "Rampage LMG":
             this.changeGun2Image("guns/rampage.png");
             panel.changeTheColorOfSlot2(new Color(208,255,218));
            panel.changeTheColor2OfSlot2(new Color(30,112,98));
                break;
            case "G7 Scout":
             this.changeGun2Image("guns/g7.png");
             panel.changeTheColorOfSlot2(new Color(255,196,102));
            panel.changeTheColor2OfSlot2(new Color(156,77,28));
                break;
            case "Triple Take":
             this.changeGun2Image("guns/triple_take.png");
            panel.changeTheColorOfSlot2(new Color(252,253,150));
            panel.changeTheColor2OfSlot2(new Color(95,126,11));
                break;
            case "Bocek Compound Bow":
             this.changeGun2ImageB("guns/bocek.png");
               panel.changeTheColorOfSlot2(new Color(248,3,74));
            panel.changeTheColor2OfSlot2(new Color(145,0,23));
                break;
            case "EVA-8 Auto":
             this.changeGun2Image("guns/eva8.png");
            panel.changeTheColorOfSlot2(new Color(255,168,129));
            panel.changeTheColor2OfSlot2(new Color(169,9,0));
                break;
            case "Mastiff Shotgun":
             this.changeGun2Image("guns/mastiff.png");
            panel.changeTheColorOfSlot2(new Color(255,168,129));
            panel.changeTheColor2OfSlot2(new Color(169,9,0));
                break;
            case "Mozambique Shotgun":
             this.changeGun2ImageSpecial("guns/mozam.png");
            panel.changeTheColorOfSlot2(new Color(255,168,129));
            panel.changeTheColor2OfSlot2(new Color(169,9,0));
                break;
            case "Peacekeeper":
             this.changeGun2Image("guns/peacekeeper.png");
            panel.changeTheColorOfSlot2(new Color(255,168,129));
            panel.changeTheColor2OfSlot2(new Color(169,9,0));
                break;
            case "RE-45 Auto":
             this.changeGun2ImageSpecial("guns/re45.png");
             panel.changeTheColorOfSlot2(new Color(255,196,102));
            panel.changeTheColor2OfSlot2(new Color(156,77,28));
                break;
            case "P2020":
             this.changeGun2ImageSpecial("guns/p2020.png");
             panel.changeTheColorOfSlot2(new Color(255,196,102));
            panel.changeTheColor2OfSlot2(new Color(156,77,28));
                break;
            case "Wingman":
             this.changeGun2ImageSpecial("guns/wingman.png");
               panel.changeTheColorOfSlot2(new Color(248,3,74));
            panel.changeTheColor2OfSlot2(new Color(145,0,23));
                break;
            case "Charge Rifle":
             this.changeGun2ImageCR("guns/charge_rifle.png");
            panel.changeTheColorOfSlot2(new Color(140,143,240));
            panel.changeTheColor2OfSlot2(new Color(44,44,201));
                break;
            case "Longbow DMR":
             this.changeGun2Image("guns/longbow.png");
             panel.changeTheColorOfSlot2(new Color(140,143,240));
            panel.changeTheColor2OfSlot2(new Color(44,44,201));
                break;
            case "Kraber .50-Cal Sniper":
             this.changeGun2Image("guns/kraber.png");
               panel.changeTheColorOfSlot2(new Color(248,3,74));
            panel.changeTheColor2OfSlot2(new Color(145,0,23));
                break;
            case "Sentinel":
             this.changeGun2Image("guns/sentinal.png");
             panel.changeTheColorOfSlot2(new Color(140,143,240));
            panel.changeTheColor2OfSlot2(new Color(44,44,201));
                break;
        }
    }
}

package object;

import Main.GamePanel;
import entity.Entity;

public class OBJ_Heart extends Entity{
    
    public OBJ_Heart(GamePanel gp){

        super(gp);

        name = "Heart";
        image = setup("/res/objects/heart_full");
        image2 = setup("/res/objects/heart_half");
        image3 = setup("/res/objects/heart_blank");
    }
}
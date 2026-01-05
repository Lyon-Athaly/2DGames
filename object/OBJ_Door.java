package object;

import Main.GamePanel;
import entity.Entity;

public class OBJ_Door extends Entity{
    
    public OBJ_Door(GamePanel gp){

        super(gp);

        name = "Door";
        down1 = setup("/res/objects/door");
        collision = true;
    }
}
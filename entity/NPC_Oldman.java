package entity;

import java.awt.Rectangle;
import java.util.Random;

import Main.GamePanel;

public class NPC_Oldman extends Entity {

    
    
    public NPC_Oldman(GamePanel gp) {
        super(gp);

        direction = "down";
        speed = 1;

        getImage(); 
        setDialogue();
    }    

    public void getImage(){
        up1 = setup("/res/npc/oldman_up_1");
        up2 = setup("/res/npc/oldman_up_2");
        down1 = setup("/res/npc/oldman_down_1");
        down2 = setup("/res/npc/oldman_down_2");
        left1 = setup("/res/npc/oldman_left_1");
        left2 = setup("/res/npc/oldman_left_2");
        right1 = setup("/res/npc/oldman_right_1");
        right2 = setup("/res/npc/oldman_right_2");
    }

    public void setDialogue(){
        dialogues[0] = "Hello, Sid. \nSo you here huh.";
        dialogues[1] = "Can you kill the Demon Lord for me? \nIm too old for this";
        dialogues[2] = "I'll give you a reward after this";
    }

    public void setAction(){

        actionLockCounter++;
        if (actionLockCounter == 120){
            Random random = new Random();
            int i = random.nextInt(100)+1;

            if (i <= 25){
                direction = "up";
            }
            else if (i > 25 && i <= 50){
                direction = "down";
            }
            else if (i > 50 && i <= 75){
                direction = "left";
            }
            else if (i > 75 && i <= 100){
                direction = "right";
            }

            actionLockCounter = 0;
        }
    }

    public void speak(){
        super.speak();
    }
}

package Main;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyHandler implements KeyListener {
    GamePanel gp;
    public boolean upPressed, downPressed, leftPressed, rightPressed, enterPressed;
    
    //Debug
    boolean checkDrawTime = false;

    public KeyHandler(GamePanel gp){
        this.gp = gp;
    }

    @Override
    public void keyTyped(KeyEvent e) {
        // throw new UnsupportedOperationException("Unimplemented method 'keyTyped'");
    }

    @Override
    public void keyPressed(KeyEvent e) {
        
        int code = e.getKeyCode();

        // PLAY STATE
        if (gp.gameState == gp.playState) {
            if (code == KeyEvent.VK_W) {
                upPressed = true;
            }
            else if (code == KeyEvent.VK_S) {
                downPressed = true;
            }
            else if (code == KeyEvent.VK_A) {
                leftPressed = true;
            }
            else if (code == KeyEvent.VK_D) {
                rightPressed = true;
            }
            else if (code == KeyEvent.VK_P) {
                gp.gameState = gp.pauseState;
            }
            else if (code == KeyEvent.VK_ENTER) {
                enterPressed = true;
            }

            //Debug
            if(code == KeyEvent.VK_T){
                if(checkDrawTime == false){
                    checkDrawTime = true;
                }
                else if(checkDrawTime == true){
                    checkDrawTime = false;
                }
            }
        }
        // PAUSE STATE
        else if (gp.gameState == gp.pauseState) {
            if (code == KeyEvent.VK_P) {
                gp.gameState = gp.playState;
            }
        }
        // DIALOGUE STATE
        else if (gp.gameState == gp.dialogueState) {
            if (code == KeyEvent.VK_ENTER) {
                gp.gameState = gp.playState;
            }
        }
        

    }

    @Override
    public void keyReleased(KeyEvent e) {

        int code = e.getKeyCode();

        if (code == KeyEvent.VK_W) {
            upPressed = false;
        }
        else if (code == KeyEvent.VK_S) {
            downPressed = false;
        }
        else if (code == KeyEvent.VK_A) {
            leftPressed = false;
        }
        else if (code == KeyEvent.VK_D) {
            rightPressed = false;
        }
    }
    
}

package object;

import java.io.IOException;

import javax.imageio.ImageIO;

public class OBJ_Chess extends SuperObject {
    public OBJ_Chess(){

        name = "Chess";
        try{
            image = ImageIO.read(getClass().getResourceAsStream("/res/objects/chest.png"));

        } catch(IOException e){
            e.printStackTrace();
        }

    }
    
}

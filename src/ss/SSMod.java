package ss;

import mindustry.mod.*;
import ss.content.*;

public class SSMod extends Mod{

    @Override

    public void loadContent(){
        SSWalls.load();
        SSEffect.load();
    }

}

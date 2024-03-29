package ss.world.blocks.defense;

import arc.math.*;
import arc.util.*;
import mindustry.entities.*;
import mindustry.entities.bullet.*;
import mindustry.world.blocks.defense.*;

public class FragmentWall extends Wall {
    public BulletType shard;
    public @Nullable Effect destroyEffect;
    public int amount = 7;
    public float inaccuracy = 15f, distRand = 3f, velRand = 0.1f;

    public FragmentWall(String name){
        super(name);
    }

    public class FragmentWallBuild extends WallBuild {
        @Override
        public void onDestroyed() {
            if(destroyEffect != null) destroyEffect.at(this);
            for(int i = 0; i < amount; i++){
                shard.create(this, this.team,x + Mathf.random(-distRand, distRand),
                y + Mathf.random(-distRand, distRand),
                360f * i / (float)amount + Mathf.random(-inaccuracy, inaccuracy),
                0.8f + Mathf.random(-velRand, velRand),
                3f);
            }
            super.onDestroyed();
        }
    }
}
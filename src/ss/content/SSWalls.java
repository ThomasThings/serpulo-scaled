package ss.content;

import arc.graphics.Color;
import arc.graphics.g2d.Draw;
import arc.graphics.g2d.Fill;
import arc.math.Mathf;
import arc.util.Time;
import mindustry.content.Fx;
import mindustry.entities.Fires;
import mindustry.entities.bullet.ArtilleryBulletType;
import mindustry.entities.bullet.BasicBulletType;
import mindustry.entities.bullet.BulletType;
import mindustry.gen.Bullet;
import mindustry.type.*;
import mindustry.world.*;
import mindustry.world.blocks.defense.*;
import mindustry.content.Items;
import mindustry.world.meta.Env;
import ss.world.blocks.defense.FragmentWall;

import static mindustry.Vars.world;
import static mindustry.type.ItemStack.*;

public class SSWalls{
    public static Block

            refurbishedScrapWall, refurbishedScrapWallLarge, refurbishedScrapWallHuge, refurbishedScrapWallGigantic, refurbishedScrapWallColossol,
            copperWallHuge, copperWallGigantic, copperWallColossol,
            leadWall, leadWallLarge, leadWallHuge, leadWallGigantic, leadWallColossol,
            metaglassWall, metaglassWallLarge, metaglassWallHuge, metaglassWallGigantic, metaglassWallColossol,
            graphiteWall, graphiteWallLarge, graphiteWallHuge, graphiteWallGigantic, graphiteWallColossol,
            titaniumWallHuge, titaniumWallGigantic, titaniumWallColossol,
            siliconWall, siliconWallLarge, siliconWallHuge, siliconWallGigantic,
            plastaniumWallHuge, plastaniumWallGigantic,
            thoriumWallHuge, thoriumWallGigantic, thoriumWallColossol,
            scrapWallColossol,
            pyratiteWall, pyratiteWallLarge, pyratiteWallHuge, pyratiteWallGigantic,
            sporePodWall, sporePodWallLarge, sporePodWallHuge, sporePodWallGigantic,
            blastCompoundWall, blastCompoundWallLarge, blastCompoundWallHuge, blastCompoundWallGigantic,
            phaseWallHuge, phaseWallGigantic,
            surgeWallHuge, surgeWallGigantic,
            doorHuge, doorGigantic;

    public static void load(){

        int wallHealthMultiplier = 4;
        refurbishedScrapWall = new Wall("refurbished-scrap-wall"){{
            requirements(Category.defense, ItemStack.with(Items.scrap, 6));
            health = 45 * wallHealthMultiplier;
            envDisabled |= Env.scorching;
        }};
        refurbishedScrapWallLarge = new Wall("refurbished-scrap-wall-large"){{
            requirements(Category.defense, ItemStack.with(Items.scrap, 24));
            health = 45 * wallHealthMultiplier * 4;
            size = 2;
            envDisabled |= Env.scorching;
        }};
        refurbishedScrapWallHuge = new Wall("refurbished-scrap-wall-huge"){{
            requirements(Category.defense, ItemStack.with(Items.scrap, 54));
            health = 45 * wallHealthMultiplier * 9;
            size = 3;
            envDisabled |= Env.scorching;
        }};
        refurbishedScrapWallGigantic = new Wall("refurbished-scrap-wall-gigantic"){{
            requirements(Category.defense, ItemStack.with(Items.scrap, 96));
            health = 45 * wallHealthMultiplier * 16;
            size = 4;
            envDisabled |= Env.scorching;
        }};
        refurbishedScrapWallColossol = new Wall("refurbished-scrap-wall-colossol"){{
            requirements(Category.defense, ItemStack.with(Items.scrap, 150));
            health = 45 * wallHealthMultiplier * 25;
            size = 5;
            envDisabled |= Env.scorching;
        }};

        copperWallHuge = new Wall("copper-wall-huge"){{
            requirements(Category.defense, ItemStack.with(Items.copper, 54));
            health = 80 * wallHealthMultiplier * 9;
            size = 3;
            envDisabled |= Env.scorching;
        }};
        copperWallGigantic = new Wall("copper-wall-gigantic"){{
            requirements(Category.defense, ItemStack.with(Items.copper, 96));
            health = 80 * wallHealthMultiplier * 16;
            size = 4;
            envDisabled |= Env.scorching;
        }};
        copperWallColossol = new Wall("copper-wall-colossol"){{
            requirements(Category.defense, ItemStack.with(Items.copper, 150));
            health = 80 * wallHealthMultiplier * 25;
            size = 5;
            envDisabled |= Env.scorching;
        }};

        leadWall = new Wall("lead-wall"){{
            requirements(Category.defense, ItemStack.with(Items.lead, 5));
            health = 60 * wallHealthMultiplier;
            envDisabled |= Env.scorching;
        }};
        leadWallLarge = new Wall("lead-wall-large"){{
            requirements(Category.defense, ItemStack.with(Items.lead, 20));
            health = 60 * wallHealthMultiplier * 4;
            size = 2;
            envDisabled |= Env.scorching;
        }};
        leadWallHuge = new Wall("lead-wall-huge"){{
            requirements(Category.defense, ItemStack.with(Items.lead, 45));
            health = 60 * wallHealthMultiplier * 9;
            size = 3;
            envDisabled |= Env.scorching;
        }};
        leadWallGigantic = new Wall("lead-wall-gigantic"){{
            requirements(Category.defense, ItemStack.with(Items.lead, 80));
            health = 60 * wallHealthMultiplier * 16;
            size = 4;
            envDisabled |= Env.scorching;
        }};
        leadWallColossol = new Wall("lead-wall-colossol"){{
            requirements(Category.defense, ItemStack.with(Items.lead, 125));
            health = 60 * wallHealthMultiplier * 25;
            size = 5;
            envDisabled |= Env.scorching;
        }};

        metaglassWall = new Wall("metaglass-wall"){{
            requirements(Category.defense, with(Items.metaglass, 6));
            health = 85 * wallHealthMultiplier;
            absorbLasers = true;
            envDisabled |= Env.scorching;
        }};
        metaglassWallLarge = new Wall("metaglass-wall-large"){{
            requirements(Category.defense, with(Items.metaglass, 24));
            health = 85 * wallHealthMultiplier * 4;
            size = 2;
            absorbLasers = true;
            envDisabled |= Env.scorching;
        }};
        metaglassWallHuge = new Wall("metaglass-wall-huge"){{
            requirements(Category.defense, with(Items.metaglass, 54));
            health = 85 * wallHealthMultiplier * 9;
            size = 3;
            absorbLasers = true;
            envDisabled |= Env.scorching;
        }};
        metaglassWallGigantic = new Wall("metaglass-wall-gigantic"){{
            requirements(Category.defense, with(Items.metaglass, 96));
            health = 85 * wallHealthMultiplier * 16;
            size = 4;
            absorbLasers = true;
            envDisabled |= Env.scorching;
        }};
        metaglassWallColossol = new Wall("metaglass-wall-colossol"){{
            requirements(Category.defense, ItemStack.with(Items.scrap, 150));
            health = 85 * wallHealthMultiplier * 25;
            size = 5;
            envDisabled |= Env.scorching;
        }};

        graphiteWall = new Wall("graphite-wall"){{
            requirements(Category.defense, with(Items.graphite, 6));
            health = 95 * wallHealthMultiplier;
            insulated = true;
            schematicPriority = 10;
            envDisabled |= Env.scorching;
        }};
        graphiteWallLarge = new Wall("graphite-wall-large"){{
            requirements(Category.defense, with(Items.graphite, 24));
            health = 95 * wallHealthMultiplier * 9;
            size = 2;
            insulated = true;
            schematicPriority = 10;
            envDisabled |= Env.scorching;
        }};
        graphiteWallHuge = new Wall("graphite-wall-huge"){{
            requirements(Category.defense, with(Items.graphite, 54));
            health = 95 * wallHealthMultiplier * 9;
            size = 3;
            insulated = true;
            schematicPriority = 10;
            envDisabled |= Env.scorching;
        }};
        graphiteWallGigantic = new Wall("graphite-wall-gigantic"){{
            requirements(Category.defense, with(Items.graphite, 96));
            health = 95 * wallHealthMultiplier * 16;
            size = 4;
            insulated = true;
            schematicPriority = 10;
            envDisabled |= Env.scorching;
        }};
        graphiteWallColossol = new Wall("graphite-wall-colossol"){{
            requirements(Category.defense, ItemStack.with(Items.graphite, 150));
            health = 96 * wallHealthMultiplier * 25;
            size = 5;
            envDisabled |= Env.scorching;
        }};

        titaniumWallHuge = new Wall("titanium-wall-huge"){{
            requirements(Category.defense, ItemStack.with(Items.titanium, 54));
            health = 110 * wallHealthMultiplier * 9;
            size = 3;
            envDisabled |= Env.scorching;
        }};
        titaniumWallGigantic = new Wall("titanium-wall-gigantic"){{
            requirements(Category.defense, ItemStack.with(Items.titanium, 96));
            health = 110 * wallHealthMultiplier * 16;
            size = 4;
            envDisabled |= Env.scorching;
        }};
        titaniumWallColossol = new Wall("titanium-wall-colossol"){{
            requirements(Category.defense, ItemStack.with(Items.titanium, 150));
            health = 110 * wallHealthMultiplier * 25;
            size = 5;
            envDisabled |= Env.scorching;
        }};

        siliconWall = new Wall("silicon-wall"){{
            requirements(Category.defense, with(Items.silicon, 6));
            health = 90 * wallHealthMultiplier;
            insulated = true;
            schematicPriority = 10;
            lightningChance = 0.025f;
            lightningDamage = 5f;
            lightningColor = Color.valueOf("d6edff");
            envDisabled |= Env.scorching;
        }};
        siliconWallLarge = new Wall("silicon-wall-large"){{
            requirements(Category.defense, with(Items.silicon, 24));
            health = 90 * wallHealthMultiplier * 4;
            size = 2;
            insulated = true;
            schematicPriority = 10;
            lightningChance = 0.025f;
            lightningDamage = 5f;
            lightningColor = Color.valueOf("d6edff");
            envDisabled |= Env.scorching;
        }};
        siliconWallHuge = new Wall("silicon-wall-huge"){{
            requirements(Category.defense, with(Items.silicon, 54));
            health = 90 * wallHealthMultiplier * 9;
            size = 3;
            insulated = true;
            schematicPriority = 10;
            lightningChance = 0.025f;
            lightningDamage = 5f;
            lightningColor = Color.valueOf("d6edff");
            envDisabled |= Env.scorching;
        }};
        siliconWallGigantic = new Wall("silicon-wall-gigantic"){{
            requirements(Category.defense, with(Items.silicon, 96));
            health = 90 * wallHealthMultiplier * 16;
            size = 4;
            insulated = true;
            schematicPriority = 10;
            lightningChance = 0.025f;
            lightningDamage = 5f;
            lightningColor = Color.valueOf("d6edff");
            envDisabled |= Env.scorching;
        }};

        plastaniumWallHuge = new Wall("plastanium-wall-huge"){{
            requirements(Category.defense, ItemStack.with(Items.plastanium, 45, Items.metaglass, 18));
            health = 125 * wallHealthMultiplier * 9;
            size = 3;
            insulated = true;
            absorbLasers = true;
            schematicPriority = 10;
            envDisabled |= Env.scorching;
        }};
        plastaniumWallGigantic = new Wall("plastanium-wall-gigantic"){{
            requirements(Category.defense, ItemStack.with(Items.plastanium, 80, Items.metaglass, 32));
            health = 125 * wallHealthMultiplier * 16;
            size = 4;
            insulated = true;
            absorbLasers = true;
            schematicPriority = 10;
            envDisabled |= Env.scorching;
        }};

        thoriumWallHuge = new Wall("thorium-wall-huge"){{
            requirements(Category.defense, ItemStack.with(Items.thorium, 54));
            health = 200 * wallHealthMultiplier * 9;
            size = 3;
            envDisabled |= Env.scorching;
        }};
        thoriumWallGigantic = new Wall("thorium-wall-gigantic"){{
            requirements(Category.defense, ItemStack.with(Items.thorium, 96));
            health = 200 * wallHealthMultiplier * 16;
            size = 4;
            envDisabled |= Env.scorching;
        }};
        thoriumWallColossol = new Wall("thorium-wall-colossol"){{
            requirements(Category.defense, ItemStack.with(Items.thorium, 150));
            health = 200 * wallHealthMultiplier * 25;
            size = 5;
            envDisabled |= Env.scorching;
        }};

        scrapWallColossol = new Wall("scrap-wall-colossol"){{
            requirements(Category.defense, ItemStack.with(Items.graphite, 150));
            health = 60 * wallHealthMultiplier * 25;
            size = 5;
            envDisabled |= Env.scorching;
        }};

        BulletType colorFireball= new BulletType(1f, 4){
            {
                pierce = true;
                collidesTiles = false;
                collides = false;
                drag = 0.03f;
                hitEffect = despawnEffect = Fx.none;
            }

            @Override
            public void init(Bullet b){
                b.vel.setLength(0.6f + Mathf.random(2f));
                if(!(b.data instanceof Item)) b.data(Items.coal);
            }

            @Override
            public void draw(Bullet b){
                Color gray = Color.orange;
                Fill.circle(b.x, b.y, 3f * b.fout());
                Draw.reset();
            }

            @Override
            public void update(Bullet b){
                if(Mathf.chance(0.04 * Time.delta)){
                    Tile tile = world.tileWorld(b.x, b.y);
                    if(tile != null){
                        Fires.create(tile);
                    }
                }

                if(Mathf.chance(0.1 * Time.delta)){
                    Fx.fireballsmoke.at(b.x, b.y);
                }
            }
        };

        pyratiteWall = new FragmentWall("pyratite-wall"){{
            shard = colorFireball;
            amount = 8;
            inaccuracy = 180f;
            health = 300;
            size = 1;
            distRand = 6.5f;
            requirements(Category.defense, with(Items.pyratite, 6));
        }};

        phaseWallHuge = new Wall("phase-wall-huge"){{
            requirements(Category.defense, ItemStack.with(Items.phaseFabric, 54));
            health = 150 * wallHealthMultiplier * 9;
            size = 3;
            chanceDeflect = 10f;
            flashHit = true;
            envDisabled |= Env.scorching;
        }};
        phaseWallGigantic = new Wall("phase-wall-gigantic"){{
            requirements(Category.defense, ItemStack.with(Items.phaseFabric, 96));
            health = 150 * wallHealthMultiplier * 16;
            size = 4;
            chanceDeflect = 10f;
            flashHit = true;
            envDisabled |= Env.scorching;
        }};

        surgeWallHuge = new Wall("surge-wall-huge"){{
            requirements(Category.defense, ItemStack.with(Items.surgeAlloy, 54));
            health = 230 * wallHealthMultiplier * 9;
            size = 3;
            lightningChance = 0.05f;
            envDisabled |= Env.scorching;
        }};
        surgeWallGigantic = new Wall("surge-wall-gigantic"){{
            requirements(Category.defense, ItemStack.with(Items.surgeAlloy, 96));
            health = 230 * wallHealthMultiplier * 16;
            size = 4;
            lightningChance = 0.05f;
            envDisabled |= Env.scorching;
        }};

        doorHuge = new Door("door-huge"){{
            requirements(Category.defense, ItemStack.with(Items.titanium, 54, Items.silicon, 36));
            openfx = Fx.dooropen;
            closefx = Fx.doorclose;
            health = 100 * wallHealthMultiplier * 9;
            size = 3;
            envDisabled |= Env.scorching;
        }};
        doorGigantic = new Door("door-gigantic"){{
            requirements(Category.defense, ItemStack.with(Items.titanium, 96, Items.silicon, 64));
            openfx = Fx.dooropen;
            closefx = Fx.doorclose;
            health = 100 * wallHealthMultiplier * 16;
            size = 4;
            envDisabled |= Env.scorching;
        }};
    }
}

package ss.content;

import mindustry.content.Fx;
import mindustry.type.*;
import mindustry.world.*;
import mindustry.world.blocks.defense.*;
import mindustry.content.Items;
import mindustry.world.meta.Env;

import static mindustry.type.ItemStack.*;

public class SSWalls{
    public static Block
            copperWallHuge, copperWallGigantic,
            leadWall, leadWallLarge, leadWallHuge, leadWallGigantic,
            metaglassWall, metaglassWallLarge, metaglassWallHuge, metaglassWallGigantic,
            graphiteWall, graphiteWallLarge, graphiteWallHuge, graphiteWallGigantic,
            titaniumWallHuge, titaniumWallGigantic,
            plastaniumWallHuge, plastaniumWallGigantic,
            thoriumWallHuge, thoriumWallGigantic,
            phaseWallHuge, phaseWallGigantic,
            surgeWallHuge, surgeWallGigantic,
            doorHuge, doorGigantic;

    public static void load(){

        int wallHealthMultiplier = 4;
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
            size = 2;
            envDisabled |= Env.scorching;
        }};
        leadWallGigantic = new Wall("lead-wall-gigantic"){{
            requirements(Category.defense, ItemStack.with(Items.lead, 80));
            health = 60 * wallHealthMultiplier * 16;
            size = 2;
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
        graphiteWall = new Wall("graphite-wall"){{
            requirements(Category.defense, with(Items.graphite, 6));
            health = 95 * wallHealthMultiplier;
            insulated = true;
            schematicPriority = 10;
            envDisabled |= Env.scorching;
        }};
        graphiteWallLarge = new Wall("graphite-wall-large"){{
            requirements(Category.defense, with(Items.graphite, 24));
            health = 95 * wallHealthMultiplier * 95;
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
            openfx = Fx.dooropenlarge;
            closefx = Fx.doorcloselarge;
            health = 100 * wallHealthMultiplier * 9;
            size = 3;
            envDisabled |= Env.scorching;
        }};
        doorHuge = new Door("door-huge"){{
            requirements(Category.defense, ItemStack.with(Items.titanium, 96, Items.silicon, 64));
            openfx = Fx.dooropenlarge;
            closefx = Fx.doorcloselarge;
            health = 100 * wallHealthMultiplier * 16;
            size = 4;
            envDisabled |= Env.scorching;
        }};
    }
}

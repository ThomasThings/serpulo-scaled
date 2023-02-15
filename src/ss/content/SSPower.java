package ss.content;

import mindustry.type.*;
import mindustry.world.*;
import mindustry.content.*;
import mindustry.world.blocks.power.Battery;
import mindustry.world.blocks.power.PowerDiode;
import mindustry.world.blocks.power.PowerNode;
import mindustry.world.blocks.storage.StorageBlock;

import static mindustry.type.ItemStack.*;

public class SSPower{
    public static Block
            networkPowerNode, golliathNode,
            multiCellBattey, batteryBank, failsafeBattery,
            nodeTower, surgeSubstation, surgeBeacon,
            rectifier, kilaampRectifier;
    public static void load() {

        //nodes
        networkPowerNode = new PowerNode("network-power-node"){{
            requirements(Category.power, with(Items.titanium, 15, Items.silicon, 15, Items.surgeAlloy, 10));
            size = 3;
            maxNodes = 25;
            laserRange = 28f;
        }};
        golliathNode = new PowerNode("golliath-node"){{
            requirements(Category.power, with(Items.plastanium, 35, Items.silicon, 80, Items.surgeAlloy, 30));
            size = 4;
            maxNodes = 25;
            laserRange = 40f;
        }};

        //batteries
        multiCellBattey = new Battery("multi-cell-battery"){{
            requirements(Category.power, with(Items.copper, 15, Items.lead, 25, Items.silicon, 10));
            size = 2;
            consumePowerBuffered(18000f);
            baseExplosiveness = 2f;
        }};
        batteryBank = new Battery("battery-bank"){{
            requirements(Category.power, with(Items.titanium, 80, Items.lead, 120, Items.silicon, 100, Items.plastanium, 40));
            size = 4;
            consumePowerBuffered(200000f);
            baseExplosiveness = 5f;
        }};
        failsafeBattery = new Battery("failsafe-battery"){{
            requirements(Category.power, with(Items.titanium, 180, Items.lead, 250, Items.silicon, 300, Items.surgeAlloy, 150));
            size = 5;
            consumePowerBuffered(5000000f);
            baseExplosiveness = 5f;
        }};

        //towers
        nodeTower = new PowerNode("node-tower"){{
            requirements(Category.power, with(Items.titanium, 5, Items.lead, 5, Items.silicon, 5));
            maxNodes = 2;
            laserRange = 18f;
            schematicPriority = -15;
        }};
        surgeSubstation = new PowerNode("surge-substation"){{
            requirements(Category.power, with(Items.titanium, 20, Items.lead, 80, Items.silicon, 50, Items.surgeAlloy, 25));
            size = 3;
            maxNodes = 3;
            laserRange = 80f;
            schematicPriority = -15;
        }};
        surgeBeacon = new PowerNode("surge-beacon"){{
            requirements(Category.power, with(Items.titanium, 150, Items.plastanium, 120, Items.silicon, 150, Items.surgeAlloy, 60));
            size = 4;
            maxNodes = 5;
            laserRange = 180f;
            schematicPriority = -15;
        }};

        //diodes
        rectifier = new PowerDiode("rectifier"){{
            requirements(Category.power, with(Items.silicon, 20, Items.plastanium, 20, Items.metaglass, 15));
            size = 2;
        }};
        kilaampRectifier = new PowerDiode("kilaamp-rectifier"){{
            requirements(Category.power, with(Items.silicon, 45, Items.plastanium, 25, Items.surgeAlloy, 15));
            size = 3;
        }};
    }
}

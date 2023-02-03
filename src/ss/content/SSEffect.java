package ss.content;

import arc.graphics.Color;
import mindustry.content.Fx;
import mindustry.type.*;
import mindustry.world.*;
import mindustry.world.blocks.defense.*;
import mindustry.content.Items;
import mindustry.world.meta.Env;

import static mindustry.type.ItemStack.*;

public class SSEffect{
    public static Block

            mendDome, mendingSphere, mendFieldProjector,
            overdriver, overdrivingSphere, overdriveFieldProjector;

    public static void load(){

        mendDome = new MendProjector("mend-dome"){{
            requirements(Category.effect, with(Items.lead, 180, Items.titanium, 80, Items.plastanium, 100, Items.silicon, 140));
            consumePower(3f);
            size = 3;
            reload = 300f;
            range = 140f;
            healPercent = 15f;
            phaseBoost = 15f;
            scaledHealth = 80;
            consumeItems(with(Items.phaseFabric, 1, Items.silicon, 1));
        }};
        mendingSphere = new MendProjector("mending-sphere"){{
            requirements(Category.effect, with(Items.lead, 280, Items.plastanium, 180, Items.silicon, 200, Items.phaseFabric, 100));
            consumePower(7f);
            size = 4;
            reload = 300f;
            range = 85f;
            healPercent = 20f;
            phaseBoost = 20f;
            scaledHealth = 80;
            consumeItems(with(Items.phaseFabric, 1, Items.silicon, 1));
        }};
        mendFieldProjector = new MendProjector("mend-field-projector"){{
            requirements(Category.effect, with(Items.titanium, 350, Items.plastanium, 230, Items.silicon, 425, Items.phaseFabric, 200, Items.surgeAlloy, 180));
            consumePower(12f);
            size = 5;
            reload = 330f;
            range = 240f;
            healPercent = 30f;
            phaseBoost = 35f;
            scaledHealth = 80;
            consumeItems(with(Items.phaseFabric, 5, Items.silicon, 5));
        }};
        overdriver = new OverdriveProjector("overdriver"){{
            requirements(Category.effect, with(Items.lead, 20, Items.titanium, 25, Items.silicon, 15));
            consumePower(1.2f);
            range = 200f;
            speedBoost = 1.1f;
            useTime = 300f;
            hasBoost = false;
            hasItems = false;
        }};
        overdrivingSphere = new OverdriveProjector("overdriving-sphere"){{
            requirements(Category.effect, with(Items.lead, 250, Items.titanium, 350, Items.silicon, 275, Items.plastanium, 170, Items.surgeAlloy, 250));
            consumePower(15f);
            size = 4;
            range = 350f;
            speedBoost = 2.5f;
            useTime = 600f;
            hasBoost = false;
            consumeItems(with(Items.phaseFabric, 2, Items.silicon, 3));
        }};
        overdriveFieldProjector = new OverdriveProjector("overdrive-field-projector"){{
            requirements(Category.effect, with(Items.titanium, 400, Items.phaseFabric, 150, Items.silicon, 275, Items.plastanium, 2200, Items.surgeAlloy, 300));
            consumePower(22f);
            size = 5;
            range = 450f;
            speedBoost = 3.5f;
            useTime = 600f;
            hasBoost = false;
            consumeItems(with(Items.phaseFabric, 5, Items.silicon, 5));
        }};
    }
}

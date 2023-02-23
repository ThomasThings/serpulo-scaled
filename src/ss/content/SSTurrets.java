package ss.content;

import arc.graphics.Color;
import mindustry.content.Fx;
import mindustry.content.StatusEffects;
import mindustry.entities.bullet.ArtilleryBulletType;
import mindustry.entities.bullet.BasicBulletType;
import mindustry.entities.pattern.ShootAlternate;
import mindustry.entities.pattern.ShootBarrel;
import mindustry.gen.Sounds;
import mindustry.graphics.Pal;
import mindustry.type.*;
import mindustry.world.*;
import mindustry.world.blocks.defense.*;
import mindustry.content.Items;
import mindustry.world.blocks.defense.turrets.ItemTurret;
import mindustry.world.meta.Env;

import static mindustry.type.ItemStack.*;

public class SSTurrets{
    public static Block
            dyad, trifecta,
            sleet, meteor;

    public static void load(){

        dyad = new ItemTurret("dyad"){{
            requirements(Category.turret, with(Items.copper, 80, Items.graphite, 40));
            ammo(
                    Items.copper,  new BasicBulletType(2.7f, 12){{
                        width = 7f;
                        height = 9f;
                        lifetime = 60f;
                        ammoMultiplier = 2;
                    }},
                    Items.graphite, new BasicBulletType(3.7f, 25){{
                        width = 9f;
                        height = 12f;
                        reloadMultiplier = 0.6f;
                        ammoMultiplier = 4;
                        lifetime = 60f;
                    }},
                    Items.silicon, new BasicBulletType(3.2f, 20){{
                        width = 7f;
                        height = 9f;
                        homingPower = 0.1f;
                        reloadMultiplier = 1.5f;
                        ammoMultiplier = 5;
                        lifetime = 60f;
                    }}
            );

            shoot = new ShootAlternate(11.5f);

            shootY = 7f;
            reload = 20f;
            range = 190;
            size = 2;
            shootCone = 12f;
            ammoUseEffect = Fx.casing2;
            inaccuracy = 2f;
            rotateSpeed = 9f;
            coolant = consumeCoolant(0.15f);
            researchCostMultiplier = 0.5f;

            limitRange();
        }};
        trifecta = new ItemTurret("trifecta"){{
            requirements(Category.turret, with(Items.copper, 200, Items.graphite, 150, Items.titanium, 120));
            ammo(
                    Items.copper,  new BasicBulletType(2.7f, 25){{
                        width = 7f;
                        height = 9f;
                        lifetime = 80f;
                        ammoMultiplier = 2;
                    }},
                    Items.graphite, new BasicBulletType(3.7f, 35){{
                        width = 9f;
                        height = 12f;
                        reloadMultiplier = 0.6f;
                        ammoMultiplier = 4;
                        lifetime = 80f;
                    }},
                    Items.silicon, new BasicBulletType(3.2f, 25){{
                        width = 7f;
                        height = 9f;
                        homingPower = 0.1f;
                        reloadMultiplier = 1.5f;
                        ammoMultiplier = 5;
                        lifetime = 90f;
                    }},
                    Items.titanium, new BasicBulletType(3.5f, 40){{
                        width = 9f;
                        height = 12f;
                        reloadMultiplier = 0.6f;
                        ammoMultiplier = 4;
                        lifetime = 80f;
                    }}
            );

            shootY = 10;
            shoot = new ShootBarrel(){{
                barrels = new float[]{
                        0f, 3f, 0f,
                        7f, 0f, 0f,
                        -7f, 0f, 0f,
                };
            }};

            reload = 10f;
            range = 190;
            size = 3;
            shootCone = 12f;
            ammoUseEffect = Fx.casing2;
            inaccuracy = 2f;
            rotateSpeed = 9f;
            coolant = consumeCoolant(0.25f);

            limitRange();
        }};

        sleet = new ItemTurret("sleet"){{
            requirements(Category.turret, with(Items.copper, 120, Items.graphite, 50));
            ammo(
                    Items.graphite, new ArtilleryBulletType(3f, 25){{
                        knockback = 0.8f;
                        lifetime = 80f;
                        width = height = 13f;
                        collidesTiles = false;
                        splashDamageRadius = 25f * 0.75f;
                        splashDamage = 45f;
                    }},
                    Items.silicon, new ArtilleryBulletType(5f, 25){{
                        knockback = 0.8f;
                        lifetime = 70f;
                        width = height = 13f;
                        collidesTiles = false;
                        splashDamageRadius = 25f * 0.75f;
                        splashDamage = 45f;
                        reloadMultiplier = 1.2f;
                        ammoMultiplier = 3f;
                        homingPower = 0.08f;
                        homingRange = 50f;
                    }},
                    Items.pyratite, new ArtilleryBulletType(3f, 35){{
                        hitEffect = Fx.blastExplosion;
                        knockback = 0.8f;
                        lifetime = 80f;
                        width = height = 15f;
                        collidesTiles = false;
                        splashDamageRadius = 25f * 0.75f;
                        splashDamage = 55f;
                        status = StatusEffects.burning;
                        statusDuration = 60f * 12f;
                        frontColor = Pal.lightishOrange;
                        backColor = Pal.lightOrange;
                        makeFire = true;
                        trailEffect = Fx.incendTrail;
                        ammoMultiplier = 4f;
                    }},
                    Items.blastCompound, new ArtilleryBulletType(3f, 35){{
                        hitEffect = Fx.blastExplosion;
                        knockback = 1.2f;
                        lifetime = 80f;
                        width = height = 15f;
                        collidesTiles = false;
                        splashDamageRadius = 25f * 0.75f;
                        splashDamage = 65f;
                        status = StatusEffects.blasted;
                        statusDuration = 60f * 12f;
                        frontColor = Color.valueOf("e58956");
                        backColor = Color.valueOf("ffd2ae");
                        makeFire = true;
                        trailEffect = Fx.incendTrail;
                        ammoMultiplier = 4f;
                    }}
            );

            shootY = 7.5f;
            targetAir = false;
            reload = 75f;
            size = 2;
            recoil = 2f;
            range = 260f;
            inaccuracy = 1f;
            shootCone = 10f;
            shootSound = Sounds.bang;
            coolant = consumeCoolant(0.15f);
            limitRange(0f);
        }};
        meteor = new ItemTurret("meteor"){{
            requirements(Category.turret, with(Items.copper, 100, Items.graphite, 250, Items.titanium, 100));
            ammo(
                    Items.graphite, new ArtilleryBulletType(3f, 25){{
                        knockback = 0.8f;
                        lifetime = 90f;
                        width = height = 18f;
                        collidesTiles = false;
                        splashDamageRadius = 25f * 0.75f;
                        splashDamage = 80f;
                    }},
                    Items.silicon, new ArtilleryBulletType(5f, 25){{
                        knockback = 0.8f;
                        lifetime = 75f;
                        width = height = 18f;
                        collidesTiles = false;
                        splashDamageRadius = 25f * 0.75f;
                        splashDamage = 80f;
                        reloadMultiplier = 1.2f;
                        ammoMultiplier = 3f;
                        homingPower = 0.08f;
                        homingRange = 50f;
                    }},
                    Items.pyratite, new ArtilleryBulletType(3f, 35){{
                        hitEffect = Fx.blastExplosion;
                        knockback = 0.8f;
                        lifetime = 90f;
                        width = height = 20f;
                        collidesTiles = false;
                        splashDamageRadius = 25f * 0.75f;
                        splashDamage = 80f;
                        status = StatusEffects.burning;
                        statusDuration = 60f * 12f;
                        frontColor = Pal.lightishOrange;
                        backColor = Pal.lightOrange;
                        makeFire = true;
                        trailEffect = Fx.incendTrail;
                        ammoMultiplier = 2f;
                    }},
                    Items.blastCompound, new ArtilleryBulletType(3f, 35){{
                        hitEffect = Fx.blastExplosion;
                        knockback = 1.2f;
                        lifetime = 90f;
                        width = height = 20f;
                        collidesTiles = false;
                        splashDamageRadius = 25f * 0.75f;
                        splashDamage = 110f;
                        status = StatusEffects.blasted;
                        statusDuration = 60f * 12f;
                        frontColor = Color.valueOf("e58956");
                        backColor = Color.valueOf("ffd2ae");
                        makeFire = true;
                        trailEffect = Fx.incendTrail;
                        ammoMultiplier = 2f;
                    }}
            );

            shootY = 7.5f;
            targetAir = false;
            reload = 75f;
            size = 3;
            recoil = 4f;
            range = 320f;
            inaccuracy = 1f;
            shootCone = 10f;
            shootSound = Sounds.bang;
            coolant = consumeCoolant(0.25f);
            limitRange(0f);
        }};
    }
}

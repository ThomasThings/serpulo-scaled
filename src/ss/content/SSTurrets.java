package ss.content;

import arc.graphics.Color;
import mindustry.content.Fx;
import mindustry.content.StatusEffects;
import mindustry.entities.bullet.ArtilleryBulletType;
import mindustry.entities.bullet.BasicBulletType;
import mindustry.entities.bullet.BulletType;
import mindustry.entities.bullet.LightningBulletType;
import mindustry.entities.part.RegionPart;
import mindustry.entities.pattern.ShootAlternate;
import mindustry.entities.pattern.ShootBarrel;
import mindustry.gen.Sounds;
import mindustry.graphics.Pal;
import mindustry.type.*;
import mindustry.world.*;
import mindustry.world.blocks.defense.*;
import mindustry.content.Items;
import mindustry.world.blocks.defense.turrets.ItemTurret;
import mindustry.world.blocks.defense.turrets.PowerTurret;
import mindustry.world.draw.DrawTurret;
import mindustry.world.meta.Env;

import static mindustry.type.ItemStack.*;

public class SSTurrets{
    public static Block
            /*duo*/ binary, tetra,
            /*duo*/ inferno, hellfire,
            /*duo*/ sleet, meteor,
            /*duo*/ discharge, cumulos;

    public static void load(){

        binary = new ItemTurret("binary"){{
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
                        reloadMultiplier = 0.8f;
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

            shoot = new ShootAlternate(4f);

            recoils = 2;
            drawer = new DrawTurret(){{
                parts.add(new RegionPart("-barrel-l"){{
                    progress = PartProgress.recoil;
                    recoilIndex = 0;
                    under = true;
                    moveY = -1.5f;
                }});
                parts.add(new RegionPart("-barrel-r"){{
                    progress = PartProgress.recoil;
                    recoilIndex = 1;
                    under = true;
                    moveY = -1.5f;
                }});
                parts.add(new RegionPart("-top"){{
                }});
            }};
            recoil = 0.8f;

            shootY = 7f;
            reload = 20f;
            range = 190;
            size = 2;
            shootCone = 12f;
            ammoUseEffect = Fx.casing2;
            inaccuracy = 2f;
            rotateSpeed = 8f;
            coolant = consumeCoolant(0.15f);
            researchCostMultiplier = 0.5f;

            limitRange();
        }};
        tetra = new ItemTurret("tetra"){{
            requirements(Category.turret, with(Items.copper, 200, Items.graphite, 150, Items.titanium, 120));
            ammo(
                    Items.copper,  new BasicBulletType(2.7f, 25){{
                        width = 8f;
                        height = 12f;
                        lifetime = 80f;
                        ammoMultiplier = 2;
                    }},
                    Items.graphite, new BasicBulletType(3.7f, 35){{
                        width = 10f;
                        height = 16f;
                        reloadMultiplier = 0.9f;
                        ammoMultiplier = 4;
                        lifetime = 80f;
                    }},
                    Items.silicon, new BasicBulletType(3.2f, 25){{
                        width = 8f;
                        height = 12f;
                        homingPower = 0.1f;
                        reloadMultiplier = 1.5f;
                        ammoMultiplier = 5;
                        lifetime = 90f;
                    }},
                    Items.titanium, new BasicBulletType(3.5f, 40){{
                        width = 10f;
                        height = 16f;
                        reloadMultiplier = 0.9f;
                        ammoMultiplier = 4;
                        lifetime = 80f;
                    }}
            );

            shootY = 5.75f;
            shoot = new ShootBarrel(){{
                barrels = new float[]{
                        -7, 0f, 0,
                        -3, 5.25f, 0,
                        3, 5.25f, 0,
                        7, 0f, 0
                };
            }};

            recoils = 4;
            drawer = new DrawTurret(){{
                parts.add(new RegionPart("-barrel-low-l"){{
                    progress = PartProgress.recoil;
                    recoilIndex = 0;
                    under = true;
                    moveY = -2f;
                }});
                parts.add(new RegionPart("-barrel-high-r"){{
                    progress = PartProgress.recoil;
                    recoilIndex = 1;
                    under = true;
                    moveY = -2f;
                }});
                parts.add(new RegionPart("-barrel-high-l"){{
                    progress = PartProgress.recoil;
                    recoilIndex = 2;
                    under = true;
                    moveY = -2f;
                }});
                parts.add(new RegionPart("-barrel-low-r"){{
                    progress = PartProgress.recoil;
                    recoilIndex = 3;
                    under = true;
                    moveY = -2f;
                }});
                parts.add(new RegionPart("-back"){{
                    progress = PartProgress.warmup;
                    recoilIndex = 3;
                    under = true;
                    moveY = -1f;
                    moveRot = 10;
                    mirror = true;
                    moves.add(new PartMove(PartProgress.recoil, 0f, -1f, 0f));
                }});
                parts.add(new RegionPart("-top"){{
                }});
            }};
            recoil = 1;

            reload = 10f;
            range = 190;
            size = 3;
            shootCone = 12f;
            ammoUseEffect = Fx.casing2;
            inaccuracy = 2f;
            rotateSpeed = 6f;
            coolant = consumeCoolant(0.25f);

            limitRange();
        }};

        inferno = new ItemTurret("inferno"){{
            requirements(Category.turret, with(Items.copper, 25, Items.graphite, 22));
            ammo(
                    Items.coal, new BulletType(3.35f, 17f){{
                        ammoMultiplier = 3f;
                        hitSize = 12f;
                        lifetime = 27f;
                        pierce = true;
                        collidesAir = false;
                        statusDuration = 60f * 5;
                        shootEffect = Fx.shootSmallFlame;
                        hitEffect = Fx.hitFlameSmall;
                        despawnEffect = Fx.none;
                        status = StatusEffects.burning;
                        keepVelocity = false;
                        hittable = false;
                    }},
                    Items.pyratite, new BulletType(4f, 60f){{
                        ammoMultiplier = 6f;
                        hitSize = 7f;
                        lifetime = 18f;
                        pierce = true;
                        collidesAir = false;
                        statusDuration = 60f * 10;
                        shootEffect = Fx.shootPyraFlame;
                        hitEffect = Fx.hitFlameSmall;
                        despawnEffect = Fx.none;
                        status = StatusEffects.burning;
                        hittable = false;
                    }}
            );
            recoil = 0f;
            reload = 6f;
            coolantMultiplier = 1.5f;
            range = 60f;
            shootCone = 50f;
            targetAir = false;
            ammoUseEffect = Fx.none;
            health = 400;
            shootSound = Sounds.flame;
            coolant = consumeCoolant(0.1f);
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
                        frontColor = Color.valueOf("ffd2ae");
                        backColor = Color.valueOf("e58956");
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
                        splashDamage = 100f;
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
                        homingRange = 90f;
                    }},
                    Items.pyratite, new ArtilleryBulletType(3f, 35){{
                        hitEffect = Fx.blastExplosion;
                        knockback = 0.8f;
                        lifetime = 90f;
                        width = height = 20f;
                        collidesTiles = false;
                        splashDamageRadius = 25f * 0.75f;
                        splashDamage = 90f;
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
                        splashDamage = 140f;
                        status = StatusEffects.blasted;
                        statusDuration = 60f * 12f;
                        frontColor = Color.valueOf("ffd2ae");
                        backColor = Color.valueOf("e58956");
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

        discharge = new PowerTurret("discharge"){{
            requirements(Category.turret, with(Items.copper, 100, Items.lead, 120, Items.silicon, 50));
            shootType = new LightningBulletType(){{
                damage = 30;
                lightningLength = 45;
                lightning = 4;
                collidesAir = false;
                ammoMultiplier = 1f;

                buildingDamageMultiplier = 0.35f;

                lightningType = new BulletType(0.0001f, 0f){{
                    lifetime = Fx.lightning.lifetime;
                    hitEffect = Fx.hitLancer;
                    despawnEffect = Fx.none;
                    status = StatusEffects.shocked;
                    statusDuration = 10f;
                    hittable = false;
                    lightColor = Color.white;
                    collidesAir = false;
                    buildingDamageMultiplier = 0.25f;
                }};
            }};
            reload = 25f;
            shootCone = 40f;
            rotateSpeed = 6.5f;
            targetAir = false;
            range = 150f;
            shootEffect = Fx.lightningShoot;
            heatColor = Color.red;
            recoil = 1f;
            size = 2;
            shootSound = Sounds.spark;
            consumePower(5.3f);
            coolant = consumeCoolant(0.2f);
        }};
        cumulos = new PowerTurret("cumulos"){{
            requirements(Category.turret, with(Items.titanium, 140, Items.lead, 220, Items.silicon, 180, Items.plastanium, 80));
            shootType = new LightningBulletType(){{
                damage = 100;
                lightningLength = 70;
                lightning = 10;
                collidesAir = false;
                ammoMultiplier = 1f;

                buildingDamageMultiplier = 0.75f;

                lightningType = new BulletType(0.0001f, 0f){{
                    lifetime = Fx.lightning.lifetime;
                    hitEffect = Fx.hitLancer;
                    despawnEffect = Fx.none;
                    status = StatusEffects.shocked;
                    statusDuration = 10f;
                    hittable = false;
                    lightColor = Color.white;
                    collidesAir = false;
                    buildingDamageMultiplier = 0.25f;
                }};
            }};
            reload = 75f;
            shootCone = 40f;
            rotateSpeed = 5f;
            targetAir = false;
            range = 180f;
            shootEffect = Fx.lightningShoot;
            heatColor = Color.red;
            recoil = 4f;
            size = 3;
            shootSound = Sounds.spark;
            consumePower(9f);
            coolant = consumeCoolant(0.4f);
        }};
    }
}

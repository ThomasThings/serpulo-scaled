package ss.content;

import arc.graphics.g2d.*;
import arc.math.*;
import arc.math.geom.*;
import mindustry.entities.*;
import static arc.graphics.g2d.Lines.*;
import static mindustry.Vars.*;

public class SSFx{
    public static final Rand rand = new Rand();
    public static final Vec2 v = new Vec2();

    public static final Effect


    doorOpenHuge = new Effect(10, e -> {
        stroke(e.fout() * 1.6f);
        Lines.square(e.x, e.y, e.rotation * tilesize / 2f + e.fin() * 2f);
    }),

    doorCloseHuge = new Effect(10, e -> {
        stroke(e.fout() * 1.6f);
        Lines.square(e.x, e.y, e.rotation * tilesize / 2f + e.fin() * 2f);
    }),

    doorOpenGigantic = new Effect(10, e -> {
        stroke(e.fout() * 1.6f);
        Lines.square(e.x, e.y, e.rotation * tilesize / 2f + e.fin() * 2f);
    }),

    doorCloseGigantic = new Effect(10, e -> {
        stroke(e.fout() * 1.6f);
        Lines.square(e.x, e.y, e.rotation * tilesize / 2f + e.fin() * 2f);
    });
}
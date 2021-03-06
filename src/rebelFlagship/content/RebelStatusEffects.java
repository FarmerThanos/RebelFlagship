package rebelFlagship.content;

import mindustry.ctype.ContentList;
import mindustry.type.StatusEffect;

public class RebelStatusEffects implements ContentList {
    public static StatusEffect breached, FTL_cooldown;

    public void load(){
        breached = new StatusEffect("breached"){{
           healthMultiplier = 0.7f;
           speedMultiplier = 0.8f;
           damageMultiplier = 0.8f;
           damage = 260f / 60f;
           show = true;
        }};

        FTL_cooldown = new StatusEffect("FTL_cooldown"){{
            show = true;
        }};
    }
}

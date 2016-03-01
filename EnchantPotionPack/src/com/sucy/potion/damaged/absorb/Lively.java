package com.sucy.potion.damaged.absorb;

import com.rit.sucy.service.SuffixGroups;
import com.sucy.potion.data.EnchantDefaults;
import com.sucy.potion.data.ItemSets;
import org.bukkit.plugin.Plugin;
import org.bukkit.potion.PotionEffectType;

/**
 * Gains movement speed when hit
 */
public class Lively extends PotionPassive {

    /**
     * Constructor
     *
     * @param plugin plugin reference
     */
    public Lively(Plugin plugin) {
        super(plugin, EnchantDefaults.LIVELY, ItemSets.BOOTS.getItems());
        description = "Grants bonus speed when hit";
        suffixGroups.add(SuffixGroups.SPEED.getKey());
    }

    /**
     * @return potion type applied by this enchantment
     */
    public PotionEffectType type() {
        return PotionEffectType.SPEED;
    }
}

package com.gildedrose.strategy;

import com.gildedrose.Item;

public class ConjuredItemStrategy implements ItemStrategy {
    @Override
    public void update(Item item) {
        if (item.quality > MINIMUM_QUALITY) {
            item.quality -= 2;
            if (item.quality < MINIMUM_QUALITY) {
                item.quality = MINIMUM_QUALITY;
            }
        }
        item.sellIn--;

        if (item.sellIn < EXPIRED_THRESHOLD && item.quality > MINIMUM_QUALITY) {
            item.quality -= 2;
            if (item.quality < MINIMUM_QUALITY) {
                item.quality = MINIMUM_QUALITY;
            }
        }
    }
}

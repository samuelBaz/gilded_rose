package com.gildedrose.strategy;

import com.gildedrose.Item;

public class NormalItemStrategy implements ItemStrategy {
    @Override
    public void update(Item item) {
        if (item.quality > MINIMUM_QUALITY) {
            item.quality--;
        }
        item.sellIn--;

        if (item.sellIn < EXPIRED_THRESHOLD && item.quality > MINIMUM_QUALITY) {
            item.quality--;
        }
    }
}

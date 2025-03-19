package com.gildedrose.strategy;

import com.gildedrose.Item;

import static com.gildedrose.utils.Constants.*;

public class NormalItemStrategy implements ItemStrategy {
    @Override
    public void updateQuality(Item item) {
        if (item.quality > MINIMUM_QUALITY) {
            item.quality--;
        }
        item.sellIn--;

        if (item.sellIn < EXPIRED_THRESHOLD && item.quality > MINIMUM_QUALITY) {
            item.quality--;
        }
    }
}

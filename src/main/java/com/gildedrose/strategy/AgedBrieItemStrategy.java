package com.gildedrose.strategy;

import com.gildedrose.Item;

public class AgedBrieItemStrategy implements ItemStrategy {
    @Override
    public void update(Item item) {
        if (item.quality < MAXIMUM_QUALITY) {
            item.quality++;
        }
        item.sellIn--;

//        if (item.sellIn < 0 && item.quality < 50) {
//            item.quality++;
//        }
    }
}


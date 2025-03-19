package com.gildedrose.strategy;

import com.gildedrose.Item;

import static com.gildedrose.utils.Constants.*;

public class AgedBrieItemStrategy implements ItemStrategy {
    @Override
    public void updateQuality(Item item) {
        if (item.quality < MAXIMUM_QUALITY) {
            item.quality++;
        }
        item.sellIn--;
    }
}


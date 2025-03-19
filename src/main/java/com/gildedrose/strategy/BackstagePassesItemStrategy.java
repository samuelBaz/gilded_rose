package com.gildedrose.strategy;

import com.gildedrose.Item;

import static com.gildedrose.utils.Constants.*;

public class BackstagePassesItemStrategy implements ItemStrategy {

    @Override
    public void updateQuality(Item item) {
        if (item.quality < MAXIMUM_QUALITY) {
            item.quality++;
            if (item.sellIn < 11 && item.quality < MAXIMUM_QUALITY) {
                item.quality++;
            }

            if (item.sellIn < 6 && item.quality < MAXIMUM_QUALITY) {
                item.quality++;
            }
        }
        item.sellIn--;

        if (item.sellIn < EXPIRED_THRESHOLD) {
            item.quality = MINIMUM_QUALITY;
        }
    }
}

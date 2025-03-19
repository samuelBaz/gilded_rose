package com.gildedrose.strategy;

import com.gildedrose.Item;

import static com.gildedrose.utils.Constants.*;

public class ConjuredItemStrategy implements ItemStrategy {
    @Override
    public void updateQuality(Item item) {
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
//explicar el proyecto, que es lo que se pidio, que es lo primero que se hizo y el patron que ocupamos and others pathern
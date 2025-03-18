package com.gildedrose;

public class ConjuredItemStrategy implements ItemStrategy {
    @Override
    public void update(Item item) {
        if (item.quality > 0) {
            item.quality -= 2;
            if (item.quality < 0) {
                item.quality = 0;
            }
        }
        item.sellIn--;

        if (item.sellIn < 0 && item.quality > 0) {
            item.quality -= 2;
            if (item.quality < 0) {
                item.quality = 0;
            }
        }
    }
}

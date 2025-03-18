package com.gildedrose;

public class BackstagePassesStrategy implements ItemStrategy {

    @Override
    public void update(Item item) {
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

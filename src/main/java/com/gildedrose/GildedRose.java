package com.gildedrose;

import com.gildedrose.strategy.ItemStrategy;
import com.gildedrose.strategy.ItemStrategyFactory;

class GildedRose {
    Item[] items;

    public GildedRose(Item[] items) {
        this.items = items;
    }

    public void updateQuality() {
        for (Item item : items) {
            ItemStrategy strategy = ItemStrategyFactory.getStrategy(item);
            strategy.update(item);
        }
    }
}
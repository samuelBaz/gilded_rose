package com.gildedrose.strategy;

import com.gildedrose.Item;

import java.util.HashMap;
import java.util.Map;

public class ItemStrategyFactory {
    private static final Map<String, ItemStrategy> strategies = new HashMap<>();

    static {
        strategies.put("Aged Brie", new AgedBrieItemStrategy());
        strategies.put("Backstage passes to a TAFKAL80ETC concert", new BackstagePassesItemStrategy());
        strategies.put("Sulfuras, Hand of Ragnaros", new SulfurasItemStrategy());
        strategies.put("Conjured", new ConjuredItemStrategy());
    }

    public static ItemStrategy getStrategy(Item item) {
        return strategies.getOrDefault(item.name, new NormalItemStrategy());
    }
}


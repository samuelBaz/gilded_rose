package com.gildedrose;

import java.util.HashMap;
import java.util.Map;

public class ItemStrategyFactory {
    private static final Map<String, ItemStrategy> strategies = new HashMap<>();

    static {
        strategies.put("Aged Brie", new AgedBrieStrategy());
        strategies.put("Backstage passes to a TAFKAL80ETC concert", new BackstagePassesStrategy());
        strategies.put("Sulfuras, Hand of Ragnaros", new SulfurasStrategy());
        strategies.put("Conjured", new ConjuredItemStrategy());
    }

    public static ItemStrategy getStrategy(Item item) {
        return strategies.getOrDefault(item.name, new NormalItemStrategy());
    }
}


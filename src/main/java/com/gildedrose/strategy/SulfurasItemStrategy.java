package com.gildedrose.strategy;

import com.gildedrose.Item;

public final class SulfurasItemStrategy implements ItemStrategy {
    @Override
    public void update(Item item) {
        // Sulfuras no cambia ni su calidad ni su sellIn
    }
}

package com.gildedrose;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class QualityTest {
    GildedRose app;
    Item[] items;

    @Test
    public void normalTest() {
        items = new Item[] { new Item("Tomatoe", 0, 10)};
        app = new GildedRose(items);
        app.updateQuality();
        assertEquals(app.items[0].quality, 8);
    }

    @Test
    public void quesoTest() {
        items = new Item[] { new Item("Aged Brie", 0, 11)};
        app = new GildedRose(items);
        app.updateQuality();
        assertEquals(app.items[0].quality, 12);
    }

    @Test
    public void agedBrysd() {
        Item[] items = new Item[] { new Item("Aged Brie", 0, 10), new Item("Backstage passes", 0, 10)};
        GildedRose app = new GildedRose(items.clone());
        int cantDays = 2;
        for (int i = 0; i <cantDays; i++) {
            app.updateQuality();
        }
        for (int i = 0; i <items.length; i++) {
//            assertEquals(app.items[i].quality, items2[i].quality-cantDays*2);
        }
    }
}

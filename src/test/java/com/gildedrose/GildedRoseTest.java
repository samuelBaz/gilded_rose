package com.gildedrose;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GildedRoseTest {

    @Test
    void qualityShouldNotExceed50WhenIncrementing() {
        Item[] items = new Item[] { new Item("Aged Brie", 5, 49) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(50, app.items[0].quality, "La calidad no debe superar 50.");
    }

    @Test
    void qualityShouldRemain50WhenAlreadyAt50() {
        Item[] items = new Item[] { new Item("Aged Brie", 5, 50) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(50, app.items[0].quality, "Si la calidad ya es 50, debe quedarse en 50.");
    }

    @Test
    void backstagePassesQualityShouldNotExceed50WhenIncreasing() {
        Item[] items = new Item[] { new Item("Backstage passes to a TAFKAL80ETC concert", 5, 49) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(50, app.items[0].quality, "Las entradas no deben superar 50 de calidad.");
    }

    @Test
    void sulfurasQualityShouldRemain80() {
        Item[] items = new Item[] { new Item("Sulfuras, Hand of Ragnaros", 5, 80) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(80, app.items[0].quality, "Sulfuras debe mantenerse en 80 de calidad.");
    }



    @Test
    void sulfurasQualityShouldRemain80WhenUpdated() {
        Item[] items = new Item[] { new Item("Sulfuras, Hand of Ragnaros", 5, 80) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(80, app.items[0].quality, "Sulfuras debe mantener su calidad en 80.");
    }

    @Test
    void sulfurasSellInShouldNotDecreaseWhenUpdated() {
        Item[] items = new Item[] { new Item("Sulfuras, Hand of Ragnaros", 5, 80) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(5, app.items[0].sellIn, "Sulfuras no debe reducir su SellIn.");
    }

    @Test
    void sulfurasQualityShouldRemainUnchangedWhenQualityIsDifferentFrom80() {
        Item[] items = new Item[] { new Item("Sulfuras, Hand of Ragnaros", 3, 70) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(70, app.items[0].quality, "Si la calidad de Sulfuras es incorrecta, debe permanecer igual.");
    }


    @Test
    void backstagePassesQualityIncreasesBy1WhenMoreThan10DaysLeft() {
        Item[] items = new Item[] { new Item("Backstage passes to a TAFKAL80ETC concert", 11, 20) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(21, app.items[0].quality, "La calidad debe aumentar en 1 cuando faltan más de 10 días.");
    }

    @Test
    void backstagePassesQualityIncreasesBy2When10DaysOrLessLeft() {
        Item[] items = new Item[] { new Item("Backstage passes to a TAFKAL80ETC concert", 10, 20) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(22, app.items[0].quality, "La calidad debe aumentar en 2 cuando faltan 10 días o menos.");
    }

    @Test
    void backstagePassesQualityIncreasesBy3When5DaysOrLessLeft() {
        Item[] items = new Item[] { new Item("Backstage passes to a TAFKAL80ETC concert", 5, 20) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(23, app.items[0].quality, "La calidad debe aumentar en 3 cuando faltan 5 días o menos.");
    }

    @Test
    void backstagePassesQualityDropsTo0AfterSellInPassed() {
        Item[] items = new Item[] { new Item("Backstage passes to a TAFKAL80ETC concert", 0, 20) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(0, app.items[0].quality, "La calidad debe ser 0 después de la fecha de venta.");
    }

    @Test
    void backstagePassesQualityNeverExceeds50() {
        Item[] items = new Item[] { new Item("Backstage passes to a TAFKAL80ETC concert", 5, 49) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(50, app.items[0].quality, "La calidad nunca debe superar 50.");
    }

}

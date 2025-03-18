package com.gildedrose;

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
//        for (int i = 0; i < items.length; i++) {
//            //TODO Si es objeto normal o sulfura
//            if (!items[i].name.equals("Aged Brie")
//                    && !items[i].name.equals("Backstage passes to a TAFKAL80ETC concert")) {
//                //TODO Si es objeto normal y la calidad es mayor a 0 se resta 1
//                if (items[i].quality > 0) {
//                    if (!items[i].name.equals("Sulfuras, Hand of Ragnaros")) {
//                        items[i].quality = items[i].quality - 1;
//                    }
//                }
//            }
//            //TODO Si es queso anhejo o backestage
//            else {
//                //TODO Si es menor a 50 se incrementa quality +1
//                if (items[i].quality < 50) {
//                    items[i].quality = items[i].quality + 1;
//                    //TODO Si es Backstage
//                    if (items[i].name.equals("Backstage passes to a TAFKAL80ETC concert")) {
//                        //TODO (10 - 6) -> quality +1 si no excede los 50
//                        if (items[i].sellIn < 11) {
//                            if (items[i].quality < 50) {
//                                items[i].quality = items[i].quality + 1;
//                            }
//                        }
//                        //TODO (5 - 0) -> quality +1 si no excede los 50
//                        if (items[i].sellIn < 6) {
//                            if (items[i].quality < 50) {
//                                items[i].quality = items[i].quality + 1;
//                            }
//                        }
//                    }
//                }
//            }
//
//            //TODO Si es objeto normal, queso anhejo o backstage (No sulfura) -> sellIn -1
//            if (!items[i].name.equals("Sulfuras, Hand of Ragnaros")) {
//                items[i].sellIn = items[i].sellIn - 1;
//            }
//
//            //TODO si sellIn < 0
//            if (items[i].sellIn < 0) {
//                //TODO si es objeto normal sulfura o backstage (no queso anhejo)
//                if (!items[i].name.equals("Aged Brie")) {
//                    //TODO si es objeto normal o sulfura
//                    if (!items[i].name.equals("Backstage passes to a TAFKAL80ETC concert")) {
//                        //TODO si la quality es > 0
//                        if (items[i].quality > 0) {
//                            // TODO si es normal
//                            if (!items[i].name.equals("Sulfuras, Hand of Ragnaros")) {
//                                items[i].quality = items[i].quality - 1;
//                            }
//                        }
//                    }
//                    //TODO si es backstage
//                    else {
//                        items[i].quality = items[i].quality - items[i].quality;
//                    }
//                }
//                //TODO si es Queso Anhejo
////                else {
////                    if (items[i].quality < 50) {
////                        items[i].quality = items[i].quality + 1;
////                    }
////                }
//            }
//        }
    }
}
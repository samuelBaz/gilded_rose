package com.gildedrose;

public interface ItemStrategy {
    int MINIMUM_QUALITY = 0;
    int MAXIMUM_QUALITY = 50;
    int EXPIRED_THRESHOLD = 0;

    void update(Item item);
}

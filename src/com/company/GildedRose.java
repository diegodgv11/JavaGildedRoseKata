
package com.company;

public class GildedRose {
    StoredItem[] items;

    public GildedRose(StoredItem[] items) {
        this.items = items;
    }

    public void updateQuality() {
        for (StoredItem item : items)
            item.update();
    }

}
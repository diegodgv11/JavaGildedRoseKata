package com.company.Items;

import com.company.StoredItem;

public final class AgedBrie extends StoredItem {

    public AgedBrie(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
        this.qualityRateChanging = 1;
    }

    @Override
    protected void increaseQuality() {
        quality += qualityRateChanging;
    }

}

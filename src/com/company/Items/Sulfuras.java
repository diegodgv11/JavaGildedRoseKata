package com.company.Items;

import com.company.StoredItem;

public final class Sulfuras extends StoredItem {

    public Sulfuras(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
        this.qualityRateChanging = 0;
    }

    @Override
    protected void increaseQuality() {
        quality += qualityRateChanging;
    }

}
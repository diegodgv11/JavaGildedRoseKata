package com.company.Items;

import com.company.Item;
import com.company.StoredItem;
import com.company.Updatable;

public final class Conjured extends StoredItem {

    public Conjured(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
        this.qualityRateChanging = 1;
    }

    @Override
    protected void decreaseQuality() {
        double nextQualityDifference = 4 * qualityRateChanging;
        if (quality >= nextQualityDifference)
            quality -= nextQualityDifference;
    }

    @Override
    protected void increaseQuality() {
        if (sellIn < 0) quality = 0;
        if (sellIn <= 5) qualityRateChanging = 2;
        if (sellIn <= 10) qualityRateChanging = 3;

        quality += qualityRateChanging;
    }

}
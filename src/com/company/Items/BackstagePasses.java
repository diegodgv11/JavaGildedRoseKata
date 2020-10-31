package com.company.Items;

import com.company.StoredItem;

public final class BackstagePasses extends StoredItem {

    public BackstagePasses(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
        this.qualityRateChanging = 1;
    }

    @Override
    protected void increaseQuality() {
        if (sellIn < 0) quality = 0;
        if (sellIn <= 5) qualityRateChanging = 2;
        if (sellIn <= 10) qualityRateChanging = 3;

        quality += qualityRateChanging;
    }

}

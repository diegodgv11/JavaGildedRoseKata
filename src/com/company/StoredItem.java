package com.company;

public abstract class StoredItem extends Item implements Updatable {

    protected double qualityRateChanging;

    public StoredItem(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }

    protected abstract void increaseQuality();

    protected void decreaseQuality() {
        double nextQualityDifference = 2 * qualityRateChanging;
        if (quality >= nextQualityDifference)
            quality -= nextQualityDifference;
    }

    @Override
    public void update() {
        if(sellIn < 0) decreaseQuality();
        else increaseQuality();
    }

}

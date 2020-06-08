package com.tdd.gildedrose;

public class Goods {
    private int sellLn;
    private int quality;

    public Goods(int sellLn, int quality) {
        this.sellLn = sellLn;
        this.quality = quality;
    }

    public void updateByDay() {
        sellLn--;
        if (quality > 0) {
            quality--;
        }
        if (sellLn < 0) {
            quality--;
        }
    }

    public int getSellLn() {
        return sellLn;
    }

    public int getQuality() {
        return quality;
    }
}

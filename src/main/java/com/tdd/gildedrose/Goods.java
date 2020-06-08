package com.tdd.gildedrose;

public class Goods {
    private GoodsType type;
    private int sellLn;
    private int quality;

    public Goods(GoodsType type, int sellLn, int quality) {
        this.type = type;
        this.sellLn = sellLn;
        this.quality = quality;
    }

    public void updateByDay() {
        sellLn--;
        decreaseQuality();
        if (sellLn < 0) {
            decreaseQuality();
        }
    }

    private void decreaseQuality() {
        if (quality > 0) {
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

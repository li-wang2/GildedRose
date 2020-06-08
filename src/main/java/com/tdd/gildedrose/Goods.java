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
        switch (type) {
            case Common:
                sellLn--;
                decreaseQuality();
                if (sellLn < 0) {
                    decreaseQuality();
                }
                break;
            case BackstagePass:
                sellLn--;
                if (sellLn < 5) {
                    increaseQuality(3);
                } else if (sellLn < 10) {
                    increaseQuality(2);
                } else {
                    decreaseQuality();
                }
                break;
            default:
        }

    }

    private void decreaseQuality() {
        if (quality > 0) {
            quality--;
        }
    }

    private void increaseQuality(int count) {
        quality = quality + count;
    }

    public int getSellLn() {
        return sellLn;
    }

    public int getQuality() {
        return quality;
    }
}

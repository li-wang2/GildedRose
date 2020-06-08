package com.tdd.gildedrose;

public class Goods {
    protected int sellLn;
    protected int quality;

    public Goods(int sellLn, int quality) {
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

//    public void updateByDay() {
//        switch (type) {
//            case Common:
//                sellLn--;
//                decreaseQuality();
//                if (sellLn < 0) {
//                    decreaseQuality();
//                }
//                break;
//            case BackstagePass:
//                sellLn--;
//                if (sellLn < 0) {
//                    quality = 0;
//                } else if (sellLn < 5) {
//                    increaseQuality(3);
//                } else if (sellLn < 10) {
//                    increaseQuality(2);
//                } else {
//                    decreaseQuality();
//                }
//                break;
//            default:
//        }
//
//    }

    protected void decreaseQuality() {
        if (quality > 0) {
            quality--;
        }
    }

    protected void increaseQuality(int count) {
        quality = quality + count;
    }

    public int getSellLn() {
        return sellLn;
    }

    public int getQuality() {
        return quality;
    }
}

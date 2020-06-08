package com.tdd.gildedrose;

public class BackstagePass extends Goods {

    public BackstagePass(int sellLn, int quality) {
        super(sellLn, quality);
    }

    public void updateByDay() {
        sellLn--;
        if (sellLn < 0) {
            quality = 0;
        } else if (sellLn < 5) {
            increaseQuality(3);
        } else if (sellLn < 10) {
            increaseQuality(2);
        } else {
            decreaseQuality();
        }
    }
}

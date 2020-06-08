package com.tdd.gildedrose;

import org.junit.Assert;
import org.junit.Test;

public class GoodsTest {

    @Test
    public void should_decrease_sellLn_from_3_to_2_and_quality_from_10_to_9_when_update_by_day() {
        int sellLn = 3;
        int quality = 10;
        Goods goods = new Goods(sellLn, quality);

        goods.updateByDay();

        Assert.assertEquals(2, goods.getSellLn());
        Assert.assertEquals(9, goods.getQuality());
    }

    @Test
    public void should_decrease_sellLn_from_3_to_2_and_quality_from_0_to_0_when_update_by_day() {
        int sellLn = 3;
        int quality = 0;
        Goods goods = new Goods(sellLn, quality);

        goods.updateByDay();

        Assert.assertEquals(2, goods.getSellLn());
        Assert.assertEquals(0, goods.getQuality());
    }

    @Test
    public void should_decrease_sellLn_from_expired_1_to_expired_2_and_quality_from_10_to_8_when_update_by_day() {
        int sellLn = -1;
        int quality = 10;
        Goods goods = new Goods(sellLn, quality);

        goods.updateByDay();

        Assert.assertEquals(-2, goods.getSellLn());
        Assert.assertEquals(8, goods.getQuality());
    }
}

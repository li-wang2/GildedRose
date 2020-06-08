package com.tdd.gildedrose;

import org.junit.Assert;
import org.junit.Test;

public class BackstagePassGoodsTest {

    @Test
    public void should_decrease_sellLn_from_3_to_2_and_quality_from_10_to_9_when_update_by_day_and_sellLn_greater_than_10() {
        int sellLn = 15;
        int quality = 10;
        Goods goods = new Goods(GoodsType.BackstagePass, sellLn, quality);

        goods.updateByDay();

        Assert.assertEquals(14, goods.getSellLn());
        Assert.assertEquals(9, goods.getQuality());
    }
}

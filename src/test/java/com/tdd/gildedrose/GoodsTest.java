package com.tdd.gildedrose;

import org.junit.Assert;
import org.junit.Test;

public class GoodsTest {

    @Test
    public void should_decrease_1_to_sellLn_and_quality_when_update_by_day() {
        int sellLn = 3;
        int quality = 10;
        Goods goods = new Goods(sellLn, quality);

        goods.updateByDay();

        Assert.assertEquals(2, goods.getSellLn());
        Assert.assertEquals(9, goods.getQuality());
    }
}

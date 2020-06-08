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

    @Test
    public void should_decrease_sellLn_from_10_to_9_and_quality_increase_2_from_10_to_12_when_update_by_day_and_sellLn_less_than_10() {
        int sellLn = 10;
        int quality = 10;
        Goods goods = new Goods(GoodsType.BackstagePass, sellLn, quality);

        goods.updateByDay();

        Assert.assertEquals(9, goods.getSellLn());
        Assert.assertEquals(12, goods.getQuality());
    }

    @Test
    public void should_decrease_sellLn_from_5_to_4_and_quality_increase_3_from_10_to_13_when_update_by_day_and_sellLn_less_than_5() {
        int sellLn = 5;
        int quality = 10;
        Goods goods = new Goods(GoodsType.BackstagePass, sellLn, quality);

        goods.updateByDay();

        Assert.assertEquals(4, goods.getSellLn());
        Assert.assertEquals(13, goods.getQuality());
    }

    @Test
    public void should_decrease_sellLn_from_0_to_expired_1_and_quality_decrease_from_10_to_0_when_backstage_pass_expire() {
        int sellLn = 0;
        int quality = 10;
        Goods goods = new Goods(GoodsType.BackstagePass, sellLn, quality);

        goods.updateByDay();

        Assert.assertEquals(-1, goods.getSellLn());
        Assert.assertEquals(0, goods.getQuality());
    }

    @Test
    public void should_decrease_sellLn_from_expired_1_to_expired_2_and_quality_from_0_to_0_when_backstage_pass_expire() {
        int sellLn = -1;
        int quality = 0;
        Goods goods = new Goods(GoodsType.BackstagePass, sellLn, quality);

        goods.updateByDay();

        Assert.assertEquals(-2, goods.getSellLn());
        Assert.assertEquals(0, goods.getQuality());
    }
}

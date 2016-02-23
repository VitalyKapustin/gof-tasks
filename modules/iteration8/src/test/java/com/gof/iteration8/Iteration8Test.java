package com.gof.iteration8;

import com.gof.customer.core.DataAPI;
import com.gof.iteration8.builder.DataADataAPIBuilder;
import com.gof.iteration8.builder.DataAPIBuilder;
import com.gof.iteration8.builder.DataBDataAPIBuilder;
import org.junit.Assert;
import org.junit.Test;

public class Iteration8Test {

    @Test
    public void testRun() {
        Iteration8.run();
    }

    @Test(expected = IllegalArgumentException.class)
    public void testDataADataAPIBuilder1() {
        DataAPIBuilder dataAPIBuilder = new DataADataAPIBuilder(1L);
        dataAPIBuilder
                .setDataMX("123")
                .setDataSX("abc")
                .setDataFX("abc")
                .build();
    }

    @Test
    public void testDataADataAPIBuilder2() {
        DataAPIBuilder dataAPIBuilder = new DataADataAPIBuilder(1L);
        dataAPIBuilder
                .setDataMX("abc")
                .setDataSX("abc")
                .setDataFX("abc")
                .build();
    }

    @Test
    public void testDataBDataAPIBuilder() {
        DataAPIBuilder dataAPIBuilder = new DataBDataAPIBuilder(1L);
        dataAPIBuilder
                .setDataMX("123")
                .setDataFX("abc")
                .setDataBX("abc")
                .setDataSX("123abc")
                .build();
        DataAPI data = dataAPIBuilder.build();
        Assert.assertEquals(1L, data.getId().longValue());
        Assert.assertEquals("123", data.getDataMX());
        Assert.assertEquals("abc", data.getDataFX());
        Assert.assertEquals("abc", data.getDataBX());
        Assert.assertEquals("123abc", data.getDataSX());
    }

    @Test
    public void testDataCDataAPIBuilder() {
        DataAPIBuilder dataAPIBuilder = new DataBDataAPIBuilder(1L);
        dataAPIBuilder
                .setDataMX("123")
                .setDataFX("abc")
                .setDataBX("abc")
                .setDataSX("123abc")
                .build();
        DataAPI data = dataAPIBuilder.build();
        Assert.assertEquals(1L, data.getId().longValue());
        Assert.assertEquals("123", data.getDataMX());
        Assert.assertEquals("abc", data.getDataFX());
        Assert.assertEquals("abc", data.getDataBX());
        Assert.assertEquals("123abc", data.getDataSX());
    }
}
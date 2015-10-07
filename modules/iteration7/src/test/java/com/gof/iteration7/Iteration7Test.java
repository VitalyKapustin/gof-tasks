package com.gof.iteration7;

import com.gof.customer.core.DataAPI;
import com.gof.customer.data.TypeOfData;
import com.gof.iteration7.factory.HeavyDataAPIFactory;
import com.gof.iteration7.factory.LightDataAPIFactory;
import org.junit.Assert;
import org.junit.Test;

public class Iteration7Test {

    @Test
    public void testRun() {
        Iteration7.run();
    }

    @Test
    public void testLightDataAPIFactory() {
        DataAPI data = new LightDataAPIFactory().create();
        Assert.assertNotNull(data.getId());
        Assert.assertTrue(data.getDataFX().matches("[a-zA-Z]+"));
        Assert.assertNull(data.getDataBX());
        Assert.assertNull(data.getDataMX());
        Assert.assertNull(data.getDataSX());
        Assert.assertEquals(TypeOfData.LIVE, data.getTypeOfData());
    }

    @Test
    public void testHeavyDataAPIFactory() {
        DataAPI data = new HeavyDataAPIFactory().create();
        Assert.assertNotNull(data.getId());
        Assert.assertTrue(data.getDataFX().matches("[0-9]+"));
        Assert.assertTrue(data.getDataMX().matches("[0-9]+"));
        Assert.assertTrue(data.getDataSX().matches("[0-9]+"));
        Assert.assertTrue(data.getDataBX().matches("[0-9]+"));
        Assert.assertEquals(TypeOfData.LIVE, data.getTypeOfData());
    }
}
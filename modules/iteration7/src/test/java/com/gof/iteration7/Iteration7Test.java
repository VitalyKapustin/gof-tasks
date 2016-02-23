package com.gof.iteration7;

import com.gof.customer.core.DataAPI;
import com.gof.customer.data.TypeOfData;
import com.gof.iteration7.factory.DataAPIFactory;
import com.gof.iteration7.factory.DataAPIFactoryImpl;
import org.junit.Assert;
import org.junit.Test;

public class Iteration7Test {

    private DataAPIFactory dataAPIFactory = new DataAPIFactoryImpl();

    @Test
    public void testRun() {
        Iteration7.run();
    }

    @Test
    public void testLightDataAPIFactory() {
        DataAPI data = dataAPIFactory.createLightDataAPI();
        Assert.assertNotNull(data.getId());
        Assert.assertTrue(data.getDataFX().matches("[a-zA-Z]+"));
        Assert.assertNull(data.getDataBX());
        Assert.assertNull(data.getDataMX());
        Assert.assertNull(data.getDataSX());
        Assert.assertEquals(TypeOfData.LIVE, data.getTypeOfData());
    }

    @Test
    public void testHeavyDataAPIFactory() {
        DataAPI data = dataAPIFactory.createHeavyDataAPI();
        Assert.assertNotNull(data.getId());
        Assert.assertTrue(data.getDataFX().matches("[0-9]+"));
        Assert.assertTrue(data.getDataMX().matches("[0-9]+"));
        Assert.assertTrue(data.getDataSX().matches("[0-9]+"));
        Assert.assertTrue(data.getDataBX().matches("[0-9]+"));
        Assert.assertEquals(TypeOfData.LIVE, data.getTypeOfData());
    }
}
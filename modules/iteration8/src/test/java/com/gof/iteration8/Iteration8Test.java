package com.gof.iteration8;

import com.gof.customer.core.DataAPI;
import com.gof.iteration8.builder.DataADataAPIBuilder;
import com.gof.iteration8.builder.DataAPIBuilder;
import com.gof.iteration8.builder.DataBDataAPIBuilder;
import com.gof.iteration8.builder.DataCDataAPIBuilder;
import org.junit.Assert;
import org.junit.Test;

public class Iteration8Test {

    @Test
    public void testRun() {
        Iteration8.run();
    }

    @Test
    public void testDataADataAPIBuilder() {
        DataAPIBuilder dataAPIBuilder = new DataADataAPIBuilder();
        dataAPIBuilder.createNewDataAPIObject();
        dataAPIBuilder.build();
        DataAPI data = dataAPIBuilder.getDataAPI();
        Assert.assertNotNull(data.getId());
        Assert.assertTrue(data.getDataMX().matches("[a-zA-Z]+"));
        Assert.assertTrue(data.getDataSX().matches("[a-zA-Z]+"));
        Assert.assertNull(data.getDataFX());
        Assert.assertNull(data.getDataBX());
    }

    @Test
    public void testDataBDataAPIBuilder() {
        DataAPIBuilder dataAPIBuilder = new DataBDataAPIBuilder();
        dataAPIBuilder.createNewDataAPIObject();
        dataAPIBuilder.build();
        DataAPI data = dataAPIBuilder.getDataAPI();
        Assert.assertNotNull(data.getId());
        Assert.assertTrue(data.getDataFX().matches("[a-zA-Z]+"));
        Assert.assertTrue(data.getDataBX().matches("[a-zA-Z]+"));
        Assert.assertNull(data.getDataMX());
        Assert.assertNull(data.getDataSX());
    }

    @Test
    public void testDataCDataAPIBuilder() {
        DataAPIBuilder dataAPIBuilder = new DataCDataAPIBuilder();
        dataAPIBuilder.createNewDataAPIObject();
        dataAPIBuilder.build();
        DataAPI data = dataAPIBuilder.getDataAPI();
        Assert.assertNotNull(data.getId());
        Assert.assertTrue(data.getDataMX().matches("[0-9]+"));
        Assert.assertTrue(data.getDataSX().matches("[a-zA-Z]+"));
        Assert.assertTrue(data.getDataFX().matches("[a-zA-Z]+"));
        Assert.assertTrue(data.getDataBX().matches("[0-9]+"));
    }

    @Test
    public void testDataAPIDirector() {
        DataAPIDirector dataAPIDirector = new DataAPIDirector();
        dataAPIDirector.setDataAPIBuilder(new DataADataAPIBuilder());
        dataAPIDirector.constructDataAPI();
        DataAPI data = dataAPIDirector.getDataAPI();
        Assert.assertNotNull(data.getId());
        Assert.assertTrue(data.getDataMX().matches("[a-zA-Z]+"));
        Assert.assertTrue(data.getDataSX().matches("[a-zA-Z]+"));
        Assert.assertNull(data.getDataFX());
        Assert.assertNull(data.getDataBX());
    }
}
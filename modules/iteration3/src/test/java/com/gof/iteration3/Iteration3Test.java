package com.gof.iteration3;

import com.gof.customer.core.DataAPI;
import com.gof.customer.data.TypeOfData;
import org.junit.Assert;
import org.junit.Test;

public class Iteration3Test {

    @Test
    public void testRun() {
        Iteration3.run();
    }

    @Test
    public void testDataAPI2ComplexDataAPIAdapter() {
        DataAPI data = new DataAPI(1l, TypeOfData.LIVE, "testDataFX", "testDataMX", "testDataSX", "testDataBX");
        DataAPI2ComplexDataAPIAdapter adapter = new DataAPI2ComplexDataAPIAdapter(data);

        Assert.assertEquals("testDataFXtestDataMXtestDataSXtestDataBX", adapter.getComplexData());
    }
}
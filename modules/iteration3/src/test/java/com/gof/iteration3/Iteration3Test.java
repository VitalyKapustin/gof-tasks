package com.gof.iteration3;

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
        DataAPIAdapter adapter = new DataAPIAdapter(1l, TypeOfData.LIVE, "testDataFX", "testDataMX", "testDataSX", "testDataBX");
        Assert.assertEquals("testDataFXtestDataMXtestDataSXtestDataBX", adapter.getDataBX());
    }
}
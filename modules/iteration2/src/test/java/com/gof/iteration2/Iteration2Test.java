package com.gof.iteration2;

import com.gof.customer.core.DataAPI;
import com.gof.customer.data.TypeOfData;
import com.gof.iteration2.processor.DataAPIProcessor;
import com.gof.iteration2.processor.ErrDataAPIProcessor;
import com.gof.iteration2.processor.FakeDataAPIProcessor;
import com.gof.iteration2.processor.LiveDataAPIProcessor;
import com.gof.iteration2.processor.PreparedDataAPIProcessor;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Iteration2Test {

    private DataAPIProcessor dataAPIProcessor;

    @Before
    public void init() {
        /* create processor chain of responsibility for DataAPI */
        dataAPIProcessor = new LiveDataAPIProcessor();
        dataAPIProcessor.setNext(new PreparedDataAPIProcessor())
                .setNext(new FakeDataAPIProcessor())
                .setNext(new ErrDataAPIProcessor());
    }

    @Test
    public void testRun() {
        Iteration2.run();
    }

    @Test
    public void testLiveDataProcessing() {
        DataAPI data = new DataAPI(1l, "test", TypeOfData.LIVE);
        dataAPIProcessor.process(data);

        Assert.assertEquals("test1", data.getDataFX());
    }

    @Test
    public void testPreparedDataProcessing() {
        DataAPI data = new DataAPI(1l, "test", TypeOfData.PREPARED);
        dataAPIProcessor.process(data);

        Assert.assertEquals("test2", data.getDataFX());
    }

    @Test
    public void testFakeDataProcessing() {
        DataAPI data = new DataAPI(1l, "test", TypeOfData.FAKE);
        dataAPIProcessor.process(data);

        Assert.assertEquals("test3", data.getDataFX());
    }

    @Test
    public void testErrDataProcessing() {
        DataAPI data = new DataAPI(1l, "test", TypeOfData.ERR);
        dataAPIProcessor.process(data);

        Assert.assertEquals("test4", data.getDataFX());
    }
}
package com.gof.iteration4;

import com.gof.customer.data.TypeOfData;
import com.gof.iteration4.strategy.ErrDataStrategy;
import com.gof.iteration4.strategy.FakeDataStrategy;
import com.gof.iteration4.strategy.LiveDataStrategy;
import com.gof.iteration4.strategy.PreparedDataStrategy;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

public class Iteration4Test {

    @Test
    public void testRun() {
        Iteration4.run();
    }

    @Test
    public void testLiveDataStrategy() {
        DataStrategyContext dataStrategyContext = new DataStrategyContext(new LiveDataStrategy());
        Assert.assertEquals("test1test1test1", dataStrategyContext.executeStrategy("test0test0test0", TypeOfData.LIVE));
    }

    @Test
    public void testPreparedDataStrategy() {
        DataStrategyContext dataStrategyContext = new DataStrategyContext(new PreparedDataStrategy());
        Assert.assertEquals("test358test358test358", dataStrategyContext.executeStrategy("test0test0test0", TypeOfData.PREPARED));
    }

    @Test
    public void testFakeDataStrategy() {
        DataStrategyContext dataStrategyContext = new DataStrategyContext(new FakeDataStrategy());
        Assert.assertEquals("test#test#test#", dataStrategyContext.executeStrategy("test0test0test0", TypeOfData.FAKE));
    }

    @Test
    public void testErrDataStrategy() {
        DataStrategyContext dataStrategyContext = new DataStrategyContext(new ErrDataStrategy());
        Assert.assertEquals("testERtestERtestER", dataStrategyContext.executeStrategy("test0test0test0", TypeOfData.ERR));
    }
}
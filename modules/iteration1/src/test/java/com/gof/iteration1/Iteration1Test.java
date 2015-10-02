package com.gof.iteration1;

import com.gof.customer.RemoteOutputAPI;
import org.junit.Assert;
import org.junit.Test;

public class Iteration1Test  {

    @Test
    public void testRun() {
        Iteration1.run();
    }

    @Test
    public void testRemoteOutputAPISingleton() {
        RemoteOutputAPIFactory remoteOutputAPIFactory = RemoteOutputAPIFactoryImpl.getInstance();
        RemoteOutputAPI remoteOutputAPI1 = remoteOutputAPIFactory.getRemoteOutputAPI();
        RemoteOutputAPI remoteOutputAPI2 = remoteOutputAPIFactory.getRemoteOutputAPI();
        Assert.assertSame(remoteOutputAPI1, remoteOutputAPI2);
    }
}
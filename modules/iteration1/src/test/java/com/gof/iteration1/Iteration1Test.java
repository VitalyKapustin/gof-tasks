package com.gof.iteration1;

import com.gof.customer.RemoteOutputAPI;
import com.gof.iteration1.factory.RemoteOutputAPIFactory;
import com.gof.iteration1.factory.RemoteOutputAPIFactoryImpl;
import com.gof.iteration1.singleton.RemoteOutputAPISingleton;
import org.junit.Assert;
import org.junit.Test;

public class Iteration1Test  {

    @Test
    public void testRun() {
        Iteration1.run();
    }

    @Test
    public void testRemoteOutputAPISingletonFactoryMethod() {
        RemoteOutputAPIFactory remoteOutputAPIFactory = RemoteOutputAPIFactoryImpl.getInstance();
        RemoteOutputAPI remoteOutputAPI1 = remoteOutputAPIFactory.getRemoteOutputAPI();
        RemoteOutputAPI remoteOutputAPI2 = remoteOutputAPIFactory.getRemoteOutputAPI();
        Assert.assertSame(remoteOutputAPI1, remoteOutputAPI2);
    }

    @Test
    public void testRemoteOutputAPISingleton() {
        RemoteOutputAPI remoteOutputAPI1 = RemoteOutputAPISingleton.getInstance();
        RemoteOutputAPI remoteOutputAPI2 = RemoteOutputAPISingleton.getInstance();
        Assert.assertSame(remoteOutputAPI1, remoteOutputAPI2);
    }
}
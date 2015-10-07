package com.gof.iteration1.singleton;

import com.gof.customer.RemoteOutputAPI;
import com.gof.customer.core.DataAPI;

/**
 * Singleton pattern (2nd variant)
 * Created by vkapustin on 06.10.2015.
 */
public class RemoteOutputAPISingleton extends RemoteOutputAPI {

    private static class SingletonHolder {
        public static final RemoteOutputAPI INSTANCE = new RemoteOutputAPI();
    }

    public static RemoteOutputAPI getInstance() {
        return SingletonHolder.INSTANCE;
    }
}
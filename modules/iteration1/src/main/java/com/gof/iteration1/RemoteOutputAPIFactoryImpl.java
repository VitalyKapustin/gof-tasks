package com.gof.iteration1;

import com.gof.customer.RemoteOutputAPI;

/**
 * Used a singleton approach offered by Bill Pugh
 * Lazy singleton factory method
 * Created by vkapustin on 28.09.15.
 */
public class RemoteOutputAPIFactoryImpl implements RemoteOutputAPIFactory {

    private RemoteOutputAPI remoteOutputAPI;

    private static class SingletonHolder {
        public static final RemoteOutputAPIFactoryImpl INSTANCE = new RemoteOutputAPIFactoryImpl();
    }

    private RemoteOutputAPIFactoryImpl() { }

    public static RemoteOutputAPIFactoryImpl getInstance() {
        return SingletonHolder.INSTANCE;
    }

    @Override
    public RemoteOutputAPI getRemoteOutputAPI() {
        if (this.remoteOutputAPI == null) {
            synchronized (this) {
                if (this.remoteOutputAPI == null) {
                    this.remoteOutputAPI = new RemoteOutputAPI();
                }
            }
        }
        return this.remoteOutputAPI;
    }
}

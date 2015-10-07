package com.gof.iteration1.factory;

import com.gof.customer.RemoteOutputAPI;

/**
 * Lazy singleton factory method pattern (1st variant)
 * Created by vkapustin on 28.09.15.
 */
public interface RemoteOutputAPIFactory {

    public RemoteOutputAPI getRemoteOutputAPI();
}

package com.gof.iteration1;

import com.gof.customer.RemoteOutputAPI;

/**
 * Factory method pattern
 * Created by vkapustin on 28.09.15.
 */
public interface RemoteOutputAPIFactory {

    public RemoteOutputAPI getRemoteOutputAPI();
}

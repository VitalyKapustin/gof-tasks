package com.gof.iteration5;

import com.gof.customer.RemoteOutputAPI;
import com.gof.customer.core.Channel2;

public class Iteration5 {

    public static void run() {
        RemoteOutputAPI remoteOutputAPI = new RemoteOutputAPI();
        RemoteOutputAPIAcronisFacade remoteOutputAPIAcronis = new RemoteOutputAPIAcronisFacade();

        Channel2 channel2 = new Channel2();
        channel2.getDataAPI().stream().forEach(data -> {
            remoteOutputAPI.setOutputData(data);
            remoteOutputAPIAcronis.setOutputData(data);
        });
    }
}
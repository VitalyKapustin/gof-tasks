package com.gof.iteration3;

import com.gof.customer.RemoteOutputAPI;
import com.gof.customer.core.Channel2;
import com.gof.customer.core.DataAPI;

import java.util.List;

public class Iteration3 {

    public static void run() {
        Channel2 channel2 = new Channel2();
        RemoteOutputAPI remoteOutputAPI = new RemoteOutputAPI();
        channel2.getDataAPI().stream().forEach(data -> {
            DataAPI2ComplexDataAPIAdapter adapter = new DataAPI2ComplexDataAPIAdapter(data);
            data.setResultX(adapter.getComplexData());
            remoteOutputAPI.setOutputData(data);
        });
    }

}
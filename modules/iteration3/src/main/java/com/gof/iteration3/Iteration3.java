package com.gof.iteration3;

import com.gof.customer.RemoteOutputAPI;
import com.gof.customer.core.Channel2;

public class Iteration3 {

    public static void run() {
        Channel2 channel2 = new Channel2();
        RemoteOutputAPI remoteOutputAPI = new RemoteOutputAPI();
        channel2.getDataAPI().stream().forEach(data -> {
            DataAPIAdapter adapter = new DataAPIAdapter(
                    data.getId(),
                    data.getTypeOfData(),
                    data.getDataFX(),
                    data.getDataMX(),
                    data.getDataSX(),
                    data.getDataBX());
            data.setResultX(adapter.getDataBX());
            remoteOutputAPI.setOutputData(data);
        });
    }

}
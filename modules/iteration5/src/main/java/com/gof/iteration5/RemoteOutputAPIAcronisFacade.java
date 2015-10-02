package com.gof.iteration5;

import com.gof.customer.RemoteOutputAPIAcronis;
import com.gof.customer.core.DataAPI;

/**
 * Created by vkapustin on 01.10.15.
 */
public class RemoteOutputAPIAcronisFacade {

    private RemoteOutputAPIAcronis api = new RemoteOutputAPIAcronis();

    public void setOutputData(DataAPI data) {
        api.initSystem();
        api.preparingConnection();
        api.connect();
        api.sendMX(data.getDataMX());
        api.sendSX(data.getDataSX());
        api.sendBX(data.getDataBX());
        api.sendFX(data.getDataFX());
        api.stopSystem();
        api.checkErrors();
        api.disconnect();
    }
}

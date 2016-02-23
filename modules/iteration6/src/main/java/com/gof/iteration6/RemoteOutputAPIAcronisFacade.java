package com.gof.iteration6;

import com.gof.customer.RemoteOutputAPIAcronis;
import com.gof.customer.core.DataAPI;

/**
 * Created by vkapustin on 01.10.15.
 */
public class RemoteOutputAPIAcronisFacade extends Monitorable {

    public void setOutputData(DataAPI data) {
        RemoteOutputAPIAcronis.initSystem();
        RemoteOutputAPIAcronis.preparingConnection();
        RemoteOutputAPIAcronis.connect();
        RemoteOutputAPIAcronis.sendMX(data.getDataMX());
        RemoteOutputAPIAcronis.sendSX(data.getDataSX());
        RemoteOutputAPIAcronis.sendBX(data.getDataBX());
        RemoteOutputAPIAcronis.sendFX(data.getDataFX());
        RemoteOutputAPIAcronis.stopSystem();
        RemoteOutputAPIAcronis.checkErrors();
        RemoteOutputAPIAcronis.disconnect();
    }
}

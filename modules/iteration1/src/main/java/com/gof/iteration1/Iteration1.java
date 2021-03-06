package com.gof.iteration1;

import com.gof.customer.RemoteInputAPI;
import com.gof.customer.RemoteOutputAPI;
import com.gof.customer.core.DataAPI;
import com.gof.iteration1.factory.RemoteOutputAPIFactory;
import com.gof.iteration1.factory.RemoteOutputAPIFactoryImpl;

public class Iteration1 {

    private static final RemoteInputAPI RM_IN = new RemoteInputAPI();
    private static final RemoteOutputAPI RM_OUT = new RemoteOutputAPI();

    public static void run() {
        RemoteOutputAPIFactory remoteOutputAPIFactory = RemoteOutputAPIFactoryImpl.getInstance();
        RemoteOutputAPI remoteOutputAPI = remoteOutputAPIFactory.getRemoteOutputAPI();
        DataAPI inputData = RM_IN.getInputData();
        remoteOutputAPI.setOutputData(inputData.getId(), inputData.getDataFX());
    }

}

package com.gof.iteration7;

import com.gof.customer.RemoteOutputAPITesting;
import com.gof.customer.core.DataAPI;
import com.gof.iteration7.factory.DataAPIFactory;
import com.gof.iteration7.factory.DataAPIFactoryImpl;

public class Iteration7 {

    public static void run(){
        DataAPIFactory dataAPIFactory = new DataAPIFactoryImpl();

        DataAPI lightDataAPI1 = dataAPIFactory.createLightDataAPI();
        DataAPI lightDataAPI2 = dataAPIFactory.createLightDataAPI();
        DataAPI heavyDataAPI1 = dataAPIFactory.createHeavyDataAPI();
        DataAPI heavyDataAPI2 = dataAPIFactory.createHeavyDataAPI();

        RemoteOutputAPITesting remoteOutputAPITesting = new RemoteOutputAPITesting();
        remoteOutputAPITesting.setOutputData(lightDataAPI1);
        remoteOutputAPITesting.setOutputData(lightDataAPI2);
        remoteOutputAPITesting.setOutputData(heavyDataAPI1);
        remoteOutputAPITesting.setOutputData(heavyDataAPI2);
    }
}
package com.gof.iteration7;

import com.gof.customer.RemoteOutputAPITesting;
import com.gof.customer.core.DataAPI;
import com.gof.iteration7.factory.DataAPIFactory;
import com.gof.iteration7.factory.HeavyDataAPIFactory;
import com.gof.iteration7.factory.LightDataAPIFactory;

public class Iteration7 {

    public static void run(){
        DataAPIFactory lightDataAPIFactory = new LightDataAPIFactory();
        DataAPIFactory heavyDataAPIFactory = new HeavyDataAPIFactory();

        DataAPI lightDataAPI1 = lightDataAPIFactory.create();
        DataAPI lightDataAPI2 = lightDataAPIFactory.create();
        DataAPI heavyDataAPI1 = heavyDataAPIFactory.create();
        DataAPI heavyDataAPI2 = heavyDataAPIFactory.create();

        RemoteOutputAPITesting remoteOutputAPITesting = new RemoteOutputAPITesting();
        remoteOutputAPITesting.setOutputData(lightDataAPI1);
        remoteOutputAPITesting.setOutputData(lightDataAPI2);
        remoteOutputAPITesting.setOutputData(heavyDataAPI1);
        remoteOutputAPITesting.setOutputData(heavyDataAPI2);
    }
}
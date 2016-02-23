package com.gof.iteration8;

import com.gof.customer.RemoteOutputAPITesting;
import com.gof.iteration8.builder.DataAPIBuilder;
import com.gof.iteration8.builder.DataBDataAPIBuilder;

public class Iteration8 {

    public static void run() {
        RemoteOutputAPITesting remoteOutputAPITesting = new RemoteOutputAPITesting();

        DataAPIBuilder builder = new DataBDataAPIBuilder(1L);
        builder.setDataMX("123")
                .setDataFX("abc")
                .setDataBX("abc")
                .setDataSX("123abc");

        remoteOutputAPITesting.setOutputData(builder.build());
    }
}
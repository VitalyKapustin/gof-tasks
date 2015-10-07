package com.gof.iteration8;

import com.gof.customer.RemoteOutputAPITesting;
import com.gof.iteration8.builder.DataADataAPIBuilder;
import com.gof.iteration8.builder.DataAPIBuilder;
import com.gof.iteration8.builder.DataBDataAPIBuilder;

import java.util.ArrayList;
import java.util.List;

public class Iteration8 {

    public static void run() {
        DataAPIDirector dataAPIDirector = new DataAPIDirector();
        RemoteOutputAPITesting remoteOutputAPITesting = new RemoteOutputAPITesting();

        List<DataAPIBuilder> dataAPIBuilders = new ArrayList<>(3);
        dataAPIBuilders.add(new DataADataAPIBuilder());
        dataAPIBuilders.add(new DataBDataAPIBuilder());
        dataAPIBuilders.add(new DataBDataAPIBuilder());
        dataAPIBuilders.stream().forEach(builder -> {
            dataAPIDirector.setDataAPIBuilder(builder);
            dataAPIDirector.constructDataAPI();
            remoteOutputAPITesting.setOutputData(dataAPIDirector.getDataAPI());
        });
    }
}
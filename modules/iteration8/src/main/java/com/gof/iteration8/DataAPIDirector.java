package com.gof.iteration8;

import com.gof.customer.core.DataAPI;
import com.gof.iteration8.builder.DataAPIBuilder;

/**
 * Created by vkapustin on 06.10.2015.
 */
public class DataAPIDirector {

    private DataAPIBuilder dataAPIBuilder;

    public void setDataAPIBuilder(DataAPIBuilder dataAPIBuilder) {
        this.dataAPIBuilder = dataAPIBuilder;
    }

    public DataAPI getDataAPI() {
        return dataAPIBuilder.getDataAPI();
    }

    public void constructDataAPI() {
        dataAPIBuilder.createNewDataAPIObject();
        dataAPIBuilder.build();
    }
}

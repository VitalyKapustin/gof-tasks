package com.gof.iteration7.factory;

import com.gof.customer.core.DataAPI;

/**
 * Created by vkapustin on 06.10.2015.
 */
public interface DataAPIFactory {

    public DataAPI createHeavyDataAPI();

    public DataAPI createLightDataAPI();
}

package com.gof.iteration3;

import com.gof.customer.core.DataAPI;

/**
 * Adapter for {@link com.gof.customer.core.DataAPI}
 * Created by vkapustin on 30.09.15.
 */
public class DataAPI2ComplexDataAPIAdapter implements ComplexDataAPI {

    private DataAPI dataAPI;

    public DataAPI2ComplexDataAPIAdapter(DataAPI dataAPI) {
        dataAPI = dataAPI;
    }

    @Override
    public String getComplexData() {
        StringBuilder sb = new StringBuilder();
        sb.append(dataAPI.getDataFX());
        sb.append(dataAPI.getDataMX());
        sb.append(dataAPI.getDataSX());
        sb.append(dataAPI.getDataBX());
        return sb.toString();
    }
}

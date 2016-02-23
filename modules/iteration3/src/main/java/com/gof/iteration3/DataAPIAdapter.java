package com.gof.iteration3;

import com.gof.customer.core.DataAPI;
import com.gof.customer.data.TypeOfData;

/**
 * Adapter for {@link com.gof.customer.core.DataAPI}
 * Created by vkapustin on 30.09.15.
 */
public class DataAPIAdapter extends DataAPI {

    public DataAPIAdapter(Long id, TypeOfData typeOfData, String dataFX, String dataMX, String dataSX, String dataBX) {
        super(id, typeOfData, dataFX, dataMX, dataSX, dataBX);
    }

    @Override
    public String getDataMX() {
        return getComplexData();
    }

    @Override
    public String getDataSX() {
        return getComplexData();
    }

    @Override
    public String getDataBX() {
        return getComplexData();
    }

    @Override
    public String getDataFX() {
        return getComplexData();
    }

    private String getComplexData() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.getDataFX());
        sb.append(super.getDataMX());
        sb.append(super.getDataSX());
        sb.append(super.getDataBX());
        return sb.toString();
    }
}

package com.gof.iteration8.builder;

import com.gof.customer.core.DataAPI;

import java.util.Random;
import java.util.regex.Pattern;

/**
 * Created by vkapustin on 06.10.2015.
 */
public abstract class DataAPIBuilder {

    protected Pattern STRING_PATTERN = Pattern.compile("[a-zA-Z]+");
    protected Pattern NUMBER_PATTERN = Pattern.compile("[0-9]+");

    private Random random = new Random();

    protected DataAPI dataAPI;

    public DataAPIBuilder(Long id) {
        dataAPI = new DataAPI(id);
    }

    public DataAPIBuilder setDataMX(String dataMX) {
        if (!validateDataMX(dataMX)) {
            throw new IllegalArgumentException("DataMX is not valid");
        }
        dataAPI.setDataMX(dataMX);
        return this;
    }

    public DataAPIBuilder setDataSX(String dataSX) {
        if (!validateDataSX(dataSX)) {
            throw new IllegalArgumentException("DataSX is not valid");
        }
        dataAPI.setDataSX(dataSX);
        return this;
    }

    public DataAPIBuilder setDataFX(String dataFX) {
        if (!validateDataFX(dataFX)) {
            throw new IllegalArgumentException("DataFX is not valid");
        }
        dataAPI.setDataFX(dataFX);
        return this;
    }

    public DataAPIBuilder setDataBX(String dataBX) {
        if (!validateDataBX(dataBX)) {
            throw new IllegalArgumentException("DataBX is not valid");
        }
        dataAPI.setDataBX(dataBX);
        return this;
    }

    public DataAPI build() {
        return dataAPI;
    }

    protected abstract boolean validateDataMX(String data);
    protected abstract boolean validateDataSX(String data);
    protected abstract boolean validateDataFX(String data);
    protected abstract boolean validateDataBX(String data);

    protected boolean validateString(String data) {
        return STRING_PATTERN.matcher(data).matches();
    }

    protected boolean validateNumber(String data) {
        return NUMBER_PATTERN.matcher(data).matches();
    }
}

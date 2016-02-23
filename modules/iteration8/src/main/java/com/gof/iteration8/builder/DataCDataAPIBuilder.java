package com.gof.iteration8.builder;

/**
 * Created by vkapustin on 06.10.2015.
 */
public class DataCDataAPIBuilder extends DataAPIBuilder {

    public DataCDataAPIBuilder(Long id) {
        super(id);
    }

    @Override
    protected boolean validateDataMX(String data) {
        return validateNumber(data);
    }

    @Override
    protected boolean validateDataSX(String data) {
        return validateString(data);
    }

    @Override
    protected boolean validateDataFX(String data) {
        return validateString(data);
    }

    @Override
    protected boolean validateDataBX(String data) {
        return validateNumber(data);
    }
}

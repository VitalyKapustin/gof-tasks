package com.gof.iteration8.builder;

/**
 * Created by vkapustin on 06.10.2015.
 */
public class DataADataAPIBuilder extends DataAPIBuilder {

    public DataADataAPIBuilder(Long id) {
        super(id);
    }

    @Override
    protected boolean validateDataMX(String data) {
        return validateString(data);
    }

    @Override
    protected boolean validateDataSX(String data) {
        return validateString(data);
    }

    @Override
    protected boolean validateDataFX(String data) {
        return true;
    }

    @Override
    protected boolean validateDataBX(String data) {
        return true;
    }
}

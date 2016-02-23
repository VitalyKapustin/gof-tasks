package com.gof.iteration8.builder;

/**
 * Created by vkapustin on 06.10.2015.
 */
public class DataBDataAPIBuilder extends DataAPIBuilder {

    public DataBDataAPIBuilder(Long id) {
        super(id);
    }

    @Override
    protected boolean validateDataMX(String data) {
        return true;
    }

    @Override
    protected boolean validateDataSX(String data) {
        return true;
    }

    @Override
    protected boolean validateDataFX(String data) {
        return validateString(data);
    }

    @Override
    protected boolean validateDataBX(String data) {
        return validateString(data);
    }
}

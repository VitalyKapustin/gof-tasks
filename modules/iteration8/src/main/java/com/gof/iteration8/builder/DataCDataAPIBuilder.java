package com.gof.iteration8.builder;

/**
 * Created by vkapustin on 06.10.2015.
 */
public class DataCDataAPIBuilder extends DataAPIBuilder {

    @Override
    public void build() {
        dataAPI.setDataMX(getRandomNumber());
        dataAPI.setDataSX(getRandomString());
        dataAPI.setDataFX(getRandomString());
        dataAPI.setDataBX(getRandomNumber());
    }
}

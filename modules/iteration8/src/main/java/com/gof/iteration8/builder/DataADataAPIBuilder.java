package com.gof.iteration8.builder;

/**
 * Created by vkapustin on 06.10.2015.
 */
public class DataADataAPIBuilder extends DataAPIBuilder {

    @Override
    public void build() {
        dataAPI.setDataMX(getRandomString());
        dataAPI.setDataSX(getRandomString());
    }
}

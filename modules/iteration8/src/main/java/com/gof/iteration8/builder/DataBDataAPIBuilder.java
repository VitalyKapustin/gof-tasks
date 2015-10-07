package com.gof.iteration8.builder;

/**
 * Created by vkapustin on 06.10.2015.
 */
public class DataBDataAPIBuilder extends DataAPIBuilder {

    @Override
    public void build() {
        dataAPI.setDataFX(getRandomString());
        dataAPI.setDataBX(getRandomString());
    }
}

package com.gof.iteration8.builder;

import com.gof.customer.core.DataAPI;

import java.util.Random;

/**
 * Created by vkapustin on 06.10.2015.
 */
public abstract class DataAPIBuilder {

    private Random random = new Random();

    protected DataAPI dataAPI;

    public void createNewDataAPIObject() {
        dataAPI = new DataAPI(Math.abs(random.nextLong()));
    }

    public DataAPI getDataAPI() {
        return dataAPI;
    }

    public abstract void build();

    protected String getRandomString() {
        String abc = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 10; i++) {
            sb.append(abc.charAt(random.nextInt(26)));
        }
        return sb.toString();
    }

    protected String getRandomNumber() {
        return String.valueOf(Math.abs(random.nextInt()));
    }
}

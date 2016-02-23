package com.gof.iteration7.factory;

import com.gof.customer.core.DataAPI;
import com.gof.customer.data.TypeOfData;

import java.util.Random;

/**
 * Created by vkapustin on 06.10.2015.
 */
public class DataAPIFactoryImpl implements DataAPIFactory {

    private Random random = new Random();

    @Override
    public DataAPI createHeavyDataAPI() {
        return new DataAPI(Math.abs(random.nextLong()), TypeOfData.LIVE, String.valueOf(Math.abs(random.nextInt())), String.valueOf(Math.abs(random.nextInt())),
                String.valueOf(Math.abs(random.nextInt())), String.valueOf(Math.abs(random.nextInt())));
    }

    @Override
    public DataAPI createLightDataAPI() {
        String abc = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 10; i++) {
            sb.append(abc.charAt(random.nextInt(26)));
        }
        return new DataAPI(Math.abs(random.nextLong()), sb.toString(), TypeOfData.LIVE);
    }
}

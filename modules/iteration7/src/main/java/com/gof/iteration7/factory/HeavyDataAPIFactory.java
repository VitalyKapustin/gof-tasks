package com.gof.iteration7.factory;

import com.gof.customer.core.DataAPI;
import com.gof.customer.data.TypeOfData;

import java.util.Random;

/**
 * Created by vkapustin on 06.10.2015.
 */
public class HeavyDataAPIFactory implements DataAPIFactory {

    private Random random = new Random();

    @Override
    public DataAPI create() {
        return new DataAPI(Math.abs(random.nextLong()), TypeOfData.LIVE, String.valueOf(Math.abs(random.nextInt())), String.valueOf(Math.abs(random.nextInt())),
                String.valueOf(Math.abs(random.nextInt())), String.valueOf(Math.abs(random.nextInt())));
    }
}

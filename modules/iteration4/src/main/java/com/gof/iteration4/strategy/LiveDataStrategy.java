package com.gof.iteration4.strategy;

import com.gof.customer.core.DataAPI;
import com.gof.customer.data.TypeOfData;

/**
 * Created by vkapustin on 01.10.15.
 */
public class LiveDataStrategy implements DataStrategy {

    @Override
    public String execute(String data, TypeOfData dataType) {
        if (dataType == TypeOfData.LIVE) {
            return data.replace("0", "1");
        }
        return data;
    }
}

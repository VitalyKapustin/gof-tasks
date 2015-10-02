package com.gof.iteration4.strategy;

import com.gof.customer.core.DataAPI;
import com.gof.customer.data.TypeOfData;

/**
 * Created by vkapustin on 01.10.15.
 */
public interface DataStrategy {

    public String execute(String data, TypeOfData dataType);
}

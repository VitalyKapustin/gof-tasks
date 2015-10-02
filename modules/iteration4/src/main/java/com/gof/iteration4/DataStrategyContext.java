package com.gof.iteration4;

import com.gof.customer.data.TypeOfData;
import com.gof.iteration4.strategy.DataStrategy;

/**
 * Created by vkapustin on 01.10.15.
 */
public class DataStrategyContext {

    private DataStrategy dataStrategy;

    public DataStrategyContext(DataStrategy dataStrategy) {
        this.dataStrategy = dataStrategy;
    }

    public String executeStrategy(String data, TypeOfData dataType) {
        return dataStrategy.execute(data, dataType);
    }
}

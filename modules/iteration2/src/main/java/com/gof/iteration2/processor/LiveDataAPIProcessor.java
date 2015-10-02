package com.gof.iteration2.processor;

import com.gof.customer.core.DataAPI;
import com.gof.customer.data.TypeOfData;

/**
 * Created by vkapustin on 28.09.15.
 */
public class LiveDataAPIProcessor extends DataAPIProcessor {

    public LiveDataAPIProcessor() {
        super(TypeOfData.LIVE);
    }

    @Override
    protected void appendSymbol(DataAPI data) {
        data.setDataFX(data.getDataFX() + "1");
    }
}

package com.gof.iteration2.processor;

import com.gof.customer.core.DataAPI;
import com.gof.customer.data.TypeOfData;

/**
 * Created by vkapustin on 28.09.15.
 */
public class ErrDataAPIProcessor extends DataAPIProcessor {

    public ErrDataAPIProcessor() {
        super(TypeOfData.ERR);
    }

    @Override
    protected void appendSymbol(DataAPI data) {
        data.setDataFX(data.getDataFX() + "4");
    }
}

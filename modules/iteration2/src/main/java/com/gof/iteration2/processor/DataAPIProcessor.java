package com.gof.iteration2.processor;

import com.gof.customer.core.DataAPI;
import com.gof.customer.data.TypeOfData;

/**
 * Created by vkapustin on 28.09.15.
 */
public abstract class DataAPIProcessor {

    private TypeOfData typeOfData;
    protected DataAPIProcessor next;

    public DataAPIProcessor(TypeOfData typeOfData) {
        this.typeOfData = typeOfData;
    }

    public DataAPIProcessor setNext(DataAPIProcessor next) {
        this.next = next;
        return next;
    }

    public void process(DataAPI data) {
        if (typeOfData == data.getTypeOfData()) {
            appendSymbol(data);
        }
        if (next != null) {
            next.process(data);
        }
    }

    abstract protected void appendSymbol(DataAPI data);
}

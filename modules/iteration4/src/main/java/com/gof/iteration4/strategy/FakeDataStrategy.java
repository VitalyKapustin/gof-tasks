package com.gof.iteration4.strategy;

/**
 * Created by vkapustin on 01.10.15.
 */
public class FakeDataStrategy implements DataStrategy {

    @Override
    public String execute(String data) {
        return data.replace("0", "#");
    }
}

package com.gof.iteration4;

import com.gof.customer.RemoteOutputAPI;
import com.gof.customer.core.Channel2;
import com.gof.iteration4.strategy.LiveDataStrategy;

public class Iteration4 {

    public static void run() {
        DataStrategyContext dataStrategyContext = new DataStrategyContext(new LiveDataStrategy());

        Channel2 channel2 = new Channel2();
        RemoteOutputAPI remoteOutputAPI = new RemoteOutputAPI();
        channel2.getDataAPI().stream().forEach(data -> {
            StringBuilder sb = new StringBuilder();
            sb.append(dataStrategyContext.executeStrategy(data.getDataMX(), data.getTypeOfData()));
            sb.append(dataStrategyContext.executeStrategy(data.getDataSX(), data.getTypeOfData()));
            sb.append(dataStrategyContext.executeStrategy(data.getDataBX(), data.getTypeOfData()));
            sb.append(dataStrategyContext.executeStrategy(data.getDataFX(), data.getTypeOfData()));
            data.setDataFX(sb.toString());
            remoteOutputAPI.setOutputData(data);
        });
    }
}
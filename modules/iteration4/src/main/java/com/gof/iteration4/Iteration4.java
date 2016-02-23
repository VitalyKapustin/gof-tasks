package com.gof.iteration4;

import com.gof.customer.RemoteOutputAPI;
import com.gof.customer.core.Channel2;
import com.gof.customer.data.TypeOfData;
import com.gof.iteration4.strategy.ErrDataStrategy;
import com.gof.iteration4.strategy.FakeDataStrategy;
import com.gof.iteration4.strategy.LiveDataStrategy;
import com.gof.iteration4.strategy.PreparedDataStrategy;

import java.util.HashMap;
import java.util.Map;

public class Iteration4 {

    public static void run() {
        Map<TypeOfData, DataStrategyContext> contexts = new HashMap<>(4, 1);
        contexts.put(TypeOfData.ERR, new DataStrategyContext(new ErrDataStrategy()));
        contexts.put(TypeOfData.FAKE, new DataStrategyContext(new FakeDataStrategy()));
        contexts.put(TypeOfData.LIVE, new DataStrategyContext(new LiveDataStrategy()));
        contexts.put(TypeOfData.PREPARED, new DataStrategyContext(new PreparedDataStrategy()));

        Channel2 channel2 = new Channel2();
        RemoteOutputAPI remoteOutputAPI = new RemoteOutputAPI();
        channel2.getDataAPI().stream().forEach(data -> {
            DataStrategyContext context = contexts.get(data.getTypeOfData());
            StringBuilder sb = new StringBuilder();
            sb.append(context.executeStrategy(data.getDataMX()));
            sb.append(context.executeStrategy(data.getDataSX()));
            sb.append(context.executeStrategy(data.getDataBX()));
            sb.append(context.executeStrategy(data.getDataFX()));
            data.setDataFX(sb.toString());
            remoteOutputAPI.setOutputData(data);
        });
    }
}
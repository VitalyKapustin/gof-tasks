package com.gof.iteration2;

import com.gof.customer.RemoteOutputAPI;
import com.gof.customer.core.Channel1;
import com.gof.iteration2.processor.DataAPIProcessor;
import com.gof.iteration2.processor.ErrDataAPIProcessor;
import com.gof.iteration2.processor.FakeDataAPIProcessor;
import com.gof.iteration2.processor.LiveDataAPIProcessor;
import com.gof.iteration2.processor.PreparedDataAPIProcessor;

public class Iteration2 {

    public static void run() {
        /* create processor chain of responsibility for DataAPI */
        DataAPIProcessor dataAPIProcessor = new LiveDataAPIProcessor()
                .setNext(new PreparedDataAPIProcessor())
                .setNext(new FakeDataAPIProcessor())
                .setNext(new ErrDataAPIProcessor());

        /* use them */
        Channel1 channel1 = new Channel1();
        RemoteOutputAPI remoteOutputAPI = new RemoteOutputAPI();
        channel1.getDataAPI().stream().forEach(data -> {
            dataAPIProcessor.process(data);
            remoteOutputAPI.setOutputData(data);
        });
    }

}
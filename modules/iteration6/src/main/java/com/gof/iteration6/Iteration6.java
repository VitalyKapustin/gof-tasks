package com.gof.iteration6;

import com.gof.customer.core.Channel2;
import com.gof.iteration6.monitor.MonitorFR;
import com.gof.iteration6.monitor.MonitorSE;
import com.gof.iteration6.monitor.MonitorUK;
import com.gof.iteration6.monitor.MonitorUS;

public class Iteration6 {

    public static void run() {
        Channel2 channel2 = new Channel2();
        RemoteOutputAPIAcronisFacade remoteOutputAPIAcronis = new RemoteOutputAPIAcronisFacade();
        remoteOutputAPIAcronis.addMonitor(new MonitorFR());
        remoteOutputAPIAcronis.addMonitor(new MonitorSE());
        remoteOutputAPIAcronis.addMonitor(new MonitorUK());
        remoteOutputAPIAcronis.addMonitor(new MonitorUS());
        channel2.getDataAPI().stream().forEach(data -> {
            remoteOutputAPIAcronis.setOutputData(data);
            remoteOutputAPIAcronis.notifyMonitors("The data has been sent");
        });
    }
}

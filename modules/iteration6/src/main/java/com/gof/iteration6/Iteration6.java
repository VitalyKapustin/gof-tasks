package com.gof.iteration6;

import com.gof.customer.core.Channel2;
import com.gof.iteration6.monitor.MonitorFR;
import com.gof.iteration6.monitor.MonitorSE;
import com.gof.iteration6.monitor.MonitorUK;
import com.gof.iteration6.monitor.MonitorUS;

public class Iteration6 extends Monitorable {

    public static void run() {
        Iteration6 iteration6 = new Iteration6();
        iteration6.addMonitor(new MonitorFR());
        iteration6.addMonitor(new MonitorSE());
        iteration6.addMonitor(new MonitorUK());
        iteration6.addMonitor(new MonitorUS());

        Channel2 channel2 = new Channel2();
        RemoteOutputAPIAcronisFacade remoteOutputAPIAcronis = new RemoteOutputAPIAcronisFacade();
        channel2.getDataAPI().stream().forEach(data -> {
            remoteOutputAPIAcronis.setOutputData(data);
            iteration6.notifyMonitors("The data has been sent");
        });
    }
}

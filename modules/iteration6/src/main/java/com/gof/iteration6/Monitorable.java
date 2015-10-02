package com.gof.iteration6;

import com.gof.iteration6.monitor.Monitor;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by vkapustin on 02.10.15.
 */
public class Monitorable {

    private Set<Monitor> monitors = new HashSet<>();

    public synchronized void addMonitor(Monitor monitor) {
        if (monitor == null) {
            throw new NullPointerException();
        }
        monitors.add(monitor);
    }

    public synchronized void deleteMonitor(Monitor monitor) {
        monitors.remove(monitor);
    }

    public void notifyMonitors(String message) {
        for (Monitor monitor : monitors) {
            monitor.showMessage(message);
        }
    }
}
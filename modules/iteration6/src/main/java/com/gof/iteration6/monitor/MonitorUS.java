package com.gof.iteration6.monitor;

/**
 * Created by vkapustin on 02.10.15.
 */
public class MonitorUS implements Monitor {

    @Override
    public void showMessage(String message) {
        System.out.println("MonitorUS: " + message);
    }
}

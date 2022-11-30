package service;

import bean.Config;
import service.Process;

public interface SaveableProcess extends Process {
    public default void process() {
        processLogic();
        Config.save();
    }

}

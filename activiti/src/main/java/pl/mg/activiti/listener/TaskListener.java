package pl.mg.activiti.listener;

import org.activiti.engine.delegate.event.ActivitiEvent;
import org.activiti.engine.delegate.event.ActivitiEventListener;

public class TaskListener implements ActivitiEventListener {

    
    //zmiany na 2.1.0 after merge
    
    @Override
    public void onEvent(ActivitiEvent event) {
        // zmiany 2.0.0
    }

    @Override
    public boolean isFailOnException() {
        return false;
    }

}

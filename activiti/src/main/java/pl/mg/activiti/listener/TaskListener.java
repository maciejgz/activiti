package pl.mg.activiti.listener;

import org.activiti.engine.delegate.event.ActivitiEvent;
import org.activiti.engine.delegate.event.ActivitiEventListener;

public class TaskListener implements ActivitiEventListener {

    @Override
    public void onEvent(ActivitiEvent event) {
        // TODO Auto-generated method stub

    }

    @Override
    public boolean isFailOnException() {
        // TODO Auto-generated method stub
        return false;
    }

}

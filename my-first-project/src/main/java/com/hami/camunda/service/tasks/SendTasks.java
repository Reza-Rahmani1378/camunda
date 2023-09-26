package com.hami.camunda.service.tasks;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

public class SendTasks implements JavaDelegate {
    @Override
    public void execute(DelegateExecution execution) {
        System.out.println("Calling Another API!!!");
        System.out.println("My Local variable is : " +execution.getVariable("local-gender"));

    }
}

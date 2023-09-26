package com.hami.camunda.service.tasks;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

public class FinalCheck implements JavaDelegate {
    @Override
    public void execute(DelegateExecution execution) {
        System.out.println("I am in Final Check.");
        System.out.println("Global Gender is : " + execution.getVariable("global-gender"));
    }
}

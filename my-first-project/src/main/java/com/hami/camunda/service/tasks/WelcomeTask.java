package com.hami.camunda.service.tasks;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.Expression;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.camunda.bpm.model.bpmn.instance.ServiceTask;
import org.camunda.bpm.model.bpmn.instance.camunda.CamundaProperties;
import org.camunda.bpm.model.bpmn.instance.camunda.CamundaProperty;
import org.springframework.stereotype.Component;

@Component
public class WelcomeTask implements JavaDelegate {

    private Expression qaUrl;

    @Override
    public void execute(DelegateExecution execution) throws Exception {
        System.out.println("Welcome To the Hami System Sharif Company.");
        System.out.println("qaUrl=>" + qaUrl.getValue(execution));
        ServiceTask serviceTask = (ServiceTask) execution.getBpmnModelElementInstance();
        CamundaProperties camundaProperties = serviceTask.getExtensionElements().getElementsQuery().filterByType(CamundaProperties.class).singleResult();
        for (CamundaProperty camundaProperty : camundaProperties.getCamundaProperties()) {
            System.out.println("name=>" + camundaProperty.getCamundaName());
            System.out.println("value=>" + camundaProperty.getCamundaValue());
        }
    }
}

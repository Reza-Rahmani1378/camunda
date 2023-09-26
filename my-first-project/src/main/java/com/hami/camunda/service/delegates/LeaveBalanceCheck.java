package com.hami.camunda.service.delegates;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class LeaveBalanceCheck implements JavaDelegate {

    private static final Logger LOGGER = LoggerFactory.getLogger(LeaveBalanceCheck.class);

    private static final int LEAVE_BALANCE = 5;

    @Override
    public void execute(DelegateExecution delegateExecution){
        if (LEAVE_BALANCE > 0) {
            LOGGER.info("Employee has leave balance.");
        } else {
            LOGGER.error("Employee doesn't has leave balance.");
        }
    }
}

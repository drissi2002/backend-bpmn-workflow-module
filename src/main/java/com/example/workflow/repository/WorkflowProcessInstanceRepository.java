package com.example.workflow.repository;

import com.example.workflow.entity.Workflow;
import com.example.workflow.entity.WorkflowProcessInstance;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WorkflowProcessInstanceRepository extends JpaRepository<WorkflowProcessInstance,String> {
    WorkflowProcessInstance findByProcessInstanceId(String processInstanceId);
}

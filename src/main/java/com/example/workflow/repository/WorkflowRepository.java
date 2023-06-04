package com.example.workflow.repository;

import com.example.workflow.entity.Workflow;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface WorkflowRepository extends JpaRepository<Workflow,String> {
    Workflow findWorkflowByDeploymentId(String deploymentId);
    Optional<Workflow> findByName(String name);
}

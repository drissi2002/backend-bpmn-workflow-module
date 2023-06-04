/**
 **
 * Represents an instance of a workflow process.
 * A process instance is created when a workflow is started and contains
 * information about the current state of the workflow instance, such as its ID, key, and status.
 */

package com.example.workflow.entity;

import lombok.*;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class WorkflowProcessInstance {

    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    private String id;
    private String processInstanceId;
    private String processName;
    @ManyToOne(fetch = FetchType.EAGER)
    private Workflow workflow;
    /* This field is to tell whether the workflow process is suspended or not or finished */
    private String status;
}


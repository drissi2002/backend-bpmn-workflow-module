/**
 * Represents a form that can be filled out by a user.
 * A form entity contains information about the form's content
 * key, type, and any associated form data.
 */

package com.example.workflow.entity;

import lombok.*;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.List;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter

public class Form {

    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    private String id;
    @Column(name = "form_content", length = 1000000)
    private String formContent;
    @Column(name = "form_key", length = 10000)
    private String formKey;
    private String formType;
    @OneToMany(mappedBy = "form")
    private List<FormData> formDataList;
}

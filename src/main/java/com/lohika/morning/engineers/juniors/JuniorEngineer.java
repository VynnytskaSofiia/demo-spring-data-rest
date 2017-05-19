package com.lohika.morning.engineers.juniors;

import lombok.Data;
import lombok.Getter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.HashSet;
import java.util.Set;

@Data
@Document(collection = "juniors")
public class JuniorEngineer {

    @Id
    private String id;
    private String firstName;
    private String lastName;
    private Set<String> skills = new HashSet<>();
    private Integer yearsOfExperience;
    private String project;

}

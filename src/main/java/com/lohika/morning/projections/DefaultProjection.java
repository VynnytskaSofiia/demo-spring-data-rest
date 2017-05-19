package com.lohika.morning.projections;

import com.lohika.morning.engineers.juniors.JuniorEngineer;
import org.springframework.data.rest.core.config.Projection;

import java.util.Set;

@Projection(types = JuniorEngineer.class, name = "default")
public interface DefaultProjection {

    String getFirstName();

    String getLastName();

    Set<String> getSkills();

    Integer getYearsOfExperience();

}
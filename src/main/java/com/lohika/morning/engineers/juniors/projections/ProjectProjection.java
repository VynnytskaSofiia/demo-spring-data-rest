package com.lohika.morning.engineers.juniors.projections;


import com.lohika.morning.engineers.juniors.JuniorEngineer;
import org.springframework.data.rest.core.config.Projection;

@Projection(types = JuniorEngineer.class, name = "project")
public interface ProjectProjection extends MinimalProjection {

    String getProject();
}

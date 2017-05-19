package com.lohika.morning.engineers.juniors.projections;


import com.lohika.morning.engineers.juniors.JuniorEngineer;
import org.springframework.data.rest.core.config.Projection;

import java.util.Set;

@Projection(types = JuniorEngineer.class, name = "skills")
public interface SkillsProjection extends MinimalProjection {

    Set<String> getSkills();
}


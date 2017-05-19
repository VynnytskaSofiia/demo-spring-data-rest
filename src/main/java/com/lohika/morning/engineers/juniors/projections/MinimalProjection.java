package com.lohika.morning.engineers.juniors.projections;

import com.lohika.morning.engineers.juniors.JuniorEngineer;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.rest.core.config.Projection;

import java.util.Set;

@Projection(types = JuniorEngineer.class, name = "minimal")
public interface MinimalProjection {

    @Value("#{target.firstName} #{target.lastName}")
    String getFullName();

}

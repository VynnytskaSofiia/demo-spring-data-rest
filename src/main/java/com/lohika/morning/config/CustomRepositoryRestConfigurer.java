package com.lohika.morning.config;

import com.lohika.morning.projections.DefaultProjection;
import com.lohika.morning.engineers.juniors.JuniorEngineer;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurerAdapter;
import org.springframework.stereotype.Component;

@Component
public class CustomRepositoryRestConfigurer extends RepositoryRestConfigurerAdapter {

    @Override
    public void configureRepositoryRestConfiguration(final RepositoryRestConfiguration config) {
        config.getProjectionConfiguration().addProjection(DefaultProjection.class, "default", JuniorEngineer.class);
    }
}


package com.lohika.morning;

import com.lohika.morning.engineers.juniors.JuniorEngineer;
import com.lohika.morning.engineers.juniors.JuniorRepositoryRestController;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.Pageable;
import org.springframework.data.rest.webmvc.support.RepositoryEntityLinks;
import org.springframework.hateoas.Resource;
import org.springframework.hateoas.ResourceProcessor;
import org.springframework.hateoas.mvc.ControllerLinkBuilder;
import org.springframework.stereotype.Component;

import java.util.Objects;

@Component
@RequiredArgsConstructor
public class JuniorEngineerResourceProcessor implements ResourceProcessor<Resource<JuniorEngineer>> {

    private final RepositoryEntityLinks entityLinks;

    @Override
    public Resource<JuniorEngineer> process(final Resource<JuniorEngineer> resource) {

        JuniorEngineer juniorEngineer = resource.getContent();

        if (!juniorEngineer.getSkills().contains("Java 9")) {
            resource.add(ControllerLinkBuilder.linkTo(
                    ControllerLinkBuilder.methodOn(JuniorRepositoryRestController.class)
                            .addSkill(juniorEngineer.getId(), "Java 9")).withRel("add-java-9"));
        }

        if (Objects.isNull(juniorEngineer.getProject())) {
            resource.add(ControllerLinkBuilder.linkTo(
                    ControllerLinkBuilder.methodOn(JuniorRepositoryRestController.class)
                            .delete(juniorEngineer.getId())).withRel("delete"));
        }

        resource.add(entityLinks.linkFor(JuniorEngineer.class).withRel("juniors"));

        return resource;
    }
}

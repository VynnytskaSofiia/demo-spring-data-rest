package com.lohika.morning.engineers.juniors;

import com.lohika.morning.engineers.juniors.repositories.JuniorEngineerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.rest.webmvc.RepositoryRestController;
import org.springframework.data.rest.webmvc.support.RepositoryEntityLinks;
import org.springframework.hateoas.ExposesResourceFor;
import org.springframework.hateoas.Resource;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@RepositoryRestController
@ExposesResourceFor(JuniorEngineer.class)
@RequiredArgsConstructor
public class JuniorRepositoryRestController {

    private final RepositoryEntityLinks entityLinks;
    private final JuniorEngineerRepository seniorEngineerRepository;

    @ResponseBody
    @PostMapping(path = "/seniors/{id}/skill")
    public ResponseEntity addSkill(@PathVariable final String id,
                                   @RequestParam final String newSkill) {
        seniorEngineerRepository.addSkill(id, newSkill);
        final JuniorEngineer seniorEngineer = seniorEngineerRepository.findOne(id);
        Resource<JuniorEngineer> resource = new Resource<>(seniorEngineer);
        resource.add(entityLinks.linkToSingleResource(JuniorEngineer.class, id));

        return ResponseEntity.ok(resource);
    }

    @ResponseBody
    @PostMapping(path = "/seniors/{id}/delete")
    public ResponseEntity delete(@PathVariable final String id) {
        seniorEngineerRepository.delete(id);
        return ResponseEntity.noContent().build();
    }
}

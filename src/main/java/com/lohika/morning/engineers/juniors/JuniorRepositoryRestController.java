package com.lohika.morning.engineers.juniors;

import com.lohika.morning.engineers.juniors.services.JuniorService;
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
    private final JuniorService juniorService;

    @ResponseBody
    @PostMapping(path = "/juniors/{id}/skill")
    public ResponseEntity addSkill(@PathVariable final String id,
                                   @RequestParam final String newSkill) {
        final JuniorEngineer  juniorEngineer =  juniorService.addSkill(id, newSkill);
        Resource<JuniorEngineer> resource = new Resource<>(juniorEngineer);
        resource.add(entityLinks.linkToSingleResource(JuniorEngineer.class, id));

        return ResponseEntity.ok(resource);
    }

    @ResponseBody
    @PostMapping(path = "/juniors/{id}/delete")
    public ResponseEntity delete(@PathVariable final String id) {
        juniorService.delete(id);
        return ResponseEntity.noContent().build();
    }
}

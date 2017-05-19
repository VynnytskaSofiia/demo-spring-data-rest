package com.lohika.morning.engineers.juniors;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/juniors")
@RestController
@RequiredArgsConstructor
public class JuniorEngineerController {

    private final JuniorEngineerService engineerService;

    @PostMapping
    public ResponseEntity<JuniorEngineer> create(@RequestBody final JuniorEngineer engineer) {
        return new ResponseEntity<>(engineerService.create(engineer), HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<JuniorEngineer> getOne(@PathVariable final String id) {
        return ResponseEntity.ok(engineerService.get(id));
    }

    @PutMapping
    public ResponseEntity<JuniorEngineer> update(@RequestBody final JuniorEngineer engineer) {
        return ResponseEntity.ok(engineerService.update(engineer));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity delete(@PathVariable final String id) {
        engineerService.delete(id);
        return ResponseEntity.ok().build();
    }

    @GetMapping
    public Iterable<JuniorEngineer> getAll() {
        return engineerService.getAll();
    }

}

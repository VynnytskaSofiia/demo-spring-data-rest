package com.lohika.morning.engineers.juniors;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "juniors")
interface JuniorEngineerRepository extends CrudRepository<JuniorEngineer, String> {

}







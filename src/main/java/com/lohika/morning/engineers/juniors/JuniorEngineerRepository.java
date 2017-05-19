package com.lohika.morning.engineers.juniors;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

import java.util.List;

@RepositoryRestResource(path = "juniors")
interface JuniorEngineerRepository extends PagingAndSortingRepository<JuniorEngineer, String> {

    @Override
    @RestResource(exported = false)
    void delete(String Id);

    List<JuniorEngineer> findByProjectIsNull();
}







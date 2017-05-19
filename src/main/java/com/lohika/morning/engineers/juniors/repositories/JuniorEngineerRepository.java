package com.lohika.morning.engineers.juniors.repositories;

import com.lohika.morning.engineers.juniors.JuniorEngineer;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

import java.util.List;

@RepositoryRestResource(path = "juniors")
public interface JuniorEngineerRepository extends PagingAndSortingRepository<JuniorEngineer, String>, CustomRepository {

    @Override
    @RestResource(exported = false)
    void delete(String Id);

    List<JuniorEngineer> findByProjectIsNull();
}







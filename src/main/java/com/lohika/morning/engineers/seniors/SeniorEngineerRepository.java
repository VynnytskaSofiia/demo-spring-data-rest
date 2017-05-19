package com.lohika.morning.engineers.seniors;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

import java.util.List;

@RepositoryRestResource(path = "seniors")
interface SeniorEngineerRepository extends PagingAndSortingRepository<SeniorEngineer, String> {

}







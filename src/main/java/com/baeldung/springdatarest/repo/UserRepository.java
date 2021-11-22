package com.baeldung.springdatarest.repo;

import com.baeldung.springdatarest.models.WebsiteUser;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource(collectionResourceRel = "users", path = "users")
public interface UserRepository extends PagingAndSortingRepository<WebsiteUser, Long> {
    List<WebsiteUser> findByName(@Param("name") String name);
}

/*
This is an interface that allows you to perform various operations with WebsiteUser
objects. We also defined a custom query that will provide a list of users based on a
given name.

The @RepositoryRestResource annotation is optional and is used to customize the REST
endpoint. If we decided to omit it, Spring would automatically create an endpoint at
“/websiteUsers” instead of “/users“.
 */
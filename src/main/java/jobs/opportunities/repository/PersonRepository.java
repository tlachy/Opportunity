package jobs.opportunities.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import jobs.opportunities.entity.Person;

@RepositoryRestResource
public interface PersonRepository extends PagingAndSortingRepository<Person, Long> {

}

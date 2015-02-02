package jobs.opportunities.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import jobs.opportunities.entity.person.attributes.LastName;

@RepositoryRestResource(collectionResourceRel = "lastName", path = "lastName")
public interface LastNameRepository extends PagingAndSortingRepository<LastName, Long> {

}

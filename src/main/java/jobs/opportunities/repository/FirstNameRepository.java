package jobs.opportunities.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import jobs.opportunities.entity.person.attributes.FirstName;

@RepositoryRestResource(collectionResourceRel = "firstName", path = "firstName")
public interface FirstNameRepository extends PagingAndSortingRepository<FirstName, Long> {

}

package jobs.opportunities.repository;

import jobs.opportunities.entity.person.attributes.Nationality;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "nationality", path = "nationality")
public interface NationalityRepository extends PagingAndSortingRepository<Nationality, Long> {

}

package jobs.opportunities.repository;

import jobs.opportunities.entity.person.attributes.Religion;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "religion", path = "religion")
public interface ReligionRepository extends PagingAndSortingRepository<Religion, Long> {

}

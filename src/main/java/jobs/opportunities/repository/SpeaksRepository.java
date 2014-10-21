package jobs.opportunities.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import jobs.opportunities.entity.Speaks;

@RepositoryRestResource(collectionResourceRel = "speaks", path = "speaks")
public interface SpeaksRepository extends PagingAndSortingRepository<Speaks, Long> {

}

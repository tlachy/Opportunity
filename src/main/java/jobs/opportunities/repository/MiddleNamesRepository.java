package jobs.opportunities.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import jobs.opportunities.entity.MiddleNames;

@RepositoryRestResource(collectionResourceRel = "middleNames", path = "middleNames")
public interface MiddleNamesRepository extends PagingAndSortingRepository<MiddleNames, Long> {

}

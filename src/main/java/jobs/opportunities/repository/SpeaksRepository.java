package jobs.opportunities.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import jobs.opportunities.entity.Speaks;

@RepositoryRestResource
public interface SpeaksRepository extends PagingAndSortingRepository<Speaks, Long> {

}

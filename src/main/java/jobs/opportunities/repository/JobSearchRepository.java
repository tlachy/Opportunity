package jobs.opportunities.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import jobs.opportunities.entity.JobSearch;

@RepositoryRestResource(collectionResourceRel = "jobSearch", path = "jobSearch")
public interface JobSearchRepository extends PagingAndSortingRepository<JobSearch, Long> {

	@Query("SELECT js FROM JobSearch js WHERE js.person.id = :personId)")
	public JobSearch find(@Param("personId") long personId);

}

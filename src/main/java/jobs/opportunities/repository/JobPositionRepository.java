package jobs.opportunities.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import jobs.opportunities.entity.JobPosition;

@RepositoryRestResource(collectionResourceRel = "jobPosition", path = "jobPosition")
public interface JobPositionRepository extends PagingAndSortingRepository<JobPosition, Long> {

}

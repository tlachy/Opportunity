package jobs.opportunities.repository;

import jobs.opportunities.entity.CompletedEducation;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "completedEducation", path = "completedEducation")
public interface CompletedEducationRepository extends PagingAndSortingRepository<CompletedEducation, Long> {

}

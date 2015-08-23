package jobs.opportunities.repository;

import jobs.opportunities.entity.EducationInstitution;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "educationInstitution", path = "educationInstitution")
public interface EducationInstitutionRepository extends PagingAndSortingRepository<EducationInstitution, Long> {

}

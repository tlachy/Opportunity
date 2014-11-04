package jobs.opportunities.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import jobs.opportunities.entity.SpokenLanguage;

@RepositoryRestResource(collectionResourceRel = "spokenLanguage", path = "spokenLanguage")
public interface SpokenLanguageRepository extends PagingAndSortingRepository<SpokenLanguage, Long> {

}

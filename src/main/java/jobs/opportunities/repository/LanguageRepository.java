package jobs.opportunities.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import jobs.opportunities.entity.Language;

@RepositoryRestResource
public interface LanguageRepository extends PagingAndSortingRepository<Language, Long> {

}

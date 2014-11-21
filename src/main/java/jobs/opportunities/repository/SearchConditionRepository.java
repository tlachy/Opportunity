package jobs.opportunities.repository;


import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import jobs.opportunities.entity.SearchCondition;


@RepositoryRestResource(collectionResourceRel = "searchCondition", path = "searchCondition")
public interface SearchConditionRepository extends PagingAndSortingRepository<SearchCondition, Long> {

}

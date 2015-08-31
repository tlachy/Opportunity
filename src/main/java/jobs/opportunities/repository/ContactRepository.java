package jobs.opportunities.repository;

import jobs.opportunities.entity.Contact;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "contact", path = "contact")
public interface ContactRepository extends PagingAndSortingRepository<Contact, Long> {

}
